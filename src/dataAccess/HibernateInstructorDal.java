package dataAccess;

import entities.Instructor;

public class HibernateInstructorDal implements InstructorDal{


    @Override
    public void add(Instructor instructor) {



        System.out.println("Hibernate ile veritabanına eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
    }
}
