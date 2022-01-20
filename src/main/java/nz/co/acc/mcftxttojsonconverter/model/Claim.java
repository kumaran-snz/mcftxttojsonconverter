
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Defines individual claim details.
 * 
 */
@Generated("jsonschema2pojo")
public class Claim {

    /**
     * Identifies a claim and may change its status.
     * (Required)
     * 
     */
    @SerializedName("claimHeaderRecord")
    @Expose
    private ClaimHeaderRecord claimHeaderRecord;
    /**
     * Gives details of a specific injury caused by an accident.
     * 
     */
    @SerializedName("injuryRecord")
    @Expose
    private InjuryRecord injuryRecord;
    /**
     * Details of an employee who had an accident.
     * 
     */
    @SerializedName("employeeRecord")
    @Expose
    private EmployeeRecord employeeRecord;
    /**
     * Provides details of an employee’s incapacity resulting from an accident.
     * 
     */
    @SerializedName("incapacityRecord")
    @Expose
    private IncapacityRecord incapacityRecord;
    /**
     * Provides details of review outcomes.
     * 
     */
    @SerializedName("reviewRecord")
    @Expose
    private ReviewRecord reviewRecord;
    /**
     * Provides details of accumulated and summarised information (paid to date) in respect of a claim.
     * 
     */
    @SerializedName("summaryRecord")
    @Expose
    private SummaryRecord summaryRecord;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Claim() {
    }

    /**
     * 
     * @param reviewRecord
     * @param incapacityRecord
     * @param summaryRecord
     * @param employeeRecord
     * @param injuryRecord
     * @param claimHeaderRecord
     */
    public Claim(ClaimHeaderRecord claimHeaderRecord, InjuryRecord injuryRecord, EmployeeRecord employeeRecord, IncapacityRecord incapacityRecord, ReviewRecord reviewRecord, SummaryRecord summaryRecord) {
        super();
        this.claimHeaderRecord = claimHeaderRecord;
        this.injuryRecord = injuryRecord;
        this.employeeRecord = employeeRecord;
        this.incapacityRecord = incapacityRecord;
        this.reviewRecord = reviewRecord;
        this.summaryRecord = summaryRecord;
    }

    /**
     * Identifies a claim and may change its status.
     * (Required)
     * 
     */
    public ClaimHeaderRecord getClaimHeaderRecord() {
        return claimHeaderRecord;
    }

    /**
     * Identifies a claim and may change its status.
     * (Required)
     * 
     */
    public void setClaimHeaderRecord(ClaimHeaderRecord claimHeaderRecord) {
        this.claimHeaderRecord = claimHeaderRecord;
    }

    /**
     * Gives details of a specific injury caused by an accident.
     * 
     */
    public InjuryRecord getInjuryRecord() {
        return injuryRecord;
    }

    /**
     * Gives details of a specific injury caused by an accident.
     * 
     */
    public void setInjuryRecord(InjuryRecord injuryRecord) {
        this.injuryRecord = injuryRecord;
    }

    /**
     * Details of an employee who had an accident.
     * 
     */
    public EmployeeRecord getEmployeeRecord() {
        return employeeRecord;
    }

    /**
     * Details of an employee who had an accident.
     * 
     */
    public void setEmployeeRecord(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    /**
     * Provides details of an employee’s incapacity resulting from an accident.
     * 
     */
    public IncapacityRecord getIncapacityRecord() {
        return incapacityRecord;
    }

    /**
     * Provides details of an employee’s incapacity resulting from an accident.
     * 
     */
    public void setIncapacityRecord(IncapacityRecord incapacityRecord) {
        this.incapacityRecord = incapacityRecord;
    }

    /**
     * Provides details of review outcomes.
     * 
     */
    public ReviewRecord getReviewRecord() {
        return reviewRecord;
    }

    /**
     * Provides details of review outcomes.
     * 
     */
    public void setReviewRecord(ReviewRecord reviewRecord) {
        this.reviewRecord = reviewRecord;
    }

    /**
     * Provides details of accumulated and summarised information (paid to date) in respect of a claim.
     * 
     */
    public SummaryRecord getSummaryRecord() {
        return summaryRecord;
    }

    /**
     * Provides details of accumulated and summarised information (paid to date) in respect of a claim.
     * 
     */
    public void setSummaryRecord(SummaryRecord summaryRecord) {
        this.summaryRecord = summaryRecord;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Claim.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claimHeaderRecord");
        sb.append('=');
        sb.append(((this.claimHeaderRecord == null)?"<null>":this.claimHeaderRecord));
        sb.append(',');
        sb.append("injuryRecord");
        sb.append('=');
        sb.append(((this.injuryRecord == null)?"<null>":this.injuryRecord));
        sb.append(',');
        sb.append("employeeRecord");
        sb.append('=');
        sb.append(((this.employeeRecord == null)?"<null>":this.employeeRecord));
        sb.append(',');
        sb.append("incapacityRecord");
        sb.append('=');
        sb.append(((this.incapacityRecord == null)?"<null>":this.incapacityRecord));
        sb.append(',');
        sb.append("reviewRecord");
        sb.append('=');
        sb.append(((this.reviewRecord == null)?"<null>":this.reviewRecord));
        sb.append(',');
        sb.append("summaryRecord");
        sb.append('=');
        sb.append(((this.summaryRecord == null)?"<null>":this.summaryRecord));
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
        result = ((result* 31)+((this.reviewRecord == null)? 0 :this.reviewRecord.hashCode()));
        result = ((result* 31)+((this.incapacityRecord == null)? 0 :this.incapacityRecord.hashCode()));
        result = ((result* 31)+((this.summaryRecord == null)? 0 :this.summaryRecord.hashCode()));
        result = ((result* 31)+((this.employeeRecord == null)? 0 :this.employeeRecord.hashCode()));
        result = ((result* 31)+((this.injuryRecord == null)? 0 :this.injuryRecord.hashCode()));
        result = ((result* 31)+((this.claimHeaderRecord == null)? 0 :this.claimHeaderRecord.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Claim) == false) {
            return false;
        }
        Claim rhs = ((Claim) other);
        return (((((((this.reviewRecord == rhs.reviewRecord)||((this.reviewRecord!= null)&&this.reviewRecord.equals(rhs.reviewRecord)))&&((this.incapacityRecord == rhs.incapacityRecord)||((this.incapacityRecord!= null)&&this.incapacityRecord.equals(rhs.incapacityRecord))))&&((this.summaryRecord == rhs.summaryRecord)||((this.summaryRecord!= null)&&this.summaryRecord.equals(rhs.summaryRecord))))&&((this.employeeRecord == rhs.employeeRecord)||((this.employeeRecord!= null)&&this.employeeRecord.equals(rhs.employeeRecord))))&&((this.injuryRecord == rhs.injuryRecord)||((this.injuryRecord!= null)&&this.injuryRecord.equals(rhs.injuryRecord))))&&((this.claimHeaderRecord == rhs.claimHeaderRecord)||((this.claimHeaderRecord!= null)&&this.claimHeaderRecord.equals(rhs.claimHeaderRecord))));
    }

}
