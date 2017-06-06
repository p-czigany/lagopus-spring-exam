package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Quiz;
import com.greenfox.exam.spring.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.06.06..
 */
@RestController
public class Rest {

  @Autowired
  QuestionService questionService;

  @GetMapping(value = "/questions")
  public Quiz questions() {
    return questionService.chooseFive();
  }
}
