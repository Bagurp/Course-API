package com.bagur.course.api.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        Optional<Topic> result = topicRepository.findById(id);
        if(!result.isPresent()) {
            return null;
        }

        return result.get();
    }

    // Updates a topic if one exists, otherwise creates a topic.
    public Topic AddOrUpdateTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
