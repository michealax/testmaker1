package testmaker.dao;

import testmaker.entity.QuestionChoiceImage;

public interface QuestionChoiceImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    int insert(QuestionChoiceImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    int insertSelective(QuestionChoiceImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    QuestionChoiceImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QuestionChoiceImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_choice_image
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QuestionChoiceImage record);
}