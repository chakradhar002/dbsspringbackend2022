package amazonapp.service;

import java.util.List;

import amazonapp.bean.Product;

public interface ProductService {
	
	// service give by admin insest
	Product addProduct(Product product);
	
	// get all list of products
	List<Product> getAllListOfProducts();
	//update by id 
	Product updateProduct(Product product,long id);
	
	/// delete service
	void deleteProductById(long id);

}
