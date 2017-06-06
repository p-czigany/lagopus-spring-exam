package com.greenfox.exam.spring.controller;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfox.exam.spring.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by peter on 2017.06.06..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@EnableWebMvc
public class RestTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void respondToAnswersWithJSON() throws Exception {
    mockMvc.perform(post("/answers")
            .contentType(MediaType.APPLICATION_JSON_UTF8).content("{\n"
                    + "  \"id\": 1,\n"
                    + "  \"answers\":[\n"
                    + "  {\"id\": 1, \"answer\": \"#3CB879\"},\n"
                    + "  {\"id\": 2, \"answer\": \"2015.09.\"},\n"
                    + "  {\"id\": 3, \"answer\": \"2015.09.\"},\n"
                    + "  {\"id\": 4, \"answer\": \"2015.09.\"},\n"
                    + "  {\"id\": 5, \"answer\": \"2015.09.\"}\n"
                    + "  ]\n"
                    + "}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
  }
}
