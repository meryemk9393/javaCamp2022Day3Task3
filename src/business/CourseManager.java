package business;


import dataAccess.CourseDal;

import entities.Course;
import logging.BaseLogger;

import java.util.List;

public class CourseManager {

    public CourseDal courseDal;

    public BaseLogger[] baseLoggers;

    public List<Course> courses;



    public CourseManager(CourseDal courseDal, BaseLogger[] baseLoggers) {
        this.courseDal = courseDal;
        this.baseLoggers = baseLoggers;


    }

    public void add(Course course) {

        for(Course course1: courses){

            if(course1.getCourseName()==course.getCourseName()){

                System.out.println("Bu kurs zaten mevcut");

            } else if (course.getPrice()<0) {
System.out.println("Kurs fiyatı 0dan küçük olamaz");
            }else{
                courseDal.add(course);

                for (BaseLogger baseLogger : baseLoggers) {

                    baseLogger.log(course.getCourseName());
                }

            }

                  }


    }
}