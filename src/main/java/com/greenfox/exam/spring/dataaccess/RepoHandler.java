package com.greenfox.exam.spring.dataaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by peter on 2017.06.06..
 */
@Component
public class RepoHandler {

  @Autowired
  AnswerRepo answerRepo;

  @Autowired
  QuestionRepo questionRepo;
}
