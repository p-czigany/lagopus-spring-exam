package com.greenfox.exam.spring.dataaccess;

import com.greenfox.exam.spring.model.Project;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.06.06..
 */
public interface ProjectRepo extends CrudRepository<Project, Long> {

  ArrayList<Project> findAll();
}
