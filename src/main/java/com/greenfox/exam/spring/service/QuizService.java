package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.dataaccess.RepoHandler;
import com.greenfox.exam.spring.model.AnswerForm;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Quiz;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Created by peter on 2017.06.06..
 */
@Component
public class QuizService {

  @Autowired
  RepoHandler repoHandler;

  public Quiz chooseFiveQuestions() {
    Quiz five = new Quiz();
    five.setId(1l);
    ArrayList<Question> questionBase = repoHandler.allQuestions();
    Question[] questions = new Question[5];
    for (int i = 0; i < 5; i++) {
      int pickingNumber = (int) (Math.random() * questionBase.size());
      questions[i] = questionBase.get(pickingNumber);
      questionBase.remove(pickingNumber);
    }
    five.setQuestions(questions);
    return five;
  }

  public ResponseEntity<?> receiveAnswers(AnswerForm answerForm) {
    return null;
  }
}
