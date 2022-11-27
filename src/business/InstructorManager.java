package business;

import dataAccess.InstructorDal;
import entities.Instructor;
import logging.BaseLogger;

import java.util.List;

public class InstructorManager {


    public InstructorDal instructorDal;

    public BaseLogger[] baseLoggers;

    public List<Instructor> instructors;

    public InstructorManager(InstructorDal instructorDal, BaseLogger[] baseLoggers) {
        this.instructorDal = instructorDal;
        this.baseLoggers = baseLoggers;
    }

    public void add(Instructor instructor) {

        for(Instructor instructor1:instructors){

            if(instructor1.getFirstName()==instructor.getFirstName()&&instructor1.getLastName()==instructor.getLastName())

            {
                System.out.println("Bu eğitmen daha önce eklenmis");
            }else {instructorDal.add(instructor);

            for (BaseLogger baseLogger : baseLoggers) {

                baseLogger.log(instructor.getFirstName() + " " + instructor.getLastName());
            }}}


    }
}