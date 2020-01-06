// package com.bagur.courseApi.topic;

// import static org.junit.Assert.assertEquals;
// import static org.mockito.Mockito.when;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
// @SpringBootTest
// public class TopicServiceTest {

//     @Autowired
//     TopicRepository topicRepository;

//     @Autowired
//     TopicService topicService;

//     @Test
//     public void TestGetTopic() {
//         when(topicRepository.findOne("OS")).thenReturn(new Topic("OS", "Operating System", "OS Course Description"));
        
//         Topic testTopic = topicService.getTopic("OS");

//         assertEquals("OS", testTopic.getId());
//         assertEquals("Operating System", testTopic.getName());
//         assertEquals("OS Course Description", testTopic.getDescription());
//     }
// }