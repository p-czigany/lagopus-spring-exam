package com.greenfox.exam.spring.model;

/**
 * Created by peter on 2017.06.06..
 */
public class Quiz {

  private long id;
  private Question[] questions;

  public Quiz() {
  }

  public long getId() {
    return id;
  }

  public Question[] getQuestions() {
    return questions;
  }

  public void setQuestions(Question[] questions) {
    this.questions = questions;
  }

  public void setId(long id) {
    this.id = id;
  }
}
