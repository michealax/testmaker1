package testmaker.entity;

import java.util.Date;

public class KnowledgePoint {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.created_on
     *
     * @mbggenerated
     */
    private Date createdOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.updated_on
     *
     * @mbggenerated
     */
    private Date updatedOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.k_level
     *
     * @mbggenerated
     */
    private String kLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.number
     *
     * @mbggenerated
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.score
     *
     * @mbggenerated
     */
    private Short score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column knowledge_point.chapter_id
     *
     * @mbggenerated
     */
    private Integer chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.id
     *
     * @return the value of knowledge_point.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.id
     *
     * @param id the value for knowledge_point.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.created_on
     *
     * @return the value of knowledge_point.created_on
     *
     * @mbggenerated
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.created_on
     *
     * @param createdOn the value for knowledge_point.created_on
     *
     * @mbggenerated
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.updated_on
     *
     * @return the value of knowledge_point.updated_on
     *
     * @mbggenerated
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.updated_on
     *
     * @param updatedOn the value for knowledge_point.updated_on
     *
     * @mbggenerated
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.k_level
     *
     * @return the value of knowledge_point.k_level
     *
     * @mbggenerated
     */
    public String getkLevel() {
        return kLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.k_level
     *
     * @param kLevel the value for knowledge_point.k_level
     *
     * @mbggenerated
     */
    public void setkLevel(String kLevel) {
        this.kLevel = kLevel == null ? null : kLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.number
     *
     * @return the value of knowledge_point.number
     *
     * @mbggenerated
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.number
     *
     * @param number the value for knowledge_point.number
     *
     * @mbggenerated
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.score
     *
     * @return the value of knowledge_point.score
     *
     * @mbggenerated
     */
    public Short getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.score
     *
     * @param score the value for knowledge_point.score
     *
     * @mbggenerated
     */
    public void setScore(Short score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.title
     *
     * @return the value of knowledge_point.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.title
     *
     * @param title the value for knowledge_point.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column knowledge_point.chapter_id
     *
     * @return the value of knowledge_point.chapter_id
     *
     * @mbggenerated
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column knowledge_point.chapter_id
     *
     * @param chapterId the value for knowledge_point.chapter_id
     *
     * @mbggenerated
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }
}