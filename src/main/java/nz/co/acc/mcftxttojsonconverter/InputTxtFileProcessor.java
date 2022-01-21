package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

import com.google.common.base.Splitter;

import nz.co.acc.mcftxttojsonconverter.model.AccreditedEmployer;
import nz.co.acc.mcftxttojsonconverter.model.ClaimMetaData;
import nz.co.acc.mcftxttojsonconverter.model.FileMetaData;

public class InputTxtFileProcessor {
	
	public void processInputTestFile(File file) throws Exception {
		Scanner fileScanner = new Scanner(file);
		
		FileMetaData fileMetaData = new FileMetaData();
		AccreditedEmployer accreditedEmployer = null;
		
		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			List<String> fields = Splitter.on("\t").splitToList(line);
			// Get the recordTag
			String recordType = fields.get(0);
			
			switch(recordType) {
			case ("#CLAIMSDATA"):
				accreditedEmployer = new AccreditedEmployer();
				ClaimMetaData claimMetaData = new ClaimMetaData();
				
				fileMetaData.addAccreditedEmployers(accreditedEmployer);
				fileMetaData.setFormatVersionStringValue(fields.get(1));
				claimMetaData.setEmployerACCNumber(fields.get(2));
				fileMetaData.setPeriodMonth(fields.get(4) != null? Integer.parseInt(fields.get(4)) : 0);
				fileMetaData.setPeriodYear(fields.get(5) != null? Integer.parseInt(fields.get(5)) : 0);
				//batch reference
				claimMetaData.setBatchReference(fields.get(6));
				//num of records
				claimMetaData.setNumberOfRecords(Integer.parseInt(fields.get(7)));
				accreditedEmployer.setClaimMetaData(claimMetaData);
				
				//file submission date
				fileMetaData.setFileSubmissionDate(fields.get(8));
				//ACC processing environment
				fileMetaData.setAccProcessingEnv(FileMetaData.AccProcessingEnv.valueOf(fields.get(9));
			}
		}
	}

}
