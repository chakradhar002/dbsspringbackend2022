package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//entry point of backend

import com.demo.entity.Product;
import com.demo.service.ProductService;

 //final url to call add product method
//   /productmodule/addproduct

@RestController
@RequestMapping(value="/vi/api/productmodule")
public class ProductController {
	// inject the depedency of productinterface
	@Autowired
	ProductService productService;
	
	
	
	/** api writtern here
	 * @param product
	 * @return
	 */
	@PostMapping(value="/addproduct")// this is called end point or uri
	Product addproduct( @RequestBody Product product) {
		//calling service class from here
	Product resultofprodcut =productService.addProductByAdmin(product);
		return resultofprodcut;

	}
	
	/**GET
	 * @param prodcutid
	 * @return
	 */
	@GetMapping(value="/viewproductbyid/{productid}") 
	Product getProductById(@PathVariable(value="productid") Long prodcutid ) {
		Product viewbyid =productService.readProductByAdminById(prodcutid);
		return viewbyid;
	}
	
	
	/**GET
	 * @param prodcutid
	 * @return
	 */
	/**
	 * @return
	 */
	@GetMapping(value="/viewallproducts") 
	List<Product> getProductList() {
		List<Product> listofproducts =productService.readProductListByAdmin();
		return listofproducts;
	}
	
	
	/**
	 * @param productid
	 * @param product
	 * @return
	 */
	@PutMapping(value="/udpateproductid/{productid}")
	Product updateProductByAdmin(@PathVariable(value="productid") long productid, @RequestBody Product product ){
	
		Product prod =productService.updateProductByAdminById(product, productid);
	
		return prod;
			
		}
		
	
	/** for del by id
	 * @param productid
	 * @return
	 */
	@DeleteMapping(value="/deleteproductid/{productid}")
	String deleteProductByAdmin(@PathVariable(value="productid") long productid){
	
		String prod =productService.deleteProductByAdminById(productid);
	
		return prod;
			
		}
		
	

}
