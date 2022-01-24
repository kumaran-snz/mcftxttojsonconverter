package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

import com.google.common.base.Splitter;

import nz.co.acc.mcftxttojsonconverter.model.AccreditedEmployer;
import nz.co.acc.mcftxttojsonconverter.model.Claim;
import nz.co.acc.mcftxttojsonconverter.model.ClaimHeaderRecord;
import nz.co.acc.mcftxttojsonconverter.model.ClaimMetaData;
import nz.co.acc.mcftxttojsonconverter.model.EmployeeRecord;
import nz.co.acc.mcftxttojsonconverter.model.FileMetaData;
import nz.co.acc.mcftxttojsonconverter.model.InjuryRecord;

public class InputTxtFileProcessor {

	public FileMetaData processInputTestFile(File file) throws Exception {
		Scanner fileScanner = new Scanner(file);

		FileMetaData fileMetaData = new FileMetaData();
		AccreditedEmployer accreditedEmployer = null;
		Claim claim = null;
		int claimDataCount = 0;

		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			List<String> fields = Splitter.on("\t").splitToList(line);
			// Get the recordTag
			String recordType = fields.get(0);

			switch (recordType) {
			case ("#CLAIMSDATA"):
				accreditedEmployer = new AccreditedEmployer();
				ClaimMetaData claimMetaData = new ClaimMetaData();

				if (claimDataCount == 0) {
					fileMetaData.setPeriodMonth(fields.get(4) != null ? Integer.parseInt(fields.get(4)) : 0);
					fileMetaData.setPeriodYear(fields.get(5) != null ? Integer.parseInt(fields.get(5)) : 0);
					// file submission date
					fileMetaData.setFileSubmissionDate(fields.get(8));
					fileMetaData.setAccProcessingEnv(FileMetaData.AccProcessingEnv.PROD);
				}
				fileMetaData.addAccreditedEmployers(accreditedEmployer);
				fileMetaData.setFormatVersion(FileMetaData.FormatVersion._3);
				claimMetaData.setEmployerACCNumber(fields.get(2));

				// batch reference
				claimMetaData.setBatchReference(fields.get(6));
				// num of records
				claimMetaData.setNumberOfRecords(Integer.parseInt(fields.get(7)));
				accreditedEmployer.setClaimMetaData(claimMetaData);

				break;

			case ("#CLAIMHEADER"):
				claim = new Claim();
				ClaimHeaderRecord claimHeaderRecord = new ClaimHeaderRecord();
				claim.setClaimHeaderRecord(claimHeaderRecord);
				accreditedEmployer.addClaimData(claim);

				claimHeaderRecord.setClaimNumber(fields.get(1));
				System.out.println("CN " + claimHeaderRecord.getClaimNumber());
				// Date Claim Lodged
				claimHeaderRecord.setDateClaimLodged(fields.get(2));
				// Record Format
				String recordFormat = fields.get(7);
				System.out.println("RF: " + recordFormat);
				switch (recordFormat) {
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
			case ("#INJURY"):
				InjuryRecord injuryRecord = new InjuryRecord();
				claim.setInjuryRecord(injuryRecord);

				// Date of Injury
				injuryRecord.setDateOfInjury(fields.get(1));
				// Time of injury
				String timeOfInjury = fields.get(2);
				if (isValidValue(timeOfInjury))
					injuryRecord.setTimeOfInjury(timeOfInjury);

				// Mechanism
				injuryRecord.setMechanism(fields.get(3));

				// Agency Of accident
				injuryRecord.setAgencyOfAccident(fields.get(4));

				// Location
				injuryRecord.setLocation(fields.get(5));

				// Geographic Location
				injuryRecord.setGeoLocation(fields.get(6));

				// Diagnosis of Injury
				injuryRecord.setDiagnosisOfInjuryFirst(fields.get(7));
				// Diagnosis Coding System - First
				injuryRecord.setDiagnosisCodingSystemFirst(fields.get(8));
				// Site of injury - First
				injuryRecord.setSiteOfInjuryFirst(fields.get(9));
				// Side of injury
				injuryRecord.setSideOfInjuryFirst(fields.get(10));

				// Diagnosis of Injury - Second
				if (fields.size() > 11) {
					injuryRecord.setDiagnosisOfInjurySecond(fields.get(11));
					// Diagnosis coding system - Second
					injuryRecord.setDiagnosisCodingSystemSecond(fields.get(12));
					// Site of injury - Second
					injuryRecord.setSiteOfInjurySecond(fields.get(13));
					// Side of injury - Second
					injuryRecord.setSideOfInjurySecond(fields.get(14));
				}
				if (fields.size() > 15) {
					// Diagnosis of Injury - Third
					injuryRecord.setDiagnosisOfInjuryThird(fields.get(15));
					// Diagnosis coding system - Third
					injuryRecord.setDiagnosisCodingSystemThird(fields.get(16));
					// Site of injury - Third
					injuryRecord.setSiteOfInjuryThird(fields.get(17));
					// Side of injury - Third
					injuryRecord.setSideOfInjuryThird(fields.get(18));
				}
				break;
				
			case ("#EMPLOYEE"):
				EmployeeRecord employeeRecord = new EmployeeRecord();
				claim.setEmployeeRecord(employeeRecord);
				
				// Surname
				employeeRecord.setSurname(fields.get(1));
				// Other names
				employeeRecord.setOtherNames(fields.get(2));
				// Address 1
				employeeRecord.setAddress1(fields.get(3));
				// Address 2
				employeeRecord.setAddress2(fields.get(4));
				// Address 3
				employeeRecord.setAddress3(fields.get(5));
				// Postcode
				employeeRecord.setPostcode(fields.get(6));
				// Occupation
				employeeRecord.setOccupation(fields.get(7));
				// Date of Birth
				employeeRecord.setDateOfBirth(fields.get(8));
				// Gender
				employeeRecord.setGender(fields.get(9));
				// Ethnicity
				String ethnicityValue = fields.get(10);
				if (isValidValue(ethnicityValue)) {
					employeeRecord.setEthnicity(Integer.parseInt(ethnicityValue));
				}
				// Employee PCU
				employeeRecord.setEmployeeCU(fields.get(11));
				// Employer Employee Id
				employeeRecord.setEmployersEmployeeId(fields.get(12));
				// Job classification
				if (fields.size() > 14)
					employeeRecord.setJobClassification(fields.get(14));
				
				//Employee Telephone 
				if (fields.size() > 15)
					employeeRecord.setPhone(fields.get(15));
				
				// Employee Email
				if (fields.size() > 16) 
					employeeRecord.setWorkEmail(fields.get(16));
				
				// Home email
				if (fields.size() > 17) 
					employeeRecord.setHomeEmail(fields.get(17));
				
				// @TODO : Need NHI Number
				break;
			}
		}

		return fileMetaData;
	}

	private boolean isValidValue(String value) {
		return (value != null && !"".equals(value));
	}
}
