package com.ourproject.pojo;

import com.ourproject.pojo.ProdTag;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-08-22T23:17:33")
@StaticMetamodel(Tag.class)
public class Tag_ { 

    public static volatile SetAttribute<Tag, ProdTag> prodTagSet;
    public static volatile SingularAttribute<Tag, String> name;
    public static volatile SingularAttribute<Tag, Integer> id;
    public static volatile SingularAttribute<Tag, String> tagcol;

}