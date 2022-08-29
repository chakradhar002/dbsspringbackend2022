package com.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.exception.ResourceNotFoundException;
import com.demo.repo.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	// inject the dependency of repo inteface here
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProductByAdmin(Product product) {

		Product resultofaddedvalue = productRepository.save(product);// insert sql
		return resultofaddedvalue;
	}

	@Override
	public Product updateProductByAdminById(Product productdetails, long id) {
		// this line fetch only id if it exist indbd or throw exception
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request id not found", " id", " your comments id"));

		product.setName(productdetails.getName());
		product.setBrandnamel(productdetails.getBrandnamel());
		product.setColor(productdetails.getColor());
		// save in db
		Product updatedproductdetails = productRepository.save(product);

		return updatedproductdetails;
	}

	@Override
	public Product readProductByAdminById(long id) { // user defined exception added by you
		Product productviewbyid = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request id not found", " id", " your comments id"));
		return productviewbyid;
	}

	@Override
	public List<Product> readProductListByAdmin() {

		List<Product> resultlist = productRepository.findAll();

		return resultlist;
	}


    
	/**
	 *  for delby id
	 */
	@Override
	public List<Product> deleteProductDetailsByAdminbyId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProductByAdminById(long id) {
		// this line fetch only id if it exist indbd or throw exception
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request id not found", " id", " your comments id"));

		// delete by id in db
		if (product.getId() != 0) {
			productRepository.delete(product);
			return "Deleted sucessfully";
		} else {
			return "Not Deleted sucessfully";
		}

	}

	@Override
	public String deleteProductDetailsByAdminbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
