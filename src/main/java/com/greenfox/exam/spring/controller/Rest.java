package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.AnswerForm;
import com.greenfox.exam.spring.model.Quiz;
import com.greenfox.exam.spring.model.ResponseForm;
import com.greenfox.exam.spring.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peter on 2017.06.06..
 */
@RestController
public class Rest {

  @Autowired
  QuizService quizService;

  @GetMapping(value = "/questions")
  public Quiz questions() {
    return quizService.chooseFiveQuestions();
  }

  @PostMapping(value = "/answers")
  public ResponseForm receiveAnswers(@RequestBody AnswerForm answerForm) {
    return quizService.receiveAnswers(answerForm);
  }
}
