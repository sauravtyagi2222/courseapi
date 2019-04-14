package com.course.in.repository;

import com.course.in.Model.CourseModel;
import org.springframework.data.repository.CrudRepository;

public interface CourceCrudRepository extends CrudRepository<CourseModel,String> {
}
