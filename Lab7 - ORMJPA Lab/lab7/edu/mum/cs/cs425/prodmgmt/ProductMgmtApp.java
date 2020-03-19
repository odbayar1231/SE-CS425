package edu.mum.cs.cs425.prodmgmt;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.mum.cs.cs425.prodmgmt.model.Product;

public class ProductMgmtApp {
	
	private static final String PERSISTENCE_UNIT_NAME = "lab7app";
    private static EntityManagerFactory factory;
    
    public ProductMgmtApp() {
    	factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

	public static void main(String[] args) {
		ProductMgmtApp app = new ProductMgmtApp();
		Product prod = new Product();
		prod.setProductNumber(new Long(1001));
		prod.setName("Iphone XS Max");
		prod.setUnitPrice(new Float(1500.00));
		prod.setDateMfd(new Date(2019, 9, 24));
		
		app.saveProduct(prod);
	}
	
	private void saveProduct(Product a) {		
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
	}
	

}