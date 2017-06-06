package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Question;
import java.util.ArrayList;
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

  public ArrayList<Question> allQuestions() {
    return questionRepo.findAll();
  }
}
