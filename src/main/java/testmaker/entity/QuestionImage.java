package testmaker.entity;

import java.util.Date;

public class QuestionImage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.created_on
     *
     * @mbggenerated
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.updated_on
     *
     * @mbggenerated
     */
    private Date updatedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.caption
     *
     * @mbggenerated
     */
    private String caption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_image.question_id
     *
     * @mbggenerated
     */
    private Integer questionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.id
     *
     * @return the value of question_image.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.id
     *
     * @param id the value for question_image.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.created_on
     *
     * @return the value of question_image.created_on
     *
     * @mbggenerated
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.created_on
     *
     * @param createdOn the value for question_image.created_on
     *
     * @mbggenerated
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.updated_on
     *
     * @return the value of question_image.updated_on
     *
     * @mbggenerated
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.updated_on
     *
     * @param updatedOn the value for question_image.updated_on
     *
     * @mbggenerated
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.path
     *
     * @return the value of question_image.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.path
     *
     * @param path the value for question_image.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.caption
     *
     * @return the value of question_image.caption
     *
     * @mbggenerated
     */
    public String getCaption() {
        return caption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.caption
     *
     * @param caption the value for question_image.caption
     *
     * @mbggenerated
     */
    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_image.question_id
     *
     * @return the value of question_image.question_id
     *
     * @mbggenerated
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_image.question_id
     *
     * @param questionId the value for question_image.question_id
     *
     * @mbggenerated
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}