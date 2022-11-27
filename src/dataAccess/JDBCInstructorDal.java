package dataAccess;

import entities.Instructor;

public class JDBCInstructorDal implements  InstructorDal{
    @Override
    public void add(Instructor instructor) {

        System.out.println("JDBC ile veritabanına eklendi: "+instructor.getFirstName()
                +" "+instructor.getLastName());

    }
}
