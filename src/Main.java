import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDal;
import dataAccess.JDBCCourseDal;
import dataAccess.JDBCInstructorDal;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.BaseLogger;
import logging.DatabaseLogger;
import logging.EmailLogger;
import logging.FileLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category category = new Category(1, "kitap");
        Course course = new Course(1, "Deneme", "Deneme", 200);
        Instructor instructor = new Instructor(1, "meryem", "kose");


        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger()};
        CourseManager courseManager = new CourseManager(new JDBCCourseDal(), loggers,);
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(), loggers);
        InstructorManager instructorManager = new InstructorManager(new JDBCInstructorDal(), loggers);

        instructorManager.add(instructor);
        categoryManager.add(category);
        courseManager.add(course);

        instructorManager.add(instructor);
        categoryManager.add(category);
        courseManager.add(course);





    }
}