
package nz.co.acc.mcftxttojsonconverter.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Defines individual accredited employers.
 * 
 */
@Generated("jsonschema2pojo")
public class AccreditedEmployer {

    /**
     * Identifies an Accredited Employer. It contains batch control information to ensure no data has been lost due to transmission.
     * (Required)
     * 
     */
    @SerializedName("claimMetaData")
    @Expose
    private ClaimMetaData claimMetaData;
    /**
     * List of claims submitted by the Accredited Employer.
     * (Required)
     * 
     */
    @SerializedName("claims")
    @Expose
    private List<Claim> claims = new ArrayList<Claim>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccreditedEmployer() {
    }

    /**
     * 
     * @param claims
     * @param claimMetaData
     */
    public AccreditedEmployer(ClaimMetaData claimMetaData, List<Claim> claims) {
        super();
        this.claimMetaData = claimMetaData;
        this.claims = claims;
    }

    /**
     * Identifies an Accredited Employer. It contains batch control information to ensure no data has been lost due to transmission.
     * (Required)
     * 
     */
    public ClaimMetaData getClaimMetaData() {
        return claimMetaData;
    }

    /**
     * Identifies an Accredited Employer. It contains batch control information to ensure no data has been lost due to transmission.
     * (Required)
     * 
     */
    public void setClaimMetaData(ClaimMetaData claimMetaData) {
        this.claimMetaData = claimMetaData;
    }

    /**
     * List of claims submitted by the Accredited Employer.
     * (Required)
     * 
     */
    public List<Claim> getClaims() {
        return claims;
    }

    /**
     * List of claims submitted by the Accredited Employer.
     * (Required)
     * 
     */
    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccreditedEmployer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claimMetaData");
        sb.append('=');
        sb.append(((this.claimMetaData == null)?"<null>":this.claimMetaData));
        sb.append(',');
        sb.append("claims");
        sb.append('=');
        sb.append(((this.claims == null)?"<null>":this.claims));
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
        result = ((result* 31)+((this.claims == null)? 0 :this.claims.hashCode()));
        result = ((result* 31)+((this.claimMetaData == null)? 0 :this.claimMetaData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccreditedEmployer) == false) {
            return false;
        }
        AccreditedEmployer rhs = ((AccreditedEmployer) other);
        return (((this.claims == rhs.claims)||((this.claims!= null)&&this.claims.equals(rhs.claims)))&&((this.claimMetaData == rhs.claimMetaData)||((this.claimMetaData!= null)&&this.claimMetaData.equals(rhs.claimMetaData))));
    }

}
