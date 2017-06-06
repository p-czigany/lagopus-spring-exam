package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by peter on 2017.06.06..
 */
@Entity
public class Quiz {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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
