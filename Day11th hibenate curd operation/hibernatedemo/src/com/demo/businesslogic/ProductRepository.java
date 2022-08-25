package com.demo.businesslogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Product;
import com.demo.util.HibernateUtil;

public class ProductRepository {

	static Session session=null;
	static Transaction transcation =null;
	static SessionFactory sessionfactory=null;
	
	//logic part for creating product or add product
	public static Product createProduct(Product product) {
	session=HibernateUtil.getSessionFactory().openSession();//obtain the session for inserting operations
	transcation=session.beginTransaction();//db logic from dbms
	session.save(product);//this will sql query automatically" insert into table values(?,?)
	transcation.commit();//persist into db permanently using commit()
	session.close();
	return product;
		
	}
//view Product
	public static void viewProductById(long id) {
		session=HibernateUtil.getSessionFactory().openSession();//obtain the session for inserting operations
		transcation=session.beginTransaction();//db logic from dbms
		Product viewresult = (Product) session.load(Product.class, id);
		System.out.println(viewresult.getName());
		System.out.println(	viewresult.getColor());
		System.out.println(viewresult.getDescription());
		
		
	}
	
	//update Product 
		public static Product updateProduct(long id) {
			session=HibernateUtil.getSessionFactory().openSession();//obtain the session for inserting operations
			transcation=session.beginTransaction();//db logic from dbms
			Product updateedresultofproduct = (Product) session.load(Product.class, id);
			updateedresultofproduct.setColor("black");
			updateedresultofproduct.setName("MI");
			updateedresultofproduct.setDescription("fair look");
			session.save(updateedresultofproduct);
			transcation.commit();//persist into db permanently using commit()
			session.close();
			return updateedresultofproduct;
			
		}
	//delete Product
		public static void deleteProduct(long id) {
			session=HibernateUtil.getSessionFactory().openSession();//obtain the session for inserting operations
			transcation=session.beginTransaction();//db logic from dbms
			Product deleteresultofproduct = (Product) session.load(Product.class, id);
			session.delete(deleteresultofproduct);
			transcation.commit();//persist into db permanently using commit()
			session.close();
			System.out.println("deleted recored "+id);
			
		}
}
