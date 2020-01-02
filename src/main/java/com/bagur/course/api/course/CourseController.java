package com.bagur.course.api.course;

import java.util.List;

import com.bagur.course.api.topic.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
public class CourseController {

    @Autowired
    private CourseService courseService;

    // GET - gets all Courses
    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    // GET - Gets one Course
    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getTopic(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
    }

    // POST, PUT - Adds / Updates a Course
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = {"/topics/{topicId}/courses", "/topics/{topicId}/courses/{courseId}"})
    @ResponseBody
    public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        return ResponseEntity.status(HttpStatus.OK).body(courseService.AddOrUpdateCourse(course));
    }
    
    // DELETE - Deletes a Course
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
    @ResponseStatus
    public ResponseEntity deleteCourse(@PathVariable String courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
