package testmaker.service;

import org.springframework.stereotype.Service;
import testmaker.dao.QuestionLanguageMapper;
import testmaker.dao.QuestionMapper;
import testmaker.dao.QuestionTypeMapper;
import testmaker.entity.QuestionLanguage;
import testmaker.entity.QuestionType;
import testmaker.entity.QuestionWithBLOBs;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceSelectImp implements ServiceSelect {
    @Resource
    QuestionMapper questionMapper;

    @Resource
    QuestionLanguageMapper questionLanguageMapper;

    @Resource
    QuestionTypeMapper questionTypeMapper;

    @Override
    public List<QuestionWithBLOBs> select() {
        return questionMapper.selectByNULL();
    }

    @Override
    public List<QuestionLanguage> selectLanguages() {
        return questionLanguageMapper.selectLanguages();
    }

    @Override
    public List<QuestionType> selectType() {
        return questionTypeMapper.selectType();
    }

    @Override
    public List<QuestionWithBLOBs> selectQuestionType() {
        return questionMapper.selectQuestionType();
    }

    @Override
    public List<QuestionWithBLOBs> selectByType(int type) {
        return questionMapper.selectByType(type);
    }
}
