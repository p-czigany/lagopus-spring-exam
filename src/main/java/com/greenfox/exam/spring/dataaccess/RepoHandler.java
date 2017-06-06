package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Project;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Quiz;
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

  @Autowired
  ProjectRepo projectRepo;

  @Autowired
  QuizRepo quizRepo;

  public ArrayList<Question> allQuestions() {
    return questionRepo.findAll();
  }

  public Answer answerById(long id) {
    return answerRepo.findOneById(id);
  }

  public ArrayList<Project> allProjects() {
    return projectRepo.findAll();
  }

  public void saveQuiz(Quiz quiz) {
    quizRepo.save(quiz);
  }
}
