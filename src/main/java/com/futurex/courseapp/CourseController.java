package com.futurex.courseapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.math.BigInteger;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Course getSpecificCourse(@PathVariable("id") BigInteger id) {

        return courseRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void saveCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteCourse(@PathVariable("id") BigInteger id) {
        courseRepository.deleteById(id);
    }
}
