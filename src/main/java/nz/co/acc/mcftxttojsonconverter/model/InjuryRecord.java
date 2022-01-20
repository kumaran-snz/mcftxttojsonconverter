
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Gives details of a specific injury caused by an accident.
 * 
 */
@Generated("jsonschema2pojo")
public class InjuryRecord {

    /**
     * Date employee received injury giving rise to claim (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    @SerializedName("dateOfInjury")
    @Expose
    private String dateOfInjury;
    /**
     * Time employee received injury.
     * (Required)
     * 
     */
    @SerializedName("timeOfInjury")
    @Expose
    private String timeOfInjury;
    /**
     * Mechanism or action that caused the injury.
     * (Required)
     * 
     */
    @SerializedName("mechanism")
    @Expose
    private String mechanism;
    /**
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @SerializedName("agencyOfAccident")
    @Expose
    private String agencyOfAccident;
    /**
     * Place of injury occurrences.
     * (Required)
     * 
     */
    @SerializedName("location")
    @Expose
    private String location;
    /**
     * Location where accident occurred.
     * (Required)
     * 
     */
    @SerializedName("geoLocation")
    @Expose
    private String geoLocation;
    /**
     * Diagnosis or nature of injury.
     * (Required)
     * 
     */
    @SerializedName("diagnosisOfInjuryFirst")
    @Expose
    private String diagnosisOfInjuryFirst;
    /**
     * Coding system used for the diagnosis code of first injury.
     * (Required)
     * 
     */
    @SerializedName("diagnosisCodingSystemFirst")
    @Expose
    private String diagnosisCodingSystemFirst;
    /**
     * Body site of first injury.
     * (Required)
     * 
     */
    @SerializedName("siteOfInjuryFirst")
    @Expose
    private String siteOfInjuryFirst;
    /**
     * Side of body of first injury.
     * (Required)
     * 
     */
    @SerializedName("sideOfInjuryFirst")
    @Expose
    private String sideOfInjuryFirst;
    /**
     * Diagnosis or nature of second injury.
     * 
     */
    @SerializedName("diagnosisOfInjurySecond")
    @Expose
    private String diagnosisOfInjurySecond;
    /**
     * Coding system used for the diagnosis code of second injury.
     * 
     */
    @SerializedName("diagnosisCodingSystemSecond")
    @Expose
    private String diagnosisCodingSystemSecond;
    /**
     * Body site of second injury.
     * 
     */
    @SerializedName("siteOfInjurySecond")
    @Expose
    private String siteOfInjurySecond;
    /**
     * Side of body of second injury.
     * 
     */
    @SerializedName("sideOfInjurySecond")
    @Expose
    private String sideOfInjurySecond;
    /**
     * Diagnosis or nature of third injury.
     * 
     */
    @SerializedName("diagnosisOfInjuryThird")
    @Expose
    private String diagnosisOfInjuryThird;
    /**
     * Coding system used for the diagnosis code of third injury.
     * 
     */
    @SerializedName("diagnosisCodingSystemThird")
    @Expose
    private String diagnosisCodingSystemThird;
    /**
     * Body site of third injury.
     * 
     */
    @SerializedName("siteOfInjuryThird")
    @Expose
    private String siteOfInjuryThird;
    /**
     * Side of body of third injury.
     * 
     */
    @SerializedName("sideOfInjuryThird")
    @Expose
    private String sideOfInjuryThird;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InjuryRecord() {
    }

    /**
     * 
     * @param timeOfInjury
     * @param dateOfInjury
     * @param siteOfInjuryFirst
     * @param diagnosisOfInjurySecond
     * @param sideOfInjurySecond
     * @param agencyOfAccident
     * @param sideOfInjuryThird
     * @param sideOfInjuryFirst
     * @param diagnosisCodingSystemThird
     * @param diagnosisOfInjuryThird
     * @param siteOfInjuryThird
     * @param diagnosisOfInjuryFirst
     * @param siteOfInjurySecond
     * @param diagnosisCodingSystemFirst
     * @param diagnosisCodingSystemSecond
     * @param geoLocation
     * @param location
     * @param mechanism
     */
    public InjuryRecord(String dateOfInjury, String timeOfInjury, String mechanism, String agencyOfAccident, String location, String geoLocation, String diagnosisOfInjuryFirst, String diagnosisCodingSystemFirst, String siteOfInjuryFirst, String sideOfInjuryFirst, String diagnosisOfInjurySecond, String diagnosisCodingSystemSecond, String siteOfInjurySecond, String sideOfInjurySecond, String diagnosisOfInjuryThird, String diagnosisCodingSystemThird, String siteOfInjuryThird, String sideOfInjuryThird) {
        super();
        this.dateOfInjury = dateOfInjury;
        this.timeOfInjury = timeOfInjury;
        this.mechanism = mechanism;
        this.agencyOfAccident = agencyOfAccident;
        this.location = location;
        this.geoLocation = geoLocation;
        this.diagnosisOfInjuryFirst = diagnosisOfInjuryFirst;
        this.diagnosisCodingSystemFirst = diagnosisCodingSystemFirst;
        this.siteOfInjuryFirst = siteOfInjuryFirst;
        this.sideOfInjuryFirst = sideOfInjuryFirst;
        this.diagnosisOfInjurySecond = diagnosisOfInjurySecond;
        this.diagnosisCodingSystemSecond = diagnosisCodingSystemSecond;
        this.siteOfInjurySecond = siteOfInjurySecond;
        this.sideOfInjurySecond = sideOfInjurySecond;
        this.diagnosisOfInjuryThird = diagnosisOfInjuryThird;
        this.diagnosisCodingSystemThird = diagnosisCodingSystemThird;
        this.siteOfInjuryThird = siteOfInjuryThird;
        this.sideOfInjuryThird = sideOfInjuryThird;
    }

    /**
     * Date employee received injury giving rise to claim (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public String getDateOfInjury() {
        return dateOfInjury;
    }

    /**
     * Date employee received injury giving rise to claim (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public void setDateOfInjury(String dateOfInjury) {
        this.dateOfInjury = dateOfInjury;
    }

    /**
     * Time employee received injury.
     * (Required)
     * 
     */
    public String getTimeOfInjury() {
        return timeOfInjury;
    }

    /**
     * Time employee received injury.
     * (Required)
     * 
     */
    public void setTimeOfInjury(String timeOfInjury) {
        this.timeOfInjury = timeOfInjury;
    }

    /**
     * Mechanism or action that caused the injury.
     * (Required)
     * 
     */
    public String getMechanism() {
        return mechanism;
    }

    /**
     * Mechanism or action that caused the injury.
     * (Required)
     * 
     */
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public String getAgencyOfAccident() {
        return agencyOfAccident;
    }

    /**
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    public void setAgencyOfAccident(String agencyOfAccident) {
        this.agencyOfAccident = agencyOfAccident;
    }

    /**
     * Place of injury occurrences.
     * (Required)
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Place of injury occurrences.
     * (Required)
     * 
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Location where accident occurred.
     * (Required)
     * 
     */
    public String getGeoLocation() {
        return geoLocation;
    }

    /**
     * Location where accident occurred.
     * (Required)
     * 
     */
    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * Diagnosis or nature of injury.
     * (Required)
     * 
     */
    public String getDiagnosisOfInjuryFirst() {
        return diagnosisOfInjuryFirst;
    }

    /**
     * Diagnosis or nature of injury.
     * (Required)
     * 
     */
    public void setDiagnosisOfInjuryFirst(String diagnosisOfInjuryFirst) {
        this.diagnosisOfInjuryFirst = diagnosisOfInjuryFirst;
    }

    /**
     * Coding system used for the diagnosis code of first injury.
     * (Required)
     * 
     */
    public String getDiagnosisCodingSystemFirst() {
        return diagnosisCodingSystemFirst;
    }

    /**
     * Coding system used for the diagnosis code of first injury.
     * (Required)
     * 
     */
    public void setDiagnosisCodingSystemFirst(String diagnosisCodingSystemFirst) {
        this.diagnosisCodingSystemFirst = diagnosisCodingSystemFirst;
    }

    /**
     * Body site of first injury.
     * (Required)
     * 
     */
    public String getSiteOfInjuryFirst() {
        return siteOfInjuryFirst;
    }

    /**
     * Body site of first injury.
     * (Required)
     * 
     */
    public void setSiteOfInjuryFirst(String siteOfInjuryFirst) {
        this.siteOfInjuryFirst = siteOfInjuryFirst;
    }

    /**
     * Side of body of first injury.
     * (Required)
     * 
     */
    public String getSideOfInjuryFirst() {
        return sideOfInjuryFirst;
    }

    /**
     * Side of body of first injury.
     * (Required)
     * 
     */
    public void setSideOfInjuryFirst(String sideOfInjuryFirst) {
        this.sideOfInjuryFirst = sideOfInjuryFirst;
    }

    /**
     * Diagnosis or nature of second injury.
     * 
     */
    public String getDiagnosisOfInjurySecond() {
        return diagnosisOfInjurySecond;
    }

    /**
     * Diagnosis or nature of second injury.
     * 
     */
    public void setDiagnosisOfInjurySecond(String diagnosisOfInjurySecond) {
        this.diagnosisOfInjurySecond = diagnosisOfInjurySecond;
    }

    /**
     * Coding system used for the diagnosis code of second injury.
     * 
     */
    public String getDiagnosisCodingSystemSecond() {
        return diagnosisCodingSystemSecond;
    }

    /**
     * Coding system used for the diagnosis code of second injury.
     * 
     */
    public void setDiagnosisCodingSystemSecond(String diagnosisCodingSystemSecond) {
        this.diagnosisCodingSystemSecond = diagnosisCodingSystemSecond;
    }

    /**
     * Body site of second injury.
     * 
     */
    public String getSiteOfInjurySecond() {
        return siteOfInjurySecond;
    }

    /**
     * Body site of second injury.
     * 
     */
    public void setSiteOfInjurySecond(String siteOfInjurySecond) {
        this.siteOfInjurySecond = siteOfInjurySecond;
    }

    /**
     * Side of body of second injury.
     * 
     */
    public String getSideOfInjurySecond() {
        return sideOfInjurySecond;
    }

    /**
     * Side of body of second injury.
     * 
     */
    public void setSideOfInjurySecond(String sideOfInjurySecond) {
        this.sideOfInjurySecond = sideOfInjurySecond;
    }

    /**
     * Diagnosis or nature of third injury.
     * 
     */
    public String getDiagnosisOfInjuryThird() {
        return diagnosisOfInjuryThird;
    }

    /**
     * Diagnosis or nature of third injury.
     * 
     */
    public void setDiagnosisOfInjuryThird(String diagnosisOfInjuryThird) {
        this.diagnosisOfInjuryThird = diagnosisOfInjuryThird;
    }

    /**
     * Coding system used for the diagnosis code of third injury.
     * 
     */
    public String getDiagnosisCodingSystemThird() {
        return diagnosisCodingSystemThird;
    }

    /**
     * Coding system used for the diagnosis code of third injury.
     * 
     */
    public void setDiagnosisCodingSystemThird(String diagnosisCodingSystemThird) {
        this.diagnosisCodingSystemThird = diagnosisCodingSystemThird;
    }

    /**
     * Body site of third injury.
     * 
     */
    public String getSiteOfInjuryThird() {
        return siteOfInjuryThird;
    }

    /**
     * Body site of third injury.
     * 
     */
    public void setSiteOfInjuryThird(String siteOfInjuryThird) {
        this.siteOfInjuryThird = siteOfInjuryThird;
    }

    /**
     * Side of body of third injury.
     * 
     */
    public String getSideOfInjuryThird() {
        return sideOfInjuryThird;
    }

    /**
     * Side of body of third injury.
     * 
     */
    public void setSideOfInjuryThird(String sideOfInjuryThird) {
        this.sideOfInjuryThird = sideOfInjuryThird;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InjuryRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateOfInjury");
        sb.append('=');
        sb.append(((this.dateOfInjury == null)?"<null>":this.dateOfInjury));
        sb.append(',');
        sb.append("timeOfInjury");
        sb.append('=');
        sb.append(((this.timeOfInjury == null)?"<null>":this.timeOfInjury));
        sb.append(',');
        sb.append("mechanism");
        sb.append('=');
        sb.append(((this.mechanism == null)?"<null>":this.mechanism));
        sb.append(',');
        sb.append("agencyOfAccident");
        sb.append('=');
        sb.append(((this.agencyOfAccident == null)?"<null>":this.agencyOfAccident));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("geoLocation");
        sb.append('=');
        sb.append(((this.geoLocation == null)?"<null>":this.geoLocation));
        sb.append(',');
        sb.append("diagnosisOfInjuryFirst");
        sb.append('=');
        sb.append(((this.diagnosisOfInjuryFirst == null)?"<null>":this.diagnosisOfInjuryFirst));
        sb.append(',');
        sb.append("diagnosisCodingSystemFirst");
        sb.append('=');
        sb.append(((this.diagnosisCodingSystemFirst == null)?"<null>":this.diagnosisCodingSystemFirst));
        sb.append(',');
        sb.append("siteOfInjuryFirst");
        sb.append('=');
        sb.append(((this.siteOfInjuryFirst == null)?"<null>":this.siteOfInjuryFirst));
        sb.append(',');
        sb.append("sideOfInjuryFirst");
        sb.append('=');
        sb.append(((this.sideOfInjuryFirst == null)?"<null>":this.sideOfInjuryFirst));
        sb.append(',');
        sb.append("diagnosisOfInjurySecond");
        sb.append('=');
        sb.append(((this.diagnosisOfInjurySecond == null)?"<null>":this.diagnosisOfInjurySecond));
        sb.append(',');
        sb.append("diagnosisCodingSystemSecond");
        sb.append('=');
        sb.append(((this.diagnosisCodingSystemSecond == null)?"<null>":this.diagnosisCodingSystemSecond));
        sb.append(',');
        sb.append("siteOfInjurySecond");
        sb.append('=');
        sb.append(((this.siteOfInjurySecond == null)?"<null>":this.siteOfInjurySecond));
        sb.append(',');
        sb.append("sideOfInjurySecond");
        sb.append('=');
        sb.append(((this.sideOfInjurySecond == null)?"<null>":this.sideOfInjurySecond));
        sb.append(',');
        sb.append("diagnosisOfInjuryThird");
        sb.append('=');
        sb.append(((this.diagnosisOfInjuryThird == null)?"<null>":this.diagnosisOfInjuryThird));
        sb.append(',');
        sb.append("diagnosisCodingSystemThird");
        sb.append('=');
        sb.append(((this.diagnosisCodingSystemThird == null)?"<null>":this.diagnosisCodingSystemThird));
        sb.append(',');
        sb.append("siteOfInjuryThird");
        sb.append('=');
        sb.append(((this.siteOfInjuryThird == null)?"<null>":this.siteOfInjuryThird));
        sb.append(',');
        sb.append("sideOfInjuryThird");
        sb.append('=');
        sb.append(((this.sideOfInjuryThird == null)?"<null>":this.sideOfInjuryThird));
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
        result = ((result* 31)+((this.timeOfInjury == null)? 0 :this.timeOfInjury.hashCode()));
        result = ((result* 31)+((this.dateOfInjury == null)? 0 :this.dateOfInjury.hashCode()));
        result = ((result* 31)+((this.siteOfInjuryFirst == null)? 0 :this.siteOfInjuryFirst.hashCode()));
        result = ((result* 31)+((this.diagnosisOfInjurySecond == null)? 0 :this.diagnosisOfInjurySecond.hashCode()));
        result = ((result* 31)+((this.sideOfInjurySecond == null)? 0 :this.sideOfInjurySecond.hashCode()));
        result = ((result* 31)+((this.agencyOfAccident == null)? 0 :this.agencyOfAccident.hashCode()));
        result = ((result* 31)+((this.sideOfInjuryThird == null)? 0 :this.sideOfInjuryThird.hashCode()));
        result = ((result* 31)+((this.sideOfInjuryFirst == null)? 0 :this.sideOfInjuryFirst.hashCode()));
        result = ((result* 31)+((this.diagnosisCodingSystemThird == null)? 0 :this.diagnosisCodingSystemThird.hashCode()));
        result = ((result* 31)+((this.diagnosisOfInjuryThird == null)? 0 :this.diagnosisOfInjuryThird.hashCode()));
        result = ((result* 31)+((this.siteOfInjuryThird == null)? 0 :this.siteOfInjuryThird.hashCode()));
        result = ((result* 31)+((this.diagnosisOfInjuryFirst == null)? 0 :this.diagnosisOfInjuryFirst.hashCode()));
        result = ((result* 31)+((this.siteOfInjurySecond == null)? 0 :this.siteOfInjurySecond.hashCode()));
        result = ((result* 31)+((this.diagnosisCodingSystemFirst == null)? 0 :this.diagnosisCodingSystemFirst.hashCode()));
        result = ((result* 31)+((this.diagnosisCodingSystemSecond == null)? 0 :this.diagnosisCodingSystemSecond.hashCode()));
        result = ((result* 31)+((this.geoLocation == null)? 0 :this.geoLocation.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.mechanism == null)? 0 :this.mechanism.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InjuryRecord) == false) {
            return false;
        }
        InjuryRecord rhs = ((InjuryRecord) other);
        return (((((((((((((((((((this.timeOfInjury == rhs.timeOfInjury)||((this.timeOfInjury!= null)&&this.timeOfInjury.equals(rhs.timeOfInjury)))&&((this.dateOfInjury == rhs.dateOfInjury)||((this.dateOfInjury!= null)&&this.dateOfInjury.equals(rhs.dateOfInjury))))&&((this.siteOfInjuryFirst == rhs.siteOfInjuryFirst)||((this.siteOfInjuryFirst!= null)&&this.siteOfInjuryFirst.equals(rhs.siteOfInjuryFirst))))&&((this.diagnosisOfInjurySecond == rhs.diagnosisOfInjurySecond)||((this.diagnosisOfInjurySecond!= null)&&this.diagnosisOfInjurySecond.equals(rhs.diagnosisOfInjurySecond))))&&((this.sideOfInjurySecond == rhs.sideOfInjurySecond)||((this.sideOfInjurySecond!= null)&&this.sideOfInjurySecond.equals(rhs.sideOfInjurySecond))))&&((this.agencyOfAccident == rhs.agencyOfAccident)||((this.agencyOfAccident!= null)&&this.agencyOfAccident.equals(rhs.agencyOfAccident))))&&((this.sideOfInjuryThird == rhs.sideOfInjuryThird)||((this.sideOfInjuryThird!= null)&&this.sideOfInjuryThird.equals(rhs.sideOfInjuryThird))))&&((this.sideOfInjuryFirst == rhs.sideOfInjuryFirst)||((this.sideOfInjuryFirst!= null)&&this.sideOfInjuryFirst.equals(rhs.sideOfInjuryFirst))))&&((this.diagnosisCodingSystemThird == rhs.diagnosisCodingSystemThird)||((this.diagnosisCodingSystemThird!= null)&&this.diagnosisCodingSystemThird.equals(rhs.diagnosisCodingSystemThird))))&&((this.diagnosisOfInjuryThird == rhs.diagnosisOfInjuryThird)||((this.diagnosisOfInjuryThird!= null)&&this.diagnosisOfInjuryThird.equals(rhs.diagnosisOfInjuryThird))))&&((this.siteOfInjuryThird == rhs.siteOfInjuryThird)||((this.siteOfInjuryThird!= null)&&this.siteOfInjuryThird.equals(rhs.siteOfInjuryThird))))&&((this.diagnosisOfInjuryFirst == rhs.diagnosisOfInjuryFirst)||((this.diagnosisOfInjuryFirst!= null)&&this.diagnosisOfInjuryFirst.equals(rhs.diagnosisOfInjuryFirst))))&&((this.siteOfInjurySecond == rhs.siteOfInjurySecond)||((this.siteOfInjurySecond!= null)&&this.siteOfInjurySecond.equals(rhs.siteOfInjurySecond))))&&((this.diagnosisCodingSystemFirst == rhs.diagnosisCodingSystemFirst)||((this.diagnosisCodingSystemFirst!= null)&&this.diagnosisCodingSystemFirst.equals(rhs.diagnosisCodingSystemFirst))))&&((this.diagnosisCodingSystemSecond == rhs.diagnosisCodingSystemSecond)||((this.diagnosisCodingSystemSecond!= null)&&this.diagnosisCodingSystemSecond.equals(rhs.diagnosisCodingSystemSecond))))&&((this.geoLocation == rhs.geoLocation)||((this.geoLocation!= null)&&this.geoLocation.equals(rhs.geoLocation))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.mechanism == rhs.mechanism)||((this.mechanism!= null)&&this.mechanism.equals(rhs.mechanism))));
    }

}
