package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by peter on 2017.06.06..
 */
@Entity
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String answer;

  public Answer() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
