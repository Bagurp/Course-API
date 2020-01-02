package com.bagur.course.api.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TopicRepository extends CrudRepository<Topic, String> {

    public Topic findByTopicId(String topicId);

}