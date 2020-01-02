package com.pramukh.bagur.course.api.topic;

import java.util.ArrayList;
import java.util.List;

import com.bagur.course.api.topic.Topic;
import com.bagur.course.api.topic.TopicController;
import com.bagur.course.api.topic.TopicRepository;
import com.bagur.course.api.topic.TopicService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.RequestBuilder;

import mockit.Expectations;
import mockit.Mocked;

@RunWith(SpringRunner.class)
//@WebMvcTest(value = TopicController.class, secure = false)
@SpringBootTest(classes = {TopicRepository.class, TopicService.class, TopicController.class, Topic.class})
public class TopicControllerTest {

    @Mocked
    private TopicService topicservice;

    @Autowired
    private MockMvc mockMvc;

    List<Topic> testList = new ArrayList<>();

    @Before
    public void init() {

        Topic topic1 = new Topic("java", "java course", "java description");
        Topic topic2 = new Topic("dbms", "dbms course", "dbms description");
        Topic topic3 = new Topic("os", "os course", "os description");

        testList.set(0, topic1);
        testList.set(1, topic2);
        testList.set(2, topic3);
    }

    @Test
    public void getAllTopicsReturnsAllTopics() {

        new Expectations() {
            {
                topicservice.getAllTopics();
                returns(testList);
            }
        };

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/topics").accept(MediaType.APPLICATION_JSON);

        MvcResult result = null;
        try {
            result = mockMvc.perform(requestBuilder).andReturn();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(result.getResponse());

    }

}