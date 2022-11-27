package business;

import dataAccess.CategoryDal;
import entities.Category;

import logging.BaseLogger;

import java.util.List;

public class CategoryManager {

    public CategoryDal categoryDal;

    public BaseLogger[] baseLoggers;
    public List<Category> categories;

    public CategoryManager(CategoryDal categoryDal, BaseLogger[] baseLoggers) {

        this.categoryDal = categoryDal;
        this.baseLoggers = baseLoggers;
    }

    public void add(Category category){

        for(Category category1:categories){

            if(category1.getCategoryName()==category.getCategoryName()){

                System.out.println("Bu kategori zaten mevcut");
            }else {categoryDal.add(category);

            for (BaseLogger baseLogger:baseLoggers){

                baseLogger.log(category.getCategoryName());
            }

        }}




    }
}
