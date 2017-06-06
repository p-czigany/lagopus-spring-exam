package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.06.06..
 */
public interface QuestionRepo extends CrudRepository<Question, Long> {

}
