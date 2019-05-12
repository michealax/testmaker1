package testmaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testmaker.entity.QuestionLanguage;
import testmaker.entity.QuestionType;
import testmaker.entity.QuestionWithBLOBs;
import testmaker.service.ServiceSelect;


import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/")
public class Select {
    @Resource
    private ServiceSelect service;

    @CrossOrigin
    @GetMapping("select")
    @ResponseBody
    public List<QuestionWithBLOBs> select(@RequestParam String q) {
        if (q.equals("-1")) {
            return service.select();
        } else{
            return service.selectByType(Integer.parseInt(q));
        }

    }

    @GetMapping("language")
    @ResponseBody
    public List<QuestionLanguage> selectLanguages() {
        System.out.println(service.selectLanguages().get(0).getName());
        return service.selectLanguages();
    }

    @GetMapping("type")
    @ResponseBody
    public List<QuestionWithBLOBs> selectType() {
        return service.selectQuestionType();
    }
}
