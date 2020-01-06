package com.bagur.course.api.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    // GET - gets all Topics
    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // GET - Gets one Topic
    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    // POST, PUT - Adds / Updates a Topic
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = {"/topics", "/topics/{id}"})
    @ResponseBody
    public ResponseEntity<Topic> AddOrUpdateTopic(@RequestBody Topic topic) {
        topicService.AddOrUpdateTopic(topic);
        return ResponseEntity.status(HttpStatus.OK).body(topicService.AddOrUpdateTopic(topic));
    }

    // DELETE - Deletes a Topic
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    @ResponseStatus
    public ResponseEntity deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
