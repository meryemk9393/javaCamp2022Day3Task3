package dataAccess;

import entities.Course;

public class JDBCCourseDal implements CourseDal{

    @Override
    public void add(Course course) {


        System.out.println("JDBC  ile veritabanına eklendi : "+course.getCourseName() );
    }
}
