
package nz.co.acc.mcftxttojsonconverter.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Identifies a claim and may change its status.
 * 
 */
@Generated("jsonschema2pojo")
public class ClaimHeaderRecord {

    /**
     * Used by Accredited Employer to identify the claim.
     * (Required)
     * 
     */
    @SerializedName("claimNumber")
    @Expose
    private String claimNumber;
    /**
     * Date claim (AC45) first received by ACC or AE/TPA (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateClaimLodged")
    @Expose
    private String dateClaimLodged;
    /**
     * An explanation about the purpose of this instance.
     * 
     */
    @SerializedName("activeManagementCeases")
    @Expose
    private String activeManagementCeases;
    /**
     * Identifies if claim is (I)nitial, (U)pdate claim data OR (D)eleted claim.
     * (Required)
     * 
     */
    @SerializedName("recordFormat")
    @Expose
    private ClaimHeaderRecord.RecordFormat recordFormat;
    /**
     * Current name of the self-managing AE or TPA managing the claim on behalf of the employer.
     * 
     */
    @SerializedName("currentClaimAdministrator")
    @Expose
    private String currentClaimAdministrator;
    /**
     * Claim status.
     * (Required)
     * 
     */
    @SerializedName("outcomeCoverDecision")
    @Expose
    private String outcomeCoverDecision;
    /**
     * ACC45 number.
     * (Required)
     * 
     */
    @SerializedName("acc45Number")
    @Expose
    private String acc45Number;
    /**
     * An explanation about the purpose of this instance (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    @SerializedName("dateOutcomeCoverDecision")
    @Expose
    private String dateOutcomeCoverDecision;
    /**
     * Complexity of the claim - (C)omplicated or (N)on Complicated.
     * 
     */
    @SerializedName("claimType")
    @Expose
    private ClaimHeaderRecord.ClaimType claimType;
    /**
     * Date Format = DDMMYYYY
     * (Required)
     * 
     */
    @SerializedName("DateClaimReceivedByAE")
    @Expose
    private String dateClaimReceivedByAE;
    /**
     * Indicates whether claim is for a gradual process injury.
     * (Required)
     * 
     */
    @SerializedName("gradualProcessClaim")
    @Expose
    private String gradualProcessClaim;
    /**
     * A code that links a single event to multiple claims.
     * 
     */
    @SerializedName("singleEventCode")
    @Expose
    private String singleEventCode;
    /**
     * Date Cover Decision Extension was advised (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("coverDecisionExtensionDateAdvised")
    @Expose
    private String coverDecisionExtensionDateAdvised;
    /**
     * Cover Decision Extension (Initial) Date Advised (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("coverDecisionExtensionInitialDateExpires")
    @Expose
    private String coverDecisionExtensionInitialDateExpires;
    /**
     * Date Cover Decision Subsequent Extension Date is sought (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("coverDecisionExtensionSubsequentDateSought")
    @Expose
    private String coverDecisionExtensionSubsequentDateSought;
    /**
     * Date Cover Decision Subsequent Extension Date is agreed (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("coverDecisionExtensionSubsequentDateAgreed")
    @Expose
    private String coverDecisionExtensionSubsequentDateAgreed;
    /**
     * Date Cover Decision Subsequent Extension Date expires (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("coverDecisionExtensionSubsequentDateExpires")
    @Expose
    private String coverDecisionExtensionSubsequentDateExpires;
    /**
     * An actively managed claim is a claim that has an ongoing entitlement of any sort, or is currently being investigated for cover or entitlements.
     * (Required)
     * 
     */
    @SerializedName("claimActivelyManaged")
    @Expose
    private ClaimHeaderRecord.ClaimActivelyManaged claimActivelyManaged;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClaimHeaderRecord() {
    }

    /**
     * 
     * @param coverDecisionExtensionDateAdvised
     * @param acc45Number
     * @param outcomeCoverDecision
     * @param coverDecisionExtensionSubsequentDateAgreed
     * @param coverDecisionExtensionSubsequentDateSought
     * @param dateClaimLodged
     * @param activeManagementCeases
     * @param recordFormat
     * @param currentClaimAdministrator
     * @param dateOutcomeCoverDecision
     * @param claimType
     * @param singleEventCode
     * @param coverDecisionExtensionInitialDateExpires
     * @param coverDecisionExtensionSubsequentDateExpires
     * @param claimNumber
     * @param gradualProcessClaim
     * @param claimActivelyManaged
     * @param dateClaimReceivedByAE
     */
    public ClaimHeaderRecord(String claimNumber, String dateClaimLodged, String activeManagementCeases, ClaimHeaderRecord.RecordFormat recordFormat, String currentClaimAdministrator, String outcomeCoverDecision, String acc45Number, String dateOutcomeCoverDecision, ClaimHeaderRecord.ClaimType claimType, String dateClaimReceivedByAE, String gradualProcessClaim, String singleEventCode, String coverDecisionExtensionDateAdvised, String coverDecisionExtensionInitialDateExpires, String coverDecisionExtensionSubsequentDateSought, String coverDecisionExtensionSubsequentDateAgreed, String coverDecisionExtensionSubsequentDateExpires, ClaimHeaderRecord.ClaimActivelyManaged claimActivelyManaged) {
        super();
        this.claimNumber = claimNumber;
        this.dateClaimLodged = dateClaimLodged;
        this.activeManagementCeases = activeManagementCeases;
        this.recordFormat = recordFormat;
        this.currentClaimAdministrator = currentClaimAdministrator;
        this.outcomeCoverDecision = outcomeCoverDecision;
        this.acc45Number = acc45Number;
        this.dateOutcomeCoverDecision = dateOutcomeCoverDecision;
        this.claimType = claimType;
        this.dateClaimReceivedByAE = dateClaimReceivedByAE;
        this.gradualProcessClaim = gradualProcessClaim;
        this.singleEventCode = singleEventCode;
        this.coverDecisionExtensionDateAdvised = coverDecisionExtensionDateAdvised;
        this.coverDecisionExtensionInitialDateExpires = coverDecisionExtensionInitialDateExpires;
        this.coverDecisionExtensionSubsequentDateSought = coverDecisionExtensionSubsequentDateSought;
        this.coverDecisionExtensionSubsequentDateAgreed = coverDecisionExtensionSubsequentDateAgreed;
        this.coverDecisionExtensionSubsequentDateExpires = coverDecisionExtensionSubsequentDateExpires;
        this.claimActivelyManaged = claimActivelyManaged;
    }

    /**
     * Used by Accredited Employer to identify the claim.
     * (Required)
     * 
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Used by Accredited Employer to identify the claim.
     * (Required)
     * 
     */
    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    /**
     * Date claim (AC45) first received by ACC or AE/TPA (Date Format = DDMMYYYY).
     * 
     */
    public String getDateClaimLodged() {
        return dateClaimLodged;
    }

    /**
     * Date claim (AC45) first received by ACC or AE/TPA (Date Format = DDMMYYYY).
     * 
     */
    public void setDateClaimLodged(String dateClaimLodged) {
        this.dateClaimLodged = dateClaimLodged;
    }

    /**
     * An explanation about the purpose of this instance.
     * 
     */
    public String getActiveManagementCeases() {
        return activeManagementCeases;
    }

    /**
     * An explanation about the purpose of this instance.
     * 
     */
    public void setActiveManagementCeases(String activeManagementCeases) {
        this.activeManagementCeases = activeManagementCeases;
    }

    /**
     * Identifies if claim is (I)nitial, (U)pdate claim data OR (D)eleted claim.
     * (Required)
     * 
     */
    public ClaimHeaderRecord.RecordFormat getRecordFormat() {
        return recordFormat;
    }

    /**
     * Identifies if claim is (I)nitial, (U)pdate claim data OR (D)eleted claim.
     * (Required)
     * 
     */
    public void setRecordFormat(ClaimHeaderRecord.RecordFormat recordFormat) {
        this.recordFormat = recordFormat;
    }

    /**
     * Current name of the self-managing AE or TPA managing the claim on behalf of the employer.
     * 
     */
    public String getCurrentClaimAdministrator() {
        return currentClaimAdministrator;
    }

    /**
     * Current name of the self-managing AE or TPA managing the claim on behalf of the employer.
     * 
     */
    public void setCurrentClaimAdministrator(String currentClaimAdministrator) {
        this.currentClaimAdministrator = currentClaimAdministrator;
    }

    /**
     * Claim status.
     * (Required)
     * 
     */
    public String getOutcomeCoverDecision() {
        return outcomeCoverDecision;
    }

    /**
     * Claim status.
     * (Required)
     * 
     */
    public void setOutcomeCoverDecision(String outcomeCoverDecision) {
        this.outcomeCoverDecision = outcomeCoverDecision;
    }

    /**
     * ACC45 number.
     * (Required)
     * 
     */
    public String getAcc45Number() {
        return acc45Number;
    }

    /**
     * ACC45 number.
     * (Required)
     * 
     */
    public void setAcc45Number(String acc45Number) {
        this.acc45Number = acc45Number;
    }

    /**
     * An explanation about the purpose of this instance (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public String getDateOutcomeCoverDecision() {
        return dateOutcomeCoverDecision;
    }

    /**
     * An explanation about the purpose of this instance (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public void setDateOutcomeCoverDecision(String dateOutcomeCoverDecision) {
        this.dateOutcomeCoverDecision = dateOutcomeCoverDecision;
    }

    /**
     * Complexity of the claim - (C)omplicated or (N)on Complicated.
     * 
     */
    public ClaimHeaderRecord.ClaimType getClaimType() {
        return claimType;
    }

    /**
     * Complexity of the claim - (C)omplicated or (N)on Complicated.
     * 
     */
    public void setClaimType(ClaimHeaderRecord.ClaimType claimType) {
        this.claimType = claimType;
    }

    /**
     * Date Format = DDMMYYYY
     * (Required)
     * 
     */
    public String getDateClaimReceivedByAE() {
        return dateClaimReceivedByAE;
    }

    /**
     * Date Format = DDMMYYYY
     * (Required)
     * 
     */
    public void setDateClaimReceivedByAE(String dateClaimReceivedByAE) {
        this.dateClaimReceivedByAE = dateClaimReceivedByAE;
    }

    /**
     * Indicates whether claim is for a gradual process injury.
     * (Required)
     * 
     */
    public String getGradualProcessClaim() {
        return gradualProcessClaim;
    }

    /**
     * Indicates whether claim is for a gradual process injury.
     * (Required)
     * 
     */
    public void setGradualProcessClaim(String gradualProcessClaim) {
        this.gradualProcessClaim = gradualProcessClaim;
    }

    /**
     * A code that links a single event to multiple claims.
     * 
     */
    public String getSingleEventCode() {
        return singleEventCode;
    }

    /**
     * A code that links a single event to multiple claims.
     * 
     */
    public void setSingleEventCode(String singleEventCode) {
        this.singleEventCode = singleEventCode;
    }

    /**
     * Date Cover Decision Extension was advised (Date Format = DDMMYYYY).
     * 
     */
    public String getCoverDecisionExtensionDateAdvised() {
        return coverDecisionExtensionDateAdvised;
    }

    /**
     * Date Cover Decision Extension was advised (Date Format = DDMMYYYY).
     * 
     */
    public void setCoverDecisionExtensionDateAdvised(String coverDecisionExtensionDateAdvised) {
        this.coverDecisionExtensionDateAdvised = coverDecisionExtensionDateAdvised;
    }

    /**
     * Cover Decision Extension (Initial) Date Advised (Date Format = DDMMYYYY).
     * 
     */
    public String getCoverDecisionExtensionInitialDateExpires() {
        return coverDecisionExtensionInitialDateExpires;
    }

    /**
     * Cover Decision Extension (Initial) Date Advised (Date Format = DDMMYYYY).
     * 
     */
    public void setCoverDecisionExtensionInitialDateExpires(String coverDecisionExtensionInitialDateExpires) {
        this.coverDecisionExtensionInitialDateExpires = coverDecisionExtensionInitialDateExpires;
    }

    /**
     * Date Cover Decision Subsequent Extension Date is sought (Date Format = DDMMYYYY).
     * 
     */
    public String getCoverDecisionExtensionSubsequentDateSought() {
        return coverDecisionExtensionSubsequentDateSought;
    }

    /**
     * Date Cover Decision Subsequent Extension Date is sought (Date Format = DDMMYYYY).
     * 
     */
    public void setCoverDecisionExtensionSubsequentDateSought(String coverDecisionExtensionSubsequentDateSought) {
        this.coverDecisionExtensionSubsequentDateSought = coverDecisionExtensionSubsequentDateSought;
    }

    /**
     * Date Cover Decision Subsequent Extension Date is agreed (Date Format = DDMMYYYY).
     * 
     */
    public String getCoverDecisionExtensionSubsequentDateAgreed() {
        return coverDecisionExtensionSubsequentDateAgreed;
    }

    /**
     * Date Cover Decision Subsequent Extension Date is agreed (Date Format = DDMMYYYY).
     * 
     */
    public void setCoverDecisionExtensionSubsequentDateAgreed(String coverDecisionExtensionSubsequentDateAgreed) {
        this.coverDecisionExtensionSubsequentDateAgreed = coverDecisionExtensionSubsequentDateAgreed;
    }

    /**
     * Date Cover Decision Subsequent Extension Date expires (Date Format = DDMMYYYY).
     * 
     */
    public String getCoverDecisionExtensionSubsequentDateExpires() {
        return coverDecisionExtensionSubsequentDateExpires;
    }

    /**
     * Date Cover Decision Subsequent Extension Date expires (Date Format = DDMMYYYY).
     * 
     */
    public void setCoverDecisionExtensionSubsequentDateExpires(String coverDecisionExtensionSubsequentDateExpires) {
        this.coverDecisionExtensionSubsequentDateExpires = coverDecisionExtensionSubsequentDateExpires;
    }

    /**
     * An actively managed claim is a claim that has an ongoing entitlement of any sort, or is currently being investigated for cover or entitlements.
     * (Required)
     * 
     */
    public ClaimHeaderRecord.ClaimActivelyManaged getClaimActivelyManaged() {
        return claimActivelyManaged;
    }

    /**
     * An actively managed claim is a claim that has an ongoing entitlement of any sort, or is currently being investigated for cover or entitlements.
     * (Required)
     * 
     */
    public void setClaimActivelyManaged(ClaimHeaderRecord.ClaimActivelyManaged claimActivelyManaged) {
        this.claimActivelyManaged = claimActivelyManaged;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaimHeaderRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claimNumber");
        sb.append('=');
        sb.append(((this.claimNumber == null)?"<null>":this.claimNumber));
        sb.append(',');
        sb.append("dateClaimLodged");
        sb.append('=');
        sb.append(((this.dateClaimLodged == null)?"<null>":this.dateClaimLodged));
        sb.append(',');
        sb.append("activeManagementCeases");
        sb.append('=');
        sb.append(((this.activeManagementCeases == null)?"<null>":this.activeManagementCeases));
        sb.append(',');
        sb.append("recordFormat");
        sb.append('=');
        sb.append(((this.recordFormat == null)?"<null>":this.recordFormat));
        sb.append(',');
        sb.append("currentClaimAdministrator");
        sb.append('=');
        sb.append(((this.currentClaimAdministrator == null)?"<null>":this.currentClaimAdministrator));
        sb.append(',');
        sb.append("outcomeCoverDecision");
        sb.append('=');
        sb.append(((this.outcomeCoverDecision == null)?"<null>":this.outcomeCoverDecision));
        sb.append(',');
        sb.append("acc45Number");
        sb.append('=');
        sb.append(((this.acc45Number == null)?"<null>":this.acc45Number));
        sb.append(',');
        sb.append("dateOutcomeCoverDecision");
        sb.append('=');
        sb.append(((this.dateOutcomeCoverDecision == null)?"<null>":this.dateOutcomeCoverDecision));
        sb.append(',');
        sb.append("claimType");
        sb.append('=');
        sb.append(((this.claimType == null)?"<null>":this.claimType));
        sb.append(',');
        sb.append("dateClaimReceivedByAE");
        sb.append('=');
        sb.append(((this.dateClaimReceivedByAE == null)?"<null>":this.dateClaimReceivedByAE));
        sb.append(',');
        sb.append("gradualProcessClaim");
        sb.append('=');
        sb.append(((this.gradualProcessClaim == null)?"<null>":this.gradualProcessClaim));
        sb.append(',');
        sb.append("singleEventCode");
        sb.append('=');
        sb.append(((this.singleEventCode == null)?"<null>":this.singleEventCode));
        sb.append(',');
        sb.append("coverDecisionExtensionDateAdvised");
        sb.append('=');
        sb.append(((this.coverDecisionExtensionDateAdvised == null)?"<null>":this.coverDecisionExtensionDateAdvised));
        sb.append(',');
        sb.append("coverDecisionExtensionInitialDateExpires");
        sb.append('=');
        sb.append(((this.coverDecisionExtensionInitialDateExpires == null)?"<null>":this.coverDecisionExtensionInitialDateExpires));
        sb.append(',');
        sb.append("coverDecisionExtensionSubsequentDateSought");
        sb.append('=');
        sb.append(((this.coverDecisionExtensionSubsequentDateSought == null)?"<null>":this.coverDecisionExtensionSubsequentDateSought));
        sb.append(',');
        sb.append("coverDecisionExtensionSubsequentDateAgreed");
        sb.append('=');
        sb.append(((this.coverDecisionExtensionSubsequentDateAgreed == null)?"<null>":this.coverDecisionExtensionSubsequentDateAgreed));
        sb.append(',');
        sb.append("coverDecisionExtensionSubsequentDateExpires");
        sb.append('=');
        sb.append(((this.coverDecisionExtensionSubsequentDateExpires == null)?"<null>":this.coverDecisionExtensionSubsequentDateExpires));
        sb.append(',');
        sb.append("claimActivelyManaged");
        sb.append('=');
        sb.append(((this.claimActivelyManaged == null)?"<null>":this.claimActivelyManaged));
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
        result = ((result* 31)+((this.coverDecisionExtensionDateAdvised == null)? 0 :this.coverDecisionExtensionDateAdvised.hashCode()));
        result = ((result* 31)+((this.acc45Number == null)? 0 :this.acc45Number.hashCode()));
        result = ((result* 31)+((this.outcomeCoverDecision == null)? 0 :this.outcomeCoverDecision.hashCode()));
        result = ((result* 31)+((this.coverDecisionExtensionSubsequentDateAgreed == null)? 0 :this.coverDecisionExtensionSubsequentDateAgreed.hashCode()));
        result = ((result* 31)+((this.coverDecisionExtensionSubsequentDateSought == null)? 0 :this.coverDecisionExtensionSubsequentDateSought.hashCode()));
        result = ((result* 31)+((this.dateClaimLodged == null)? 0 :this.dateClaimLodged.hashCode()));
        result = ((result* 31)+((this.activeManagementCeases == null)? 0 :this.activeManagementCeases.hashCode()));
        result = ((result* 31)+((this.recordFormat == null)? 0 :this.recordFormat.hashCode()));
        result = ((result* 31)+((this.currentClaimAdministrator == null)? 0 :this.currentClaimAdministrator.hashCode()));
        result = ((result* 31)+((this.dateOutcomeCoverDecision == null)? 0 :this.dateOutcomeCoverDecision.hashCode()));
        result = ((result* 31)+((this.claimType == null)? 0 :this.claimType.hashCode()));
        result = ((result* 31)+((this.singleEventCode == null)? 0 :this.singleEventCode.hashCode()));
        result = ((result* 31)+((this.coverDecisionExtensionInitialDateExpires == null)? 0 :this.coverDecisionExtensionInitialDateExpires.hashCode()));
        result = ((result* 31)+((this.coverDecisionExtensionSubsequentDateExpires == null)? 0 :this.coverDecisionExtensionSubsequentDateExpires.hashCode()));
        result = ((result* 31)+((this.claimNumber == null)? 0 :this.claimNumber.hashCode()));
        result = ((result* 31)+((this.gradualProcessClaim == null)? 0 :this.gradualProcessClaim.hashCode()));
        result = ((result* 31)+((this.claimActivelyManaged == null)? 0 :this.claimActivelyManaged.hashCode()));
        result = ((result* 31)+((this.dateClaimReceivedByAE == null)? 0 :this.dateClaimReceivedByAE.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClaimHeaderRecord) == false) {
            return false;
        }
        ClaimHeaderRecord rhs = ((ClaimHeaderRecord) other);
        return (((((((((((((((((((this.coverDecisionExtensionDateAdvised == rhs.coverDecisionExtensionDateAdvised)||((this.coverDecisionExtensionDateAdvised!= null)&&this.coverDecisionExtensionDateAdvised.equals(rhs.coverDecisionExtensionDateAdvised)))&&((this.acc45Number == rhs.acc45Number)||((this.acc45Number!= null)&&this.acc45Number.equals(rhs.acc45Number))))&&((this.outcomeCoverDecision == rhs.outcomeCoverDecision)||((this.outcomeCoverDecision!= null)&&this.outcomeCoverDecision.equals(rhs.outcomeCoverDecision))))&&((this.coverDecisionExtensionSubsequentDateAgreed == rhs.coverDecisionExtensionSubsequentDateAgreed)||((this.coverDecisionExtensionSubsequentDateAgreed!= null)&&this.coverDecisionExtensionSubsequentDateAgreed.equals(rhs.coverDecisionExtensionSubsequentDateAgreed))))&&((this.coverDecisionExtensionSubsequentDateSought == rhs.coverDecisionExtensionSubsequentDateSought)||((this.coverDecisionExtensionSubsequentDateSought!= null)&&this.coverDecisionExtensionSubsequentDateSought.equals(rhs.coverDecisionExtensionSubsequentDateSought))))&&((this.dateClaimLodged == rhs.dateClaimLodged)||((this.dateClaimLodged!= null)&&this.dateClaimLodged.equals(rhs.dateClaimLodged))))&&((this.activeManagementCeases == rhs.activeManagementCeases)||((this.activeManagementCeases!= null)&&this.activeManagementCeases.equals(rhs.activeManagementCeases))))&&((this.recordFormat == rhs.recordFormat)||((this.recordFormat!= null)&&this.recordFormat.equals(rhs.recordFormat))))&&((this.currentClaimAdministrator == rhs.currentClaimAdministrator)||((this.currentClaimAdministrator!= null)&&this.currentClaimAdministrator.equals(rhs.currentClaimAdministrator))))&&((this.dateOutcomeCoverDecision == rhs.dateOutcomeCoverDecision)||((this.dateOutcomeCoverDecision!= null)&&this.dateOutcomeCoverDecision.equals(rhs.dateOutcomeCoverDecision))))&&((this.claimType == rhs.claimType)||((this.claimType!= null)&&this.claimType.equals(rhs.claimType))))&&((this.singleEventCode == rhs.singleEventCode)||((this.singleEventCode!= null)&&this.singleEventCode.equals(rhs.singleEventCode))))&&((this.coverDecisionExtensionInitialDateExpires == rhs.coverDecisionExtensionInitialDateExpires)||((this.coverDecisionExtensionInitialDateExpires!= null)&&this.coverDecisionExtensionInitialDateExpires.equals(rhs.coverDecisionExtensionInitialDateExpires))))&&((this.coverDecisionExtensionSubsequentDateExpires == rhs.coverDecisionExtensionSubsequentDateExpires)||((this.coverDecisionExtensionSubsequentDateExpires!= null)&&this.coverDecisionExtensionSubsequentDateExpires.equals(rhs.coverDecisionExtensionSubsequentDateExpires))))&&((this.claimNumber == rhs.claimNumber)||((this.claimNumber!= null)&&this.claimNumber.equals(rhs.claimNumber))))&&((this.gradualProcessClaim == rhs.gradualProcessClaim)||((this.gradualProcessClaim!= null)&&this.gradualProcessClaim.equals(rhs.gradualProcessClaim))))&&((this.claimActivelyManaged == rhs.claimActivelyManaged)||((this.claimActivelyManaged!= null)&&this.claimActivelyManaged.equals(rhs.claimActivelyManaged))))&&((this.dateClaimReceivedByAE == rhs.dateClaimReceivedByAE)||((this.dateClaimReceivedByAE!= null)&&this.dateClaimReceivedByAE.equals(rhs.dateClaimReceivedByAE))));
    }


    /**
     * An actively managed claim is a claim that has an ongoing entitlement of any sort, or is currently being investigated for cover or entitlements.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ClaimActivelyManaged {

        @SerializedName("Y")
        Y("Y"),
        @SerializedName("N")
        N("N");
        private final String value;
        private final static Map<String, ClaimHeaderRecord.ClaimActivelyManaged> CONSTANTS = new HashMap<String, ClaimHeaderRecord.ClaimActivelyManaged>();

        static {
            for (ClaimHeaderRecord.ClaimActivelyManaged c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClaimActivelyManaged(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ClaimHeaderRecord.ClaimActivelyManaged fromValue(String value) {
            ClaimHeaderRecord.ClaimActivelyManaged constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Complexity of the claim - (C)omplicated or (N)on Complicated.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ClaimType {

        @SerializedName("C")
        C("C"),
        @SerializedName("N")
        N("N");
        private final String value;
        private final static Map<String, ClaimHeaderRecord.ClaimType> CONSTANTS = new HashMap<String, ClaimHeaderRecord.ClaimType>();

        static {
            for (ClaimHeaderRecord.ClaimType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClaimType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ClaimHeaderRecord.ClaimType fromValue(String value) {
            ClaimHeaderRecord.ClaimType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Identifies if claim is (I)nitial, (U)pdate claim data OR (D)eleted claim.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RecordFormat {

        @SerializedName("I")
        I("I"),
        @SerializedName("U")
        U("U"),
        @SerializedName("D")
        D("D");
        private final String value;
        private final static Map<String, ClaimHeaderRecord.RecordFormat> CONSTANTS = new HashMap<String, ClaimHeaderRecord.RecordFormat>();

        static {
            for (ClaimHeaderRecord.RecordFormat c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RecordFormat(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ClaimHeaderRecord.RecordFormat fromValue(String value) {
            ClaimHeaderRecord.RecordFormat constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
