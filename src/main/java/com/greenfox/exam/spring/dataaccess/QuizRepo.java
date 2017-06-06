package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Quiz;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.06.06..
 */
public interface QuizRepo extends CrudRepository<Quiz, Long> {

  Quiz findOneById(long id);
}
