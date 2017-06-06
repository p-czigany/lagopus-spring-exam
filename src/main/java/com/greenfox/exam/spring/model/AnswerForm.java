package com.greenfox.exam.spring.model;

/**
 * Created by peter on 2017.06.06..
 */
public class AnswerForm {

  private long id;
  private Answer[] answers;

  public AnswerForm() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Answer[] getAnswers() {
    return answers;
  }

  public void setAnswers(Answer[] answers) {
    this.answers = answers;
  }
}
