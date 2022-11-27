package dataAccess;

import entities.Category;

public class JDBCCategoryDal implements CategoryDal{



    @Override
    public void add(Category category) {

        System.out.println("JDBC ile veritabanına eklendi: "+category.getCategoryName());

    }
}
