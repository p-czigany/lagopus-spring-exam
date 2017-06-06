package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.dataaccess.RepoHandler;
import com.greenfox.exam.spring.model.AnswerForm;
import com.greenfox.exam.spring.model.Project;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Quiz;
import com.greenfox.exam.spring.model.ResponseForm;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by peter on 2017.06.06..
 */
@Component
public class QuizService {

  @Autowired
  RepoHandler repoHandler;

  public Quiz chooseFiveQuestions() {
    Quiz five = new Quiz();
    ArrayList<Question> questionBase = repoHandler.allQuestions();
    Question[] questions = new Question[5];
    for (int i = 0; i < 5; i++) {
      int pickingNumber = (int) (Math.random() * questionBase.size());
      questions[i] = questionBase.get(pickingNumber);
      questionBase.remove(pickingNumber);
    }
    five.setQuestions(questions);
    repoHandler.saveQuiz(five);
    return five;
  }

  public ResponseForm receiveAnswers(AnswerForm answerForm) {
    ResponseForm response = new ResponseForm();
    response.setId(1l);

//    if( ALL THE ANSWERS ARE CORRECT ):

    ArrayList<Project> projectBase = repoHandler.allProjects();
    Project[] projects = new Project[projectBase.size()];
    for (int i = 0; i < projects.length; i++) {
      projects[i] = projectBase.get(i);
    }
    response.setProjectList(projects);
    return response;
  }

  private void sendForm(ResponseForm toSend) {
    String url = "https://springexamserver.herokuapp.com/projects/className";
    RestTemplate restTemplate = new RestTemplate();
    try {
      restTemplate.postForObject(url, toSend, AnswerForm.class);
    } catch (Exception e) {
      System.out.println("Couldn't send message!");
    }
  }
}
