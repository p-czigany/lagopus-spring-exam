package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Answer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.06.06..
 */
public interface AnswerRepo extends CrudRepository<Answer, Long> {

  Answer findOneById(long id);
}
