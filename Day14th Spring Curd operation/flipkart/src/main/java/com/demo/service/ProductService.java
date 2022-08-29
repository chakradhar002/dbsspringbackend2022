package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {
	   
	//create product---POst  1
	Product addProductByAdmin(Product product);
	
	 ///4
	// update product---put
	Product updateProductByAdminById(Product product,long id);
	        
	         // 2
	// view or read the product details by admin on the bases of id
		Product readProductByAdminById(long id);
    
	         //3	
	// view or read the product list by admin 
		List<Product> readProductListByAdmin();
	  //6
	// delete product details by admin  on the bases of id
		String deleteProductDetailsByAdminbyId(long id);
		//5
   // delete product list by admin 
			List<Product> deleteProductDetailsByAdminbyId();

			String deleteProductByAdminById( long id);

}
