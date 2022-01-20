
package nz.co.acc.mcftxttojsonconverter.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Provides details of review outcomes.
 * 
 */
@Generated("jsonschema2pojo")
public class ReviewRecord {

    /**
     * Unique Identifier for a review against a claim.
     * (Required)
     * 
     */
    @SerializedName("reviewIdentifier")
    @Expose
    private String reviewIdentifier;
    /**
     * Details the coding for reviews.
     * (Required)
     * 
     */
    @SerializedName("natureOfReview")
    @Expose
    private String natureOfReview;
    /**
     * Describes when the review was filed (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    @SerializedName("dateReviewFiled")
    @Expose
    private String dateReviewFiled;
    /**
     * Describes who has filed the review.
     * (Required)
     * 
     */
    @SerializedName("whoFiledReview")
    @Expose
    private String whoFiledReview;
    /**
     * Describes the outcome of the AE review.
     * 
     */
    @SerializedName("administrativeReviewOutcome")
    @Expose
    private String administrativeReviewOutcome;
    /**
     * Date Format = DDMMYYYY
     * 
     */
    @SerializedName("dateAeSendsInformationToReviewer")
    @Expose
    private String dateAeSendsInformationToReviewer;
    /**
     * Describes when the case conference was held (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("caseConferenceDate")
    @Expose
    private String caseConferenceDate;
    /**
     * Describes when the Review Hearing started (Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("reviewHearingStartDate")
    @Expose
    private String reviewHearingStartDate;
    /**
     * Describes when the decision arising from the Review Hearing was made(Date Format = DDMMYYYY).
     * 
     */
    @SerializedName("reviewDecisionDate")
    @Expose
    private String reviewDecisionDate;
    /**
     * Describes the outcome of the review hearing.
     * 
     */
    @SerializedName("reviewOutcome")
    @Expose
    private String reviewOutcome;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReviewRecord() {
    }

    /**
     * 
     * @param natureOfReview
     * @param reviewOutcome
     * @param dateAeSendsInformationToReviewer
     * @param dateReviewFiled
     * @param whoFiledReview
     * @param reviewHearingStartDate
     * @param reviewDecisionDate
     * @param reviewIdentifier
     * @param administrativeReviewOutcome
     * @param caseConferenceDate
     */
    public ReviewRecord(String reviewIdentifier, String natureOfReview, String dateReviewFiled, String whoFiledReview, String administrativeReviewOutcome, String dateAeSendsInformationToReviewer, String caseConferenceDate, String reviewHearingStartDate, String reviewDecisionDate, String reviewOutcome) {
        super();
        this.reviewIdentifier = reviewIdentifier;
        this.natureOfReview = natureOfReview;
        this.dateReviewFiled = dateReviewFiled;
        this.whoFiledReview = whoFiledReview;
        this.administrativeReviewOutcome = administrativeReviewOutcome;
        this.dateAeSendsInformationToReviewer = dateAeSendsInformationToReviewer;
        this.caseConferenceDate = caseConferenceDate;
        this.reviewHearingStartDate = reviewHearingStartDate;
        this.reviewDecisionDate = reviewDecisionDate;
        this.reviewOutcome = reviewOutcome;
    }

    /**
     * Unique Identifier for a review against a claim.
     * (Required)
     * 
     */
    public String getReviewIdentifier() {
        return reviewIdentifier;
    }

    /**
     * Unique Identifier for a review against a claim.
     * (Required)
     * 
     */
    public void setReviewIdentifier(String reviewIdentifier) {
        this.reviewIdentifier = reviewIdentifier;
    }

    /**
     * Details the coding for reviews.
     * (Required)
     * 
     */
    public String getNatureOfReview() {
        return natureOfReview;
    }

    /**
     * Details the coding for reviews.
     * (Required)
     * 
     */
    public void setNatureOfReview(String natureOfReview) {
        this.natureOfReview = natureOfReview;
    }

    /**
     * Describes when the review was filed (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public String getDateReviewFiled() {
        return dateReviewFiled;
    }

    /**
     * Describes when the review was filed (Date Format = DDMMYYYY).
     * (Required)
     * 
     */
    public void setDateReviewFiled(String dateReviewFiled) {
        this.dateReviewFiled = dateReviewFiled;
    }

    /**
     * Describes who has filed the review.
     * (Required)
     * 
     */
    public String getWhoFiledReview() {
        return whoFiledReview;
    }

    /**
     * Describes who has filed the review.
     * (Required)
     * 
     */
    public void setWhoFiledReview(String whoFiledReview) {
        this.whoFiledReview = whoFiledReview;
    }

    /**
     * Describes the outcome of the AE review.
     * 
     */
    public String getAdministrativeReviewOutcome() {
        return administrativeReviewOutcome;
    }

    /**
     * Describes the outcome of the AE review.
     * 
     */
    public void setAdministrativeReviewOutcome(String administrativeReviewOutcome) {
        this.administrativeReviewOutcome = administrativeReviewOutcome;
    }

    /**
     * Date Format = DDMMYYYY
     * 
     */
    public String getDateAeSendsInformationToReviewer() {
        return dateAeSendsInformationToReviewer;
    }

    /**
     * Date Format = DDMMYYYY
     * 
     */
    public void setDateAeSendsInformationToReviewer(String dateAeSendsInformationToReviewer) {
        this.dateAeSendsInformationToReviewer = dateAeSendsInformationToReviewer;
    }

    /**
     * Describes when the case conference was held (Date Format = DDMMYYYY).
     * 
     */
    public String getCaseConferenceDate() {
        return caseConferenceDate;
    }

    /**
     * Describes when the case conference was held (Date Format = DDMMYYYY).
     * 
     */
    public void setCaseConferenceDate(String caseConferenceDate) {
        this.caseConferenceDate = caseConferenceDate;
    }

    /**
     * Describes when the Review Hearing started (Date Format = DDMMYYYY).
     * 
     */
    public String getReviewHearingStartDate() {
        return reviewHearingStartDate;
    }

    /**
     * Describes when the Review Hearing started (Date Format = DDMMYYYY).
     * 
     */
    public void setReviewHearingStartDate(String reviewHearingStartDate) {
        this.reviewHearingStartDate = reviewHearingStartDate;
    }

    /**
     * Describes when the decision arising from the Review Hearing was made(Date Format = DDMMYYYY).
     * 
     */
    public String getReviewDecisionDate() {
        return reviewDecisionDate;
    }

    /**
     * Describes when the decision arising from the Review Hearing was made(Date Format = DDMMYYYY).
     * 
     */
    public void setReviewDecisionDate(String reviewDecisionDate) {
        this.reviewDecisionDate = reviewDecisionDate;
    }

    /**
     * Describes the outcome of the review hearing.
     * 
     */
    public String getReviewOutcome() {
        return reviewOutcome;
    }

    /**
     * Describes the outcome of the review hearing.
     * 
     */
    public void setReviewOutcome(String reviewOutcome) {
        this.reviewOutcome = reviewOutcome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReviewRecord.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reviewIdentifier");
        sb.append('=');
        sb.append(((this.reviewIdentifier == null)?"<null>":this.reviewIdentifier));
        sb.append(',');
        sb.append("natureOfReview");
        sb.append('=');
        sb.append(((this.natureOfReview == null)?"<null>":this.natureOfReview));
        sb.append(',');
        sb.append("dateReviewFiled");
        sb.append('=');
        sb.append(((this.dateReviewFiled == null)?"<null>":this.dateReviewFiled));
        sb.append(',');
        sb.append("whoFiledReview");
        sb.append('=');
        sb.append(((this.whoFiledReview == null)?"<null>":this.whoFiledReview));
        sb.append(',');
        sb.append("administrativeReviewOutcome");
        sb.append('=');
        sb.append(((this.administrativeReviewOutcome == null)?"<null>":this.administrativeReviewOutcome));
        sb.append(',');
        sb.append("dateAeSendsInformationToReviewer");
        sb.append('=');
        sb.append(((this.dateAeSendsInformationToReviewer == null)?"<null>":this.dateAeSendsInformationToReviewer));
        sb.append(',');
        sb.append("caseConferenceDate");
        sb.append('=');
        sb.append(((this.caseConferenceDate == null)?"<null>":this.caseConferenceDate));
        sb.append(',');
        sb.append("reviewHearingStartDate");
        sb.append('=');
        sb.append(((this.reviewHearingStartDate == null)?"<null>":this.reviewHearingStartDate));
        sb.append(',');
        sb.append("reviewDecisionDate");
        sb.append('=');
        sb.append(((this.reviewDecisionDate == null)?"<null>":this.reviewDecisionDate));
        sb.append(',');
        sb.append("reviewOutcome");
        sb.append('=');
        sb.append(((this.reviewOutcome == null)?"<null>":this.reviewOutcome));
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
        result = ((result* 31)+((this.natureOfReview == null)? 0 :this.natureOfReview.hashCode()));
        result = ((result* 31)+((this.reviewOutcome == null)? 0 :this.reviewOutcome.hashCode()));
        result = ((result* 31)+((this.dateAeSendsInformationToReviewer == null)? 0 :this.dateAeSendsInformationToReviewer.hashCode()));
        result = ((result* 31)+((this.dateReviewFiled == null)? 0 :this.dateReviewFiled.hashCode()));
        result = ((result* 31)+((this.whoFiledReview == null)? 0 :this.whoFiledReview.hashCode()));
        result = ((result* 31)+((this.reviewHearingStartDate == null)? 0 :this.reviewHearingStartDate.hashCode()));
        result = ((result* 31)+((this.reviewDecisionDate == null)? 0 :this.reviewDecisionDate.hashCode()));
        result = ((result* 31)+((this.reviewIdentifier == null)? 0 :this.reviewIdentifier.hashCode()));
        result = ((result* 31)+((this.administrativeReviewOutcome == null)? 0 :this.administrativeReviewOutcome.hashCode()));
        result = ((result* 31)+((this.caseConferenceDate == null)? 0 :this.caseConferenceDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReviewRecord) == false) {
            return false;
        }
        ReviewRecord rhs = ((ReviewRecord) other);
        return (((((((((((this.natureOfReview == rhs.natureOfReview)||((this.natureOfReview!= null)&&this.natureOfReview.equals(rhs.natureOfReview)))&&((this.reviewOutcome == rhs.reviewOutcome)||((this.reviewOutcome!= null)&&this.reviewOutcome.equals(rhs.reviewOutcome))))&&((this.dateAeSendsInformationToReviewer == rhs.dateAeSendsInformationToReviewer)||((this.dateAeSendsInformationToReviewer!= null)&&this.dateAeSendsInformationToReviewer.equals(rhs.dateAeSendsInformationToReviewer))))&&((this.dateReviewFiled == rhs.dateReviewFiled)||((this.dateReviewFiled!= null)&&this.dateReviewFiled.equals(rhs.dateReviewFiled))))&&((this.whoFiledReview == rhs.whoFiledReview)||((this.whoFiledReview!= null)&&this.whoFiledReview.equals(rhs.whoFiledReview))))&&((this.reviewHearingStartDate == rhs.reviewHearingStartDate)||((this.reviewHearingStartDate!= null)&&this.reviewHearingStartDate.equals(rhs.reviewHearingStartDate))))&&((this.reviewDecisionDate == rhs.reviewDecisionDate)||((this.reviewDecisionDate!= null)&&this.reviewDecisionDate.equals(rhs.reviewDecisionDate))))&&((this.reviewIdentifier == rhs.reviewIdentifier)||((this.reviewIdentifier!= null)&&this.reviewIdentifier.equals(rhs.reviewIdentifier))))&&((this.administrativeReviewOutcome == rhs.administrativeReviewOutcome)||((this.administrativeReviewOutcome!= null)&&this.administrativeReviewOutcome.equals(rhs.administrativeReviewOutcome))))&&((this.caseConferenceDate == rhs.caseConferenceDate)||((this.caseConferenceDate!= null)&&this.caseConferenceDate.equals(rhs.caseConferenceDate))));
    }

}
