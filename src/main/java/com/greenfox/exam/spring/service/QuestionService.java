package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.dataaccess.RepoHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by peter on 2017.06.06..
 */
@Component
public class QuestionService {

  @Autowired
  RepoHandler repoHandler;
}
