package com.greenfox.exam.spring.model;

/**
 * Created by peter on 2017.06.06..
 */
public class ResponseForm {

  private long id;
  private Question[] projectList;

  public ResponseForm() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Question[] getProjectList() {
    return projectList;
  }

  public void setProjectList(Question[] projectList) {
    this.projectList = projectList;
  }
}
