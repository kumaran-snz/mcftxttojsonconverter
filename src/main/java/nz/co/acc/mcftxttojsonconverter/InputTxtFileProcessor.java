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
import nz.co.acc.mcftxttojsonconverter.model.IncapacityRecord;
import nz.co.acc.mcftxttojsonconverter.model.InjuryRecord;
import nz.co.acc.mcftxttojsonconverter.model.ReviewRecord;
import nz.co.acc.mcftxttojsonconverter.model.SummaryRecord;

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
				
			case ("#INCAPACITY"):
				IncapacityRecord incapacityRecord = new IncapacityRecord();
				claim.setIncapacityRecord(incapacityRecord);
				
				// Incapacity from Date
				incapacityRecord.setDateOfFirstIncapacity(fields.get(1));
				
				//@TODO:
				incapacityRecord.setReturnToWorkDuringIncapacityDate("");
				incapacityRecord.setEndOfIncapacityDate("");
				incapacityRecord.setDateFirstWeeklyCompensationPaymentMade("");
				incapacityRecord.setDateInitialNeedsAssessmentCompleted("");
				incapacityRecord.setDateIndividualRehabilitationPlanAgreed("");
				incapacityRecord.setDateOfSubsequentIncapacity("");
				incapacityRecord.setReturnToWorkDuringIncapacityType("");
				incapacityRecord.setEndOfIncapacityType("");
				incapacityRecord.setDateEntitlementStoppedNonCompliance("");
				incapacityRecord.setDateEntitlementReinstatedNonCompliance("");
				incapacityRecord.setNumberOfWeeklyCompensationDaysPaid(2);
				break;
				
			case ("#DISPUTES"):
				ReviewRecord reviewRecord = new ReviewRecord();
				claim.setReviewRecord(reviewRecord);
				
				reviewRecord.setReviewIdentifier("RI12345");
				// Nature of Dispute
				reviewRecord.setNatureOfReview(fields.get(1));
				
				//Date of filing
				reviewRecord.setDateReviewFiled(fields.get(2));
				
				// Who filed review
				reviewRecord.setWhoFiledReview(fields.get(3));
				
				// Review Outcome
				reviewRecord.setReviewOutcome(fields.get(6));
				
				// @TODO:
				// Administrative Outcome
				reviewRecord.setAdministrativeReviewOutcome("");
				// DateAESendsInformationToReviewer
				reviewRecord.setDateAeSendsInformationToReviewer("");
				// Case Conference Date
				reviewRecord.setCaseConferenceDate("");
				// Review Head	ing StartDate
				reviewRecord.setReviewHearingStartDate("");
				// Review Decision Date
				reviewRecord.setReviewDecisionDate("");
				break;
				
			case ("#SUMMARY"):
				SummaryRecord summaryRecord = new SummaryRecord();
				claim.setSummaryRecord(summaryRecord);
				// earningsRelatedCompensationFullUnabatedAmount
				String weeklyCompansationFullAmount = fields.get(1);
				if (isValidValue(weeklyCompansationFullAmount))
					summaryRecord.setWeeklyCompensationFullAmount(Double.parseDouble(weeklyCompansationFullAmount));
				// earningsRelatedCompensationAbatedNegative
				String weeklyCompensationAbated = fields.get(2);
				if (isValidValue(weeklyCompansationFullAmount))
					summaryRecord.setWeeklyCompensationAbated(Double.parseDouble(weeklyCompensationAbated));
				
				// Vocation Rehabilitation Assessment
				String vocationalRA = fields.get(3);
				if (isValidValue(vocationalRA))
					summaryRecord.setVocationalRehabilitationAssessment(Double.parseDouble(vocationalRA));
				
				// Independent Allowance
				String independateAllowance = fields.get(4);
				if (isValidValue(independateAllowance))
					summaryRecord.setIndependenceAllowance(Double.parseDouble(independateAllowance));
				
				// Independent Allowance Assessment
				String independentAllowanceAssessment = fields.get(5);
				if (isValidValue(independentAllowanceAssessment)) 
					summaryRecord.setIndependenceAllowanceAssessment(Double.parseDouble(independentAllowanceAssessment));
				
				String vocationalRSaE = fields.get(12);
				if (isValidValue(vocationalRSaE))
					summaryRecord.setVocationalRehabilitationServiceAndEquipment(Double.parseDouble(vocationalRSaE));
				
				String socialRehabAssesment = fields.get(13);
				if (isValidValue(socialRehabAssesment))
					summaryRecord.setSocialRehabilitationAssessment(Double.parseDouble(socialRehabAssesment));
				
				String socialRehabHomeHelp = fields.get(14);
				if (isValidValue(socialRehabHomeHelp))
					summaryRecord.setSocialRehabilitationHomeHelp(Double.parseDouble(socialRehabHomeHelp));
				
				String socialRehabAttendantCare = fields.get(15);
				if (isValidValue(socialRehabAttendantCare))
					summaryRecord.setSocialRehabilitationAttendantCare(Double.parseDouble(socialRehabAttendantCare));
				
				String socialRehabChildCare = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String socialRehabEquipment = fields.get(17);
				if (isValidValue(socialRehabEquipment))
					summaryRecord.setSocialRehabilitationEquipment(Double.parseDouble(socialRehabEquipment));
				
				String socialRehabModificationToHome = fields.get(18);
				if (isValidValue(socialRehabModificationToHome))
					summaryRecord.setSocialRehabilitationModificationsToHome(Double.parseDouble(socialRehabModificationToHome));
				
				String socialRehabModificationToVehicle = fields.get(19);
				if (isValidValue(socialRehabModificationToVehicle))
					summaryRecord.setSocialRehabilitationModificationsToVehicle(Double.parseDouble(socialRehabModificationToVehicle));
				
				String socialRehabTrainingEducation = fields.get(20);
				if (isValidValue(socialRehabTrainingEducation))
					summaryRecord.setSocialRehabilitationTrainingEducation(Double.parseDouble(socialRehabTrainingEducation));
				
				String socialRehabCapitalExpenditure = fields.get(21);
				if (isValidValue(socialRehabCapitalExpenditure))
					summaryRecord.setSocialRehabilitationCapitalExpenditureOther(Double.parseDouble(socialRehabCapitalExpenditure));
				
				String generalPractitioner = fields.get(22);
				if (isValidValue(generalPractitioner))
					summaryRecord.setGeneralPractitioner(Double.parseDouble(generalPractitioner));
				
				String physiotherapist = fields.get(23);
				if (isValidValue(physiotherapist))
					summaryRecord.setPhysiotherapist(Double.parseDouble(physiotherapist));
				
				String specialistConsultation = fields.get(24);
				if (isValidValue(specialistConsultation))
					summaryRecord.setSpecialistConsultation(Double.parseDouble(specialistConsultation));
				
				String nurse = fields.get(25);
				if (isValidValue(nurse))
					summaryRecord.setNurse(Double.parseDouble(nurse));
				
				String pharmaceutical = fields.get(26);
				if (isValidValue(pharmaceutical))
					summaryRecord.setPharmaceutical(Double.parseDouble(pharmaceutical));
				
				String radiology = fields.get(16);
				if (isValidValue(radiology))
					summaryRecord.setRadiology(Double.parseDouble(radiology));
				
				String audiologist = fields.get(16);
				if (isValidValue(audiologist))
					summaryRecord.setAudiologist(Double.parseDouble(audiologist));
				
				String acupuncturist = fields.get(16);
				if (isValidValue(acupuncturist))
					summaryRecord.setAcupuncturist(Double.parseDouble(acupuncturist));
				
				String chiropractor = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String counsellor = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String occupationalTherapist = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String dentalTreatment = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String osteopath = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String laboratoryCosts = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String speechTherapist = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String podiatrist = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String optometrist = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String otherMedicalTreatments = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String hospitalSurgical = fields.get(40);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String hospicalImplatsExcludingProcedureCost = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String hospitalOtherCosts = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String conveyanceForMedicalTreatmentEmergency = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String conveyanceForMedicalTreatmentNonEmergency = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String accomodationCost = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String escortCost = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String reviewCosts = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String misceallaneousCosts = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String lumpsum = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				
				String totalAmountPaidToDate = fields.get(16);
				if (isValidValue(socialRehabChildCare))
					summaryRecord.setSocialRehabilitationChildCare(Double.parseDouble(socialRehabChildCare));
				break;
			}
		}

		return fileMetaData;
	}

	private boolean isValidValue(String value) {
		return (value != null && !"".equals(value));
	}
}
