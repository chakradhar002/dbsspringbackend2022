package com.demo.productmain;

import com.demo.businesslogic.ProductRepository;
import com.demo.entity.Product;

public class ProductClient {
	public static void main(String arg[]) {
		
		
		Product record1 =  new Product("Samsung","good","red");
		Product record2 =  new Product(" i phone","very good","blue");
		Product record3 =  new Product("one plus","good","green");
		//create record
	//	ProductRepository.createProduct(record1);
		//ProductRepository.createProduct(record2);
	//	System.out.println("inserted done");
		// veiw recored
	//	ProductRepository.viewProductById(1);
		
	//	Product p =ProductRepository.updateProduct(1);
	//	System.out.println(p.getDescription());
	//	System.out.println(p.getName());
	//	System.out.println(p.getColor());
		
		ProductRepository.deleteProduct(1);
		System.out.println("Done..");
	}

}
