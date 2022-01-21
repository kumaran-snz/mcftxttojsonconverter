package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

import com.google.common.base.Splitter;

import nz.co.acc.mcftxttojsonconverter.model.AccreditedEmployer;
import nz.co.acc.mcftxttojsonconverter.model.ClaimHeaderRecord;
import nz.co.acc.mcftxttojsonconverter.model.ClaimMetaData;
import nz.co.acc.mcftxttojsonconverter.model.FileMetaData;

public class InputTxtFileProcessor {
	
	public FileMetaData processInputTestFile(File file) throws Exception {
		Scanner fileScanner = new Scanner(file);
		
		FileMetaData fileMetaData = new FileMetaData();
		AccreditedEmployer accreditedEmployer = null;
		int claimDataCount = 0;
		
		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			List<String> fields = Splitter.on("\t").splitToList(line);
			// Get the recordTag
			String recordType = fields.get(0);
			
			switch(recordType) {
			case ("#CLAIMSDATA"):
				accreditedEmployer = new AccreditedEmployer();
				ClaimMetaData claimMetaData = new ClaimMetaData();
				
				if (claimDataCount == 0) {
					fileMetaData.setPeriodMonth(fields.get(4) != null? Integer.parseInt(fields.get(4)) : 0);
					fileMetaData.setPeriodYear(fields.get(5) != null? Integer.parseInt(fields.get(5)) : 0);
					//file submission date
					fileMetaData.setFileSubmissionDate(fields.get(8));
					fileMetaData.setAccProcessingEnv(FileMetaData.AccProcessingEnv.PROD);
				}
				fileMetaData.addAccreditedEmployers(accreditedEmployer);
				fileMetaData.setFormatVersion(FileMetaData.FormatVersion._3);
				claimMetaData.setEmployerACCNumber(fields.get(2));
				
				//batch reference
				claimMetaData.setBatchReference(fields.get(6));
				//num of records
				claimMetaData.setNumberOfRecords(Integer.parseInt(fields.get(7)));
				accreditedEmployer.setClaimMetaData(claimMetaData);
				
				break;
			
			case("#CLAIMHEADER"):
				ClaimHeaderRecord claimHeaderRecord = new ClaimHeaderRecord();
				claimHeaderRecord.setClaimNumber(fields.get(1));
				System.out.println("CN " + claimHeaderRecord.getClaimNumber());
				//Date Claim Lodged
				claimHeaderRecord.setDateClaimLodged(fields.get(2));
				// Record Format
				String recordFormat = fields.get(7);
				System.out.println("RF: " + recordFormat);
				switch(recordFormat) {
					case "I":
						claimHeaderRecord.setRecordFormat(ClaimHeaderRecord.RecordFormat.I);
						break;
					case "U":
						claimHeaderRecord.setRecordFormat(ClaimHeaderRecord.RecordFormat.U);
						break;
					case "D":
						claimHeaderRecord.setRecordFormat(ClaimHeaderRecord.RecordFormat.D);
						break;
				}
				// Current claim administrator
				claimHeaderRecord.setCurrentClaimAdministrator(fields.get(8));
				// Outcome decision
				claimHeaderRecord.setOutcomeCoverDecision(fields.get(9));
				claimHeaderRecord.setAcc45Number(fields.get(10));
				break;
			}
		
		}
		
		return fileMetaData;
	} 
}
