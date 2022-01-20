
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Provides details of an employee’s incapacity resulting from an accident.
 * 
 */
@Generated("jsonschema2pojo")
public class IncapacityRecord {

    /**
     * The date of First Incapacity (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    @SerializedName("dateOfFirstIncapacity")
    @Expose
    private String dateOfFirstIncapacity;
    /**
     * The date the employee returns to work during incapacity period. May be full or partial return to work (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("returnToWorkDuringIncapacityDate")
    @Expose
    private String returnToWorkDuringIncapacityDate;
    /**
     * The date on which the incapacity ends (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("endOfIncapacityDate")
    @Expose
    private String endOfIncapacityDate;
    /**
     * First payment date (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateFirstWeeklyCompensationPaymentMade")
    @Expose
    private String dateFirstWeeklyCompensationPaymentMade;
    /**
     * Date that AE/TPA has completed the Initial Needs Assessment (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateInitialNeedsAssessmentCompleted")
    @Expose
    private String dateInitialNeedsAssessmentCompleted;
    /**
     * Date that AE/TPA has agreed/finalised the Individual Rehabilitation Plan (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateIndividualRehabilitationPlanAgreed")
    @Expose
    private String dateIndividualRehabilitationPlanAgreed;
    /**
     * Date of Subsequent Incapacity (DOSI) definition (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateOfSubsequentIncapacity")
    @Expose
    private String dateOfSubsequentIncapacity;
    /**
     * Nature of the RTW during incapacity Maybe full or partial return to work.
     * 
     */
    @SerializedName("returnToWorkDuringIncapacityType")
    @Expose
    private String returnToWorkDuringIncapacityType;
    /**
     * The reason the employee permanently returns to work.
     * 
     */
    @SerializedName("endOfIncapacityType")
    @Expose
    private String endOfIncapacityType;
    /**
     * Date Entitlement was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateEntitlementStoppedNonCompliance")
    @Expose
    private String dateEntitlementStoppedNonCompliance;
    /**
     * Date Entitlement was re-instated, after it was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateEntitlementReinstatedNonCompliance")
    @Expose
    private String dateEntitlementReinstatedNonCompliance;
    /**
     * The duration that the weekly compensation paid covers, regardless of whether the worker usually work part-time or full-time.
     * 
     */
    @SerializedName("numberOfWeeklyCompensationDaysPaid")
    @Expose
    private int numberOfWeeklyCompensationDaysPaid;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IncapacityRecord() {
    }

    /**
     * 
     * @param dateOfFirstIncapacity
     * @param returnToWorkDuringIncapacityDate
     * @param dateIndividualRehabilitationPlanAgreed
     * @param returnToWorkDuringIncapacityType
     * @param endOfIncapacityType
     * @param dateFirstWeeklyCompensationPaymentMade
     * @param dateEntitlementStoppedNonCompliance
     * @param endOfIncapacityDate
     * @param dateOfSubsequentIncapacity
     * @param dateEntitlementReinstatedNonCompliance
     * @param dateInitialNeedsAssessmentCompleted
     * @param numberOfWeeklyCompensationDaysPaid
     */
    public IncapacityRecord(String dateOfFirstIncapacity, String returnToWorkDuringIncapacityDate, String endOfIncapacityDate, String dateFirstWeeklyCompensationPaymentMade, String dateInitialNeedsAssessmentCompleted, String dateIndividualRehabilitationPlanAgreed, String dateOfSubsequentIncapacity, String returnToWorkDuringIncapacityType, String endOfIncapacityType, String dateEntitlementStoppedNonCompliance, String dateEntitlementReinstatedNonCompliance, int numberOfWeeklyCompensationDaysPaid) {
        super();
        this.dateOfFirstIncapacity = dateOfFirstIncapacity;
        this.returnToWorkDuringIncapacityDate = returnToWorkDuringIncapacityDate;
        this.endOfIncapacityDate = endOfIncapacityDate;
        this.dateFirstWeeklyCompensationPaymentMade = dateFirstWeeklyCompensationPaymentMade;
        this.dateInitialNeedsAssessmentCompleted = dateInitialNeedsAssessmentCompleted;
        this.dateIndividualRehabilitationPlanAgreed = dateIndividualRehabilitationPlanAgreed;
        this.dateOfSubsequentIncapacity = dateOfSubsequentIncapacity;
        this.returnToWorkDuringIncapacityType = returnToWorkDuringIncapacityType;
        this.endOfIncapacityType = endOfIncapacityType;
        this.dateEntitlementStoppedNonCompliance = dateEntitlementStoppedNonCompliance;
        this.dateEntitlementReinstatedNonCompliance = dateEntitlementReinstatedNonCompliance;
        this.numberOfWeeklyCompensationDaysPaid = numberOfWeeklyCompensationDaysPaid;
    }

    /**
     * The date of First Incapacity (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public String getDateOfFirstIncapacity() {
        return dateOfFirstIncapacity;
    }

    /**
     * The date of First Incapacity (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public void setDateOfFirstIncapacity(String dateOfFirstIncapacity) {
        this.dateOfFirstIncapacity = dateOfFirstIncapacity;
    }

    /**
     * The date the employee returns to work during incapacity period. May be full or partial return to work (Date Format = DDMMYYYY).
     * 
     */
    public String getReturnToWorkDuringIncapacityDate() {
        return returnToWorkDuringIncapacityDate;
    }

    /**
     * The date the employee returns to work during incapacity period. May be full or partial return to work (Date Format = DDMMYYYY).
     * 
     */
    public void setReturnToWorkDuringIncapacityDate(String returnToWorkDuringIncapacityDate) {
        this.returnToWorkDuringIncapacityDate = returnToWorkDuringIncapacityDate;
    }

    /**
     * The date on which the incapacity ends (Date Format = DDMMYYYY).
     * 
     */
    public String getEndOfIncapacityDate() {
        return endOfIncapacityDate;
    }

    /**
     * The date on which the incapacity ends (Date Format = DDMMYYYY).
     * 
     */
    public void setEndOfIncapacityDate(String endOfIncapacityDate) {
        this.endOfIncapacityDate = endOfIncapacityDate;
    }

    /**
     * First payment date (Date Format = DDMMYYYY).
     * 
     */
    public String getDateFirstWeeklyCompensationPaymentMade() {
        return dateFirstWeeklyCompensationPaymentMade;
    }

    /**
     * First payment date (Date Format = DDMMYYYY).
     * 
     */
    public void setDateFirstWeeklyCompensationPaymentMade(String dateFirstWeeklyCompensationPaymentMade) {
        this.dateFirstWeeklyCompensationPaymentMade = dateFirstWeeklyCompensationPaymentMade;
    }

    /**
     * Date that AE/TPA has completed the Initial Needs Assessment (Date Format = DDMMYYYY).
     * 
     */
    public String getDateInitialNeedsAssessmentCompleted() {
        return dateInitialNeedsAssessmentCompleted;
    }

    /**
     * Date that AE/TPA has completed the Initial Needs Assessment (Date Format = DDMMYYYY).
     * 
     */
    public void setDateInitialNeedsAssessmentCompleted(String dateInitialNeedsAssessmentCompleted) {
        this.dateInitialNeedsAssessmentCompleted = dateInitialNeedsAssessmentCompleted;
    }

    /**
     * Date that AE/TPA has agreed/finalised the Individual Rehabilitation Plan (Date Format = DDMMYYYY).
     * 
     */
    public String getDateIndividualRehabilitationPlanAgreed() {
        return dateIndividualRehabilitationPlanAgreed;
    }

    /**
     * Date that AE/TPA has agreed/finalised the Individual Rehabilitation Plan (Date Format = DDMMYYYY).
     * 
     */
    public void setDateIndividualRehabilitationPlanAgreed(String dateIndividualRehabilitationPlanAgreed) {
        this.dateIndividualRehabilitationPlanAgreed = dateIndividualRehabilitationPlanAgreed;
    }

    /**
     * Date of Subsequent Incapacity (DOSI) definition (Date Format = DDMMYYYY).
     * 
     */
    public String getDateOfSubsequentIncapacity() {
        return dateOfSubsequentIncapacity;
    }

    /**
     * Date of Subsequent Incapacity (DOSI) definition (Date Format = DDMMYYYY).
     * 
     */
    public void setDateOfSubsequentIncapacity(String dateOfSubsequentIncapacity) {
        this.dateOfSubsequentIncapacity = dateOfSubsequentIncapacity;
    }

    /**
     * Nature of the RTW during incapacity Maybe full or partial return to work.
     * 
     */
    public String getReturnToWorkDuringIncapacityType() {
        return returnToWorkDuringIncapacityType;
    }

    /**
     * Nature of the RTW during incapacity Maybe full or partial return to work.
     * 
     */
    public void setReturnToWorkDuringIncapacityType(String returnToWorkDuringIncapacityType) {
        this.returnToWorkDuringIncapacityType = returnToWorkDuringIncapacityType;
    }

    /**
     * The reason the employee permanently returns to work.
     * 
     */
    public String getEndOfIncapacityType() {
        return endOfIncapacityType;
    }

    /**
     * The reason the employee permanently returns to work.
     * 
     */
    public void setEndOfIncapacityType(String endOfIncapacityType) {
        this.endOfIncapacityType = endOfIncapacityType;
    }

    /**
     * Date Entitlement was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    public String getDateEntitlementStoppedNonCompliance() {
        return dateEntitlementStoppedNonCompliance;
    }

    /**
     * Date Entitlement was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    public void setDateEntitlementStoppedNonCompliance(String dateEntitlementStoppedNonCompliance) {
        this.dateEntitlementStoppedNonCompliance = dateEntitlementStoppedNonCompliance;
    }

    /**
     * Date Entitlement was re-instated, after it was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    public String getDateEntitlementReinstatedNonCompliance() {
        return dateEntitlementReinstatedNonCompliance;
    }

    /**
     * Date Entitlement was re-instated, after it was stopped due to non-compliance by the worker (Date Format = DDMMYYYY).
     * 
     */
    public void setDateEntitlementReinstatedNonCompliance(String dateEntitlementReinstatedNonCompliance) {
        this.dateEntitlementReinstatedNonCompliance = dateEntitlementReinstatedNonCompliance;
    }

    /**
     * The duration that the weekly compensation paid covers, regardless of whether the worker usually work part-time or full-time.
     * 
     */
    public int getNumberOfWeeklyCompensationDaysPaid() {
        return numberOfWeeklyCompensationDaysPaid;
    }

    /**
     * The duration that the weekly compensation paid covers, regardless of whether the worker usually work part-time or full-time.
     * 
     */
    public void setNumberOfWeeklyCompensationDaysPaid(int numberOfWeeklyCompensationDaysPaid) {
        this.numberOfWeeklyCompensationDaysPaid = numberOfWeeklyCompensationDaysPaid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IncapacityRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateOfFirstIncapacity");
        sb.append('=');
        sb.append(((this.dateOfFirstIncapacity == null)?"<null>":this.dateOfFirstIncapacity));
        sb.append(',');
        sb.append("returnToWorkDuringIncapacityDate");
        sb.append('=');
        sb.append(((this.returnToWorkDuringIncapacityDate == null)?"<null>":this.returnToWorkDuringIncapacityDate));
        sb.append(',');
        sb.append("endOfIncapacityDate");
        sb.append('=');
        sb.append(((this.endOfIncapacityDate == null)?"<null>":this.endOfIncapacityDate));
        sb.append(',');
        sb.append("dateFirstWeeklyCompensationPaymentMade");
        sb.append('=');
        sb.append(((this.dateFirstWeeklyCompensationPaymentMade == null)?"<null>":this.dateFirstWeeklyCompensationPaymentMade));
        sb.append(',');
        sb.append("dateInitialNeedsAssessmentCompleted");
        sb.append('=');
        sb.append(((this.dateInitialNeedsAssessmentCompleted == null)?"<null>":this.dateInitialNeedsAssessmentCompleted));
        sb.append(',');
        sb.append("dateIndividualRehabilitationPlanAgreed");
        sb.append('=');
        sb.append(((this.dateIndividualRehabilitationPlanAgreed == null)?"<null>":this.dateIndividualRehabilitationPlanAgreed));
        sb.append(',');
        sb.append("dateOfSubsequentIncapacity");
        sb.append('=');
        sb.append(((this.dateOfSubsequentIncapacity == null)?"<null>":this.dateOfSubsequentIncapacity));
        sb.append(',');
        sb.append("returnToWorkDuringIncapacityType");
        sb.append('=');
        sb.append(((this.returnToWorkDuringIncapacityType == null)?"<null>":this.returnToWorkDuringIncapacityType));
        sb.append(',');
        sb.append("endOfIncapacityType");
        sb.append('=');
        sb.append(((this.endOfIncapacityType == null)?"<null>":this.endOfIncapacityType));
        sb.append(',');
        sb.append("dateEntitlementStoppedNonCompliance");
        sb.append('=');
        sb.append(((this.dateEntitlementStoppedNonCompliance == null)?"<null>":this.dateEntitlementStoppedNonCompliance));
        sb.append(',');
        sb.append("dateEntitlementReinstatedNonCompliance");
        sb.append('=');
        sb.append(((this.dateEntitlementReinstatedNonCompliance == null)?"<null>":this.dateEntitlementReinstatedNonCompliance));
        sb.append(',');
        sb.append("numberOfWeeklyCompensationDaysPaid");
        sb.append('=');
        sb.append(this.numberOfWeeklyCompensationDaysPaid);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.dateOfFirstIncapacity == null)? 0 :this.dateOfFirstIncapacity.hashCode()));
        result = ((result* 31)+((this.returnToWorkDuringIncapacityDate == null)? 0 :this.returnToWorkDuringIncapacityDate.hashCode()));
        result = ((result* 31)+((this.returnToWorkDuringIncapacityType == null)? 0 :this.returnToWorkDuringIncapacityType.hashCode()));
        result = ((result* 31)+((this.endOfIncapacityType == null)? 0 :this.endOfIncapacityType.hashCode()));
        result = ((result* 31)+((this.dateEntitlementStoppedNonCompliance == null)? 0 :this.dateEntitlementStoppedNonCompliance.hashCode()));
        result = ((result* 31)+((this.dateEntitlementReinstatedNonCompliance == null)? 0 :this.dateEntitlementReinstatedNonCompliance.hashCode()));
        result = ((result* 31)+ this.numberOfWeeklyCompensationDaysPaid);
        result = ((result* 31)+((this.dateIndividualRehabilitationPlanAgreed == null)? 0 :this.dateIndividualRehabilitationPlanAgreed.hashCode()));
        result = ((result* 31)+((this.dateFirstWeeklyCompensationPaymentMade == null)? 0 :this.dateFirstWeeklyCompensationPaymentMade.hashCode()));
        result = ((result* 31)+((this.endOfIncapacityDate == null)? 0 :this.endOfIncapacityDate.hashCode()));
        result = ((result* 31)+((this.dateOfSubsequentIncapacity == null)? 0 :this.dateOfSubsequentIncapacity.hashCode()));
        result = ((result* 31)+((this.dateInitialNeedsAssessmentCompleted == null)? 0 :this.dateInitialNeedsAssessmentCompleted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncapacityRecord) == false) {
            return false;
        }
        IncapacityRecord rhs = ((IncapacityRecord) other);
        return (((((((((((((this.dateOfFirstIncapacity == rhs.dateOfFirstIncapacity)||((this.dateOfFirstIncapacity!= null)&&this.dateOfFirstIncapacity.equals(rhs.dateOfFirstIncapacity)))&&((this.returnToWorkDuringIncapacityDate == rhs.returnToWorkDuringIncapacityDate)||((this.returnToWorkDuringIncapacityDate!= null)&&this.returnToWorkDuringIncapacityDate.equals(rhs.returnToWorkDuringIncapacityDate))))&&((this.returnToWorkDuringIncapacityType == rhs.returnToWorkDuringIncapacityType)||((this.returnToWorkDuringIncapacityType!= null)&&this.returnToWorkDuringIncapacityType.equals(rhs.returnToWorkDuringIncapacityType))))&&((this.endOfIncapacityType == rhs.endOfIncapacityType)||((this.endOfIncapacityType!= null)&&this.endOfIncapacityType.equals(rhs.endOfIncapacityType))))&&((this.dateEntitlementStoppedNonCompliance == rhs.dateEntitlementStoppedNonCompliance)||((this.dateEntitlementStoppedNonCompliance!= null)&&this.dateEntitlementStoppedNonCompliance.equals(rhs.dateEntitlementStoppedNonCompliance))))&&((this.dateEntitlementReinstatedNonCompliance == rhs.dateEntitlementReinstatedNonCompliance)||((this.dateEntitlementReinstatedNonCompliance!= null)&&this.dateEntitlementReinstatedNonCompliance.equals(rhs.dateEntitlementReinstatedNonCompliance))))&&(this.numberOfWeeklyCompensationDaysPaid == rhs.numberOfWeeklyCompensationDaysPaid))&&((this.dateIndividualRehabilitationPlanAgreed == rhs.dateIndividualRehabilitationPlanAgreed)||((this.dateIndividualRehabilitationPlanAgreed!= null)&&this.dateIndividualRehabilitationPlanAgreed.equals(rhs.dateIndividualRehabilitationPlanAgreed))))&&((this.dateFirstWeeklyCompensationPaymentMade == rhs.dateFirstWeeklyCompensationPaymentMade)||((this.dateFirstWeeklyCompensationPaymentMade!= null)&&this.dateFirstWeeklyCompensationPaymentMade.equals(rhs.dateFirstWeeklyCompensationPaymentMade))))&&((this.endOfIncapacityDate == rhs.endOfIncapacityDate)||((this.endOfIncapacityDate!= null)&&this.endOfIncapacityDate.equals(rhs.endOfIncapacityDate))))&&((this.dateOfSubsequentIncapacity == rhs.dateOfSubsequentIncapacity)||((this.dateOfSubsequentIncapacity!= null)&&this.dateOfSubsequentIncapacity.equals(rhs.dateOfSubsequentIncapacity))))&&((this.dateInitialNeedsAssessmentCompleted == rhs.dateInitialNeedsAssessmentCompleted)||((this.dateInitialNeedsAssessmentCompleted!= null)&&this.dateInitialNeedsAssessmentCompleted.equals(rhs.dateInitialNeedsAssessmentCompleted))));
    }

}
