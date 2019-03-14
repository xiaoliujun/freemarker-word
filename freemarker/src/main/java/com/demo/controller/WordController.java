package com.demo.controller;


import com.demo.model.Word;
import com.demo.service.WordService;
import com.demo.util.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoliujun on 2018/11/10.
 */
@Controller
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService wordService;

    @ResponseBody
    @RequestMapping("/exportWord")
    public void exportWord(HttpServletRequest request, HttpServletResponse response) {
      
        Map<String, Object> paramMap = new HashMap<String,Object>(10);
        paramMap.put("id", "21366445665");
        paramMap.put("bYear", "2018");
        paramMap.put("lYear", "2019");
        paramMap.put("leader", "zhangsan");
        paramMap.put("phone", "18379157510");
        paramMap.put("curYear", "2020");
        paramMap.put("image","5" );
        try {
            WordUtils.exportMillCertificateWord(request, response, paramMap, "方案",
                    "wordTemplate.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void getWord(HttpServletRequest request, HttpServletResponse response) {
    	 long a=342388291;
    	 Word word=wordService.getWordById(a);
         System.out.println(word);
    }
}
