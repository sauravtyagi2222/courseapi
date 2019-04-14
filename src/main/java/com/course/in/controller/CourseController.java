package com.course.in.controller;

import com.course.in.Model.CourseModel;
import com.course.in.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/districts")
    public List<CourseModel> findAllCourse(){
    return courseService.findAllCourse();
}

}
