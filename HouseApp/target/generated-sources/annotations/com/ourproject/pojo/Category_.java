package com.ourproject.pojo;

import com.ourproject.pojo.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-24T16:17:23")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SetAttribute<Category, Product> productSet;

}