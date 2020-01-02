package com.bagur.course.api.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    // Updates a course if one exists, otherwise creates a course.
    public Course AddOrUpdateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
