package testmaker.dao;

import testmaker.entity.QuestionUserKey;

public interface QuestionUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(QuestionUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_user
     *
     * @mbggenerated
     */
    int insert(QuestionUserKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_user
     *
     * @mbggenerated
     */
    int insertSelective(QuestionUserKey record);
}