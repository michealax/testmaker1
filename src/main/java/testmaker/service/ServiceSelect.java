package testmaker.service;

import testmaker.entity.Question;
import testmaker.entity.QuestionLanguage;
import testmaker.entity.QuestionType;
import testmaker.entity.QuestionWithBLOBs;

import java.util.List;

public interface ServiceSelect {
    List<QuestionWithBLOBs> select();
    List<QuestionLanguage> selectLanguages();
    List<QuestionType> selectType();
    List<QuestionWithBLOBs> selectQuestionType();
    List<QuestionWithBLOBs> selectByType(int type);
}
