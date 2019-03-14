package com.demo.service;

import com.demo.model.Word;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoliujun on 2018/5/5.
 */
@Service
public class WordServiceImpl implements WordService {
    @Override
    public Word getWordById(Long id) {
        Word word = new Word();
        word.setId(id);
        word.setbYear("2017");
        word.setlYear("2019");
        word.setLeader("王思聪");
        word.setPhone("18801016758");
        word.setCurYear("2018");
        word.setImage("http://image.baidu.com/search/detail");
        return word;
    }
}
