package com.course.in.services;

import com.course.in.Model.CourseModel;
import com.course.in.repository.CourceCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourceServiceImpl implements CourseService {

    @Autowired
    CourceCrudRepository courceCrudRepository;

    public List<CourseModel> findAllCourse(){
        List<CourseModel> ds = new ArrayList<>();
        courceCrudRepository.findAll().forEach(ds::add);
        return ds;
    }
}
