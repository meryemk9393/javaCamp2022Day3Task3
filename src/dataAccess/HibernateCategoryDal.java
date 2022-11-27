package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateCategoryDal implements  CategoryDal{

    @Override
    public void add(Category category) {

            System.out.println("Hibernate ile veritabanına eklendi."+ category.getCategoryName());

    }
}
