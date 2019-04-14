package com.course.in.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseModel {

    @Id
    private String courseName;
    private String discreption;

    public CourseModel(String courseName, String discreption) {
        this.courseName = courseName;
        this.discreption = discreption;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDiscreption() {
        return discreption;
    }

    public void setDiscreption(String discreption) {
        this.discreption = discreption;
    }
}
