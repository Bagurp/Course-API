package com.bagur.course.api.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<Course> result = courseRepository.findById(id);
        if(!result.isPresent()) {
            return null;
        }

        return result.get();
    }

    // Updates a course if one exists, otherwise creates a course.
    public Course AddOrUpdateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
