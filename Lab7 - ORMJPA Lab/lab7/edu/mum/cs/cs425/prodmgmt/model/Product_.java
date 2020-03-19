package edu.mum.cs.cs425.prodmgmt.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-10T22:38:54.610-0500")
@StaticMetamodel(Product.class)
public class Product_ {
	public static volatile SingularAttribute<Product, Integer> pid;
	public static volatile SingularAttribute<Product, Long> productNumber;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, Float> unitPrice;
	public static volatile SingularAttribute<Product, Date> dateMfd;
}
