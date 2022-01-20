
package nz.co.acc.mcftxttojsonconverter.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The root schema
 * <p>
 * The root schema comprises the entire JSON document.
 * 
 */
@Generated("jsonschema2pojo")
public class FileMetaData {

    /**
     * Identifies the format version to which this file conforms.
     * (Required)
     * 
     */
    @SerializedName("formatVersion")
    @Expose
    private FileMetaData.FormatVersion formatVersion;
    /**
     * Calendar month in which the data pertains.
     * (Required)
     * 
     */
    @SerializedName("periodMonth")
    @Expose
    private int periodMonth;
    /**
     * Calendar year in which the data pertains.
     * (Required)
     * 
     */
    @SerializedName("periodYear")
    @Expose
    private int periodYear;
    /**
     * Date of file submission (Date Format = DDMMYYYY)..
     * (Required)
     * 
     */
    @SerializedName("fileSubmissionDate")
    @Expose
    private String fileSubmissionDate;
    /**
     * The system to which the batch records are being sent.
     * (Required)
     * 
     */
    @SerializedName("accProcessingEnv")
    @Expose
    private FileMetaData.AccProcessingEnv accProcessingEnv;
    /**
     * List of accredited employers listed in this monthly claim file (MCF).
     * (Required)
     * 
     */
    @SerializedName("accreditedEmployers")
    @Expose
    private List<AccreditedEmployer> accreditedEmployers = new ArrayList<AccreditedEmployer>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileMetaData() {
    }

    /**
     * 
     * @param periodYear
     * @param accreditedEmployers
     * @param periodMonth
     * @param accProcessingEnv
     * @param fileSubmissionDate
     * @param formatVersion
     */
    public FileMetaData(FileMetaData.FormatVersion formatVersion, int periodMonth, int periodYear, String fileSubmissionDate, FileMetaData.AccProcessingEnv accProcessingEnv, List<AccreditedEmployer> accreditedEmployers) {
        super();
        this.formatVersion = formatVersion;
        this.periodMonth = periodMonth;
        this.periodYear = periodYear;
        this.fileSubmissionDate = fileSubmissionDate;
        this.accProcessingEnv = accProcessingEnv;
        this.accreditedEmployers = accreditedEmployers;
    }

    /**
     * Identifies the format version to which this file conforms.
     * (Required)
     * 
     */
    public FileMetaData.FormatVersion getFormatVersion() {
        return formatVersion;
    }

    /**
     * Identifies the format version to which this file conforms.
     * (Required)
     * 
     */
    public void setFormatVersion(FileMetaData.FormatVersion formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * Calendar month in which the data pertains.
     * (Required)
     * 
     */
    public int getPeriodMonth() {
        return periodMonth;
    }

    /**
     * Calendar month in which the data pertains.
     * (Required)
     * 
     */
    public void setPeriodMonth(int periodMonth) {
        this.periodMonth = periodMonth;
    }

    /**
     * Calendar year in which the data pertains.
     * (Required)
     * 
     */
    public int getPeriodYear() {
        return periodYear;
    }

    /**
     * Calendar year in which the data pertains.
     * (Required)
     * 
     */
    public void setPeriodYear(int periodYear) {
        this.periodYear = periodYear;
    }

    /**
     * Date of file submission (Date Format = DDMMYYYY)..
     * (Required)
     * 
     */
    public String getFileSubmissionDate() {
        return fileSubmissionDate;
    }

    /**
     * Date of file submission (Date Format = DDMMYYYY)..
     * (Required)
     * 
     */
    public void setFileSubmissionDate(String fileSubmissionDate) {
        this.fileSubmissionDate = fileSubmissionDate;
    }

    /**
     * The system to which the batch records are being sent.
     * (Required)
     * 
     */
    public FileMetaData.AccProcessingEnv getAccProcessingEnv() {
        return accProcessingEnv;
    }

    /**
     * The system to which the batch records are being sent.
     * (Required)
     * 
     */
    public void setAccProcessingEnv(FileMetaData.AccProcessingEnv accProcessingEnv) {
        this.accProcessingEnv = accProcessingEnv;
    }

    /**
     * List of accredited employers listed in this monthly claim file (MCF).
     * (Required)
     * 
     */
    public List<AccreditedEmployer> getAccreditedEmployers() {
        return accreditedEmployers;
    }

    /**
     * List of accredited employers listed in this monthly claim file (MCF).
     * (Required)
     * 
     */
    public void setAccreditedEmployers(List<AccreditedEmployer> accreditedEmployers) {
        this.accreditedEmployers = accreditedEmployers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FileMetaData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formatVersion");
        sb.append('=');
        sb.append(((this.formatVersion == null)?"<null>":this.formatVersion));
        sb.append(',');
        sb.append("periodMonth");
        sb.append('=');
        sb.append(this.periodMonth);
        sb.append(',');
        sb.append("periodYear");
        sb.append('=');
        sb.append(this.periodYear);
        sb.append(',');
        sb.append("fileSubmissionDate");
        sb.append('=');
        sb.append(((this.fileSubmissionDate == null)?"<null>":this.fileSubmissionDate));
        sb.append(',');
        sb.append("accProcessingEnv");
        sb.append('=');
        sb.append(((this.accProcessingEnv == null)?"<null>":this.accProcessingEnv));
        sb.append(',');
        sb.append("accreditedEmployers");
        sb.append('=');
        sb.append(((this.accreditedEmployers == null)?"<null>":this.accreditedEmployers));
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
        result = ((result* 31)+ this.periodYear);
        result = ((result* 31)+((this.accreditedEmployers == null)? 0 :this.accreditedEmployers.hashCode()));
        result = ((result* 31)+ this.periodMonth);
        result = ((result* 31)+((this.accProcessingEnv == null)? 0 :this.accProcessingEnv.hashCode()));
        result = ((result* 31)+((this.fileSubmissionDate == null)? 0 :this.fileSubmissionDate.hashCode()));
        result = ((result* 31)+((this.formatVersion == null)? 0 :this.formatVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileMetaData) == false) {
            return false;
        }
        FileMetaData rhs = ((FileMetaData) other);
        return ((((((this.periodYear == rhs.periodYear)&&((this.accreditedEmployers == rhs.accreditedEmployers)||((this.accreditedEmployers!= null)&&this.accreditedEmployers.equals(rhs.accreditedEmployers))))&&(this.periodMonth == rhs.periodMonth))&&((this.accProcessingEnv == rhs.accProcessingEnv)||((this.accProcessingEnv!= null)&&this.accProcessingEnv.equals(rhs.accProcessingEnv))))&&((this.fileSubmissionDate == rhs.fileSubmissionDate)||((this.fileSubmissionDate!= null)&&this.fileSubmissionDate.equals(rhs.fileSubmissionDate))))&&((this.formatVersion == rhs.formatVersion)||((this.formatVersion!= null)&&this.formatVersion.equals(rhs.formatVersion))));
    }


    /**
     * The system to which the batch records are being sent.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AccProcessingEnv {

        @SerializedName("PROD")
        PROD("PROD");
        private final String value;
        private final static Map<String, FileMetaData.AccProcessingEnv> CONSTANTS = new HashMap<String, FileMetaData.AccProcessingEnv>();

        static {
            for (FileMetaData.AccProcessingEnv c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AccProcessingEnv(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FileMetaData.AccProcessingEnv fromValue(String value) {
            FileMetaData.AccProcessingEnv constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Identifies the format version to which this file conforms.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FormatVersion {

        @SerializedName("3")
        _3("3");
        private final String value;
        private final static Map<String, FileMetaData.FormatVersion> CONSTANTS = new HashMap<String, FileMetaData.FormatVersion>();

        static {
            for (FileMetaData.FormatVersion c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FormatVersion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static FileMetaData.FormatVersion fromValue(String value) {
            FileMetaData.FormatVersion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
