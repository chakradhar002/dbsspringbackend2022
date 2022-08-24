package com.demo.inheritence;

/*
 * You cannot instantiate an interface.
An interface does not contain any constructors.
All of the methods in an interface are abstract.
An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
An interface is not extended by a class; it is implemented by a class.
An interface can extend multiple interfaces.
 */

public interface ProductInter {

	// api
	Product getProductById(long id);

	Product getListOfAllProdcuts();

	Product updateProductDetails(long id);

	Product deleteProductDetailsByid(long id);

	Product deleteAllProductList();

	Product createlProduct();
	
	Product searchProduct();
	

}

 interface ProductInter2 extends ProductInter {

	// api
	Product opt(long id);


	

}
