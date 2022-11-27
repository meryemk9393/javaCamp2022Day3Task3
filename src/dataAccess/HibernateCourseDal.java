package dataAccess;


import entities.Course;

public class HibernateCourseDal implements CourseDal{



    @Override
    public void add(Course course) {


        System.out.println("Hibernate ile veritabanına eklendi: "+course.getCourseName());

    }



}

