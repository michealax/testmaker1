package testmaker.entity;

import java.util.Date;

public class QuestionLanguage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_language.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_language.created_on
     *
     * @mbggenerated
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_language.updated_on
     *
     * @mbggenerated
     */
    private Date updatedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_language.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_language.id
     *
     * @return the value of question_language.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_language.id
     *
     * @param id the value for question_language.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_language.created_on
     *
     * @return the value of question_language.created_on
     *
     * @mbggenerated
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_language.created_on
     *
     * @param createdOn the value for question_language.created_on
     *
     * @mbggenerated
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_language.updated_on
     *
     * @return the value of question_language.updated_on
     *
     * @mbggenerated
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_language.updated_on
     *
     * @param updatedOn the value for question_language.updated_on
     *
     * @mbggenerated
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_language.name
     *
     * @return the value of question_language.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_language.name
     *
     * @param name the value for question_language.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}