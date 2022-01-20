
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Identifies an Accredited Employer. It contains batch control information to ensure no data has been lost due to transmission.
 * 
 */
@Generated("jsonschema2pojo")
public class ClaimMetaData {

    /**
     * identifies the Accredited Employer.
     * (Required)
     * 
     */
    @SerializedName("employerACCNumber")
    @Expose
    private String employerACCNumber;
    /**
     * Accredited Employer's reference number for this input file.
     * (Required)
     * 
     */
    @SerializedName("batchReference")
    @Expose
    private String batchReference;
    /**
     * Number of records in the batch including claimMetaData.
     * (Required)
     * 
     */
    @SerializedName("numberOfRecords")
    @Expose
    private int numberOfRecords;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClaimMetaData() {
    }

    /**
     * 
     * @param batchReference
     * @param numberOfRecords
     * @param employerACCNumber
     */
    public ClaimMetaData(String employerACCNumber, String batchReference, int numberOfRecords) {
        super();
        this.employerACCNumber = employerACCNumber;
        this.batchReference = batchReference;
        this.numberOfRecords = numberOfRecords;
    }

    /**
     * identifies the Accredited Employer.
     * (Required)
     * 
     */
    public String getEmployerACCNumber() {
        return employerACCNumber;
    }

    /**
     * identifies the Accredited Employer.
     * (Required)
     * 
     */
    public void setEmployerACCNumber(String employerACCNumber) {
        this.employerACCNumber = employerACCNumber;
    }

    /**
     * Accredited Employer's reference number for this input file.
     * (Required)
     * 
     */
    public String getBatchReference() {
        return batchReference;
    }

    /**
     * Accredited Employer's reference number for this input file.
     * (Required)
     * 
     */
    public void setBatchReference(String batchReference) {
        this.batchReference = batchReference;
    }

    /**
     * Number of records in the batch including claimMetaData.
     * (Required)
     * 
     */
    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Number of records in the batch including claimMetaData.
     * (Required)
     * 
     */
    public void setNumberOfRecords(int numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("employerACCNumber");
        sb.append('=');
        sb.append(((this.employerACCNumber == null)?"<null>":this.employerACCNumber));
        sb.append(',');
        sb.append("batchReference");
        sb.append('=');
        sb.append(((this.batchReference == null)?"<null>":this.batchReference));
        sb.append(',');
        sb.append("numberOfRecords");
        sb.append('=');
        sb.append(this.numberOfRecords);
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
        result = ((result* 31)+((this.batchReference == null)? 0 :this.batchReference.hashCode()));
        result = ((result* 31)+((this.employerACCNumber == null)? 0 :this.employerACCNumber.hashCode()));
        result = ((result* 31)+ this.numberOfRecords);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimMetaData) == false) {
            return false;
        }
        ClaimMetaData rhs = ((ClaimMetaData) other);
        return ((((this.batchReference == rhs.batchReference)||((this.batchReference!= null)&&this.batchReference.equals(rhs.batchReference)))&&((this.employerACCNumber == rhs.employerACCNumber)||((this.employerACCNumber!= null)&&this.employerACCNumber.equals(rhs.employerACCNumber))))&&(this.numberOfRecords == rhs.numberOfRecords));
    }

}
