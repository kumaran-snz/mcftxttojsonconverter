
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Details of an employee who had an accident.
 * 
 */
@Generated("jsonschema2pojo")
public class EmployeeRecord {

    /**
     * Employee’s family name.
     * 
     */
    @SerializedName("surname")
    @Expose
    private String surname;
    /**
     * Employee’s given names.
     * 
     */
    @SerializedName("otherNames")
    @Expose
    private String otherNames;
    /**
     * First line of employee’s address.
     * 
     */
    @SerializedName("address1")
    @Expose
    private String address1;
    /**
     * Second line of employee’s address.
     * 
     */
    @SerializedName("address2")
    @Expose
    private String address2;
    /**
     * Third line of employee’s address. Hometown or locality.
     * 
     */
    @SerializedName("address3")
    @Expose
    private String address3;
    /**
     * Employee’s postcode.
     * 
     */
    @SerializedName("postcode")
    @Expose
    private String postcode;
    /**
     * Employee’s occupation at time of injury.
     * 
     */
    @SerializedName("occupation")
    @Expose
    private String occupation;
    /**
     * Employee’s birth date (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    /**
     * Employee’s gender.
     * 
     */
    @SerializedName("gender")
    @Expose
    private String gender;
    /**
     * Employee’s ethnicity.
     * 
     */
    @SerializedName("ethnicity")
    @Expose
    private int ethnicity;
    /**
     * Classification Unit code that the Employee’s earnings are against.
     * 
     */
    @SerializedName("employeeCU")
    @Expose
    private String employeeCU;
    /**
     * Employer’s identifier for the Employee.
     * (Required)
     * 
     */
    @SerializedName("employersEmployeeId")
    @Expose
    private String employersEmployeeId;
    /**
     * To indicate the employees work type classification.
     * 
     */
    @SerializedName("jobClassification")
    @Expose
    private String jobClassification;
    /**
     * Employee's (work/home/mobile) phone number.
     * (Required)
     * 
     */
    @SerializedName("phone")
    @Expose
    private String phone;
    /**
     * Employee's work email address.
     * (Required)
     * 
     */
    @SerializedName("workEmail")
    @Expose
    private String workEmail;
    /**
     * Employee's personal email address.
     * (Required)
     * 
     */
    @SerializedName("homeEmail")
    @Expose
    private String homeEmail;
    /**
     * National Health Index - used by MOH to identify individuals in the national health system.
     * 
     */
    @SerializedName("nhiNumber ")
    @Expose
    private String nhiNumber;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmployeeRecord() {
    }

    /**
     * 
     * @param occupation
     * @param employeeCU
     * @param address3
     * @param gender
     * @param ethnicity
     * @param address2
     * @param workEmail
     * @param address1
     * @param employersEmployeeId
     * @param jobClassification
     * @param postcode
     * @param dateOfBirth
     * @param homeEmail
     * @param otherNames
     * @param phone
     * @param surname
     * @param nhiNumber
     */
    public EmployeeRecord(String surname, String otherNames, String address1, String address2, String address3, String postcode, String occupation, String dateOfBirth, String gender, int ethnicity, String employeeCU, String employersEmployeeId, String jobClassification, String phone, String workEmail, String homeEmail, String nhiNumber) {
        super();
        this.surname = surname;
        this.otherNames = otherNames;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.postcode = postcode;
        this.occupation = occupation;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.employeeCU = employeeCU;
        this.employersEmployeeId = employersEmployeeId;
        this.jobClassification = jobClassification;
        this.phone = phone;
        this.workEmail = workEmail;
        this.homeEmail = homeEmail;
        this.nhiNumber = nhiNumber;
    }

    /**
     * Employee’s family name.
     * 
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Employee’s family name.
     * 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Employee’s given names.
     * 
     */
    public String getOtherNames() {
        return otherNames;
    }

    /**
     * Employee’s given names.
     * 
     */
    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    /**
     * First line of employee’s address.
     * 
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * First line of employee’s address.
     * 
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Second line of employee’s address.
     * 
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Second line of employee’s address.
     * 
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Third line of employee’s address. Hometown or locality.
     * 
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Third line of employee’s address. Hometown or locality.
     * 
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * Employee’s postcode.
     * 
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Employee’s postcode.
     * 
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Employee’s occupation at time of injury.
     * 
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Employee’s occupation at time of injury.
     * 
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Employee’s birth date (Date Format = DDMMYYYY).
     * 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Employee’s birth date (Date Format = DDMMYYYY).
     * 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Employee’s gender.
     * 
     */
    public String getGender() {
        return gender;
    }

    /**
     * Employee’s gender.
     * 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Employee’s ethnicity.
     * 
     */
    public int getEthnicity() {
        return ethnicity;
    }

    /**
     * Employee’s ethnicity.
     * 
     */
    public void setEthnicity(int ethnicity) {
        this.ethnicity = ethnicity;
    }

    /**
     * Classification Unit code that the Employee’s earnings are against.
     * 
     */
    public String getEmployeeCU() {
        return employeeCU;
    }

    /**
     * Classification Unit code that the Employee’s earnings are against.
     * 
     */
    public void setEmployeeCU(String employeeCU) {
        this.employeeCU = employeeCU;
    }

    /**
     * Employer’s identifier for the Employee.
     * (Required)
     * 
     */
    public String getEmployersEmployeeId() {
        return employersEmployeeId;
    }

    /**
     * Employer’s identifier for the Employee.
     * (Required)
     * 
     */
    public void setEmployersEmployeeId(String employersEmployeeId) {
        this.employersEmployeeId = employersEmployeeId;
    }

    /**
     * To indicate the employees work type classification.
     * 
     */
    public String getJobClassification() {
        return jobClassification;
    }

    /**
     * To indicate the employees work type classification.
     * 
     */
    public void setJobClassification(String jobClassification) {
        this.jobClassification = jobClassification;
    }

    /**
     * Employee's (work/home/mobile) phone number.
     * (Required)
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Employee's (work/home/mobile) phone number.
     * (Required)
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Employee's work email address.
     * (Required)
     * 
     */
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * Employee's work email address.
     * (Required)
     * 
     */
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    /**
     * Employee's personal email address.
     * (Required)
     * 
     */
    public String getHomeEmail() {
        return homeEmail;
    }

    /**
     * Employee's personal email address.
     * (Required)
     * 
     */
    public void setHomeEmail(String homeEmail) {
        this.homeEmail = homeEmail;
    }

    /**
     * National Health Index - used by MOH to identify individuals in the national health system.
     * 
     */
    public String getNhiNumber() {
        return nhiNumber;
    }

    /**
     * National Health Index - used by MOH to identify individuals in the national health system.
     * 
     */
    public void setNhiNumber(String nhiNumber) {
        this.nhiNumber = nhiNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("surname");
        sb.append('=');
        sb.append(((this.surname == null)?"<null>":this.surname));
        sb.append(',');
        sb.append("otherNames");
        sb.append('=');
        sb.append(((this.otherNames == null)?"<null>":this.otherNames));
        sb.append(',');
        sb.append("address1");
        sb.append('=');
        sb.append(((this.address1 == null)?"<null>":this.address1));
        sb.append(',');
        sb.append("address2");
        sb.append('=');
        sb.append(((this.address2 == null)?"<null>":this.address2));
        sb.append(',');
        sb.append("address3");
        sb.append('=');
        sb.append(((this.address3 == null)?"<null>":this.address3));
        sb.append(',');
        sb.append("postcode");
        sb.append('=');
        sb.append(((this.postcode == null)?"<null>":this.postcode));
        sb.append(',');
        sb.append("occupation");
        sb.append('=');
        sb.append(((this.occupation == null)?"<null>":this.occupation));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("ethnicity");
        sb.append('=');
        sb.append(this.ethnicity);
        sb.append(',');
        sb.append("employeeCU");
        sb.append('=');
        sb.append(((this.employeeCU == null)?"<null>":this.employeeCU));
        sb.append(',');
        sb.append("employersEmployeeId");
        sb.append('=');
        sb.append(((this.employersEmployeeId == null)?"<null>":this.employersEmployeeId));
        sb.append(',');
        sb.append("jobClassification");
        sb.append('=');
        sb.append(((this.jobClassification == null)?"<null>":this.jobClassification));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("workEmail");
        sb.append('=');
        sb.append(((this.workEmail == null)?"<null>":this.workEmail));
        sb.append(',');
        sb.append("homeEmail");
        sb.append('=');
        sb.append(((this.homeEmail == null)?"<null>":this.homeEmail));
        sb.append(',');
        sb.append("nhiNumber");
        sb.append('=');
        sb.append(((this.nhiNumber == null)?"<null>":this.nhiNumber));
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
        result = ((result* 31)+((this.occupation == null)? 0 :this.occupation.hashCode()));
        result = ((result* 31)+((this.employeeCU == null)? 0 :this.employeeCU.hashCode()));
        result = ((result* 31)+((this.address3 == null)? 0 :this.address3 .hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+ this.ethnicity);
        result = ((result* 31)+((this.address2 == null)? 0 :this.address2 .hashCode()));
        result = ((result* 31)+((this.workEmail == null)? 0 :this.workEmail.hashCode()));
        result = ((result* 31)+((this.address1 == null)? 0 :this.address1 .hashCode()));
        result = ((result* 31)+((this.employersEmployeeId == null)? 0 :this.employersEmployeeId.hashCode()));
        result = ((result* 31)+((this.jobClassification == null)? 0 :this.jobClassification.hashCode()));
        result = ((result* 31)+((this.postcode == null)? 0 :this.postcode.hashCode()));
        result = ((result* 31)+((this.dateOfBirth == null)? 0 :this.dateOfBirth.hashCode()));
        result = ((result* 31)+((this.homeEmail == null)? 0 :this.homeEmail.hashCode()));
        result = ((result* 31)+((this.otherNames == null)? 0 :this.otherNames.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.surname == null)? 0 :this.surname.hashCode()));
        result = ((result* 31)+((this.nhiNumber == null)? 0 :this.nhiNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeRecord) == false) {
            return false;
        }
        EmployeeRecord rhs = ((EmployeeRecord) other);
        return ((((((((((((((((((this.occupation == rhs.occupation)||((this.occupation!= null)&&this.occupation.equals(rhs.occupation)))&&((this.employeeCU == rhs.employeeCU)||((this.employeeCU!= null)&&this.employeeCU.equals(rhs.employeeCU))))&&((this.address3 == rhs.address3)||((this.address3 != null)&&this.address3 .equals(rhs.address3))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&(this.ethnicity == rhs.ethnicity))&&((this.address2 == rhs.address2)||((this.address2 != null)&&this.address2 .equals(rhs.address2))))&&((this.workEmail == rhs.workEmail)||((this.workEmail!= null)&&this.workEmail.equals(rhs.workEmail))))&&((this.address1 == rhs.address1)||((this.address1 != null)&&this.address1 .equals(rhs.address1))))&&((this.employersEmployeeId == rhs.employersEmployeeId)||((this.employersEmployeeId!= null)&&this.employersEmployeeId.equals(rhs.employersEmployeeId))))&&((this.jobClassification == rhs.jobClassification)||((this.jobClassification!= null)&&this.jobClassification.equals(rhs.jobClassification))))&&((this.postcode == rhs.postcode)||((this.postcode!= null)&&this.postcode.equals(rhs.postcode))))&&((this.dateOfBirth == rhs.dateOfBirth)||((this.dateOfBirth!= null)&&this.dateOfBirth.equals(rhs.dateOfBirth))))&&((this.homeEmail == rhs.homeEmail)||((this.homeEmail!= null)&&this.homeEmail.equals(rhs.homeEmail))))&&((this.otherNames == rhs.otherNames)||((this.otherNames!= null)&&this.otherNames.equals(rhs.otherNames))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.surname == rhs.surname)||((this.surname!= null)&&this.surname.equals(rhs.surname))))&&((this.nhiNumber == rhs.nhiNumber)||((this.nhiNumber!= null)&&this.nhiNumber.equals(rhs.nhiNumber))));
    }

}
