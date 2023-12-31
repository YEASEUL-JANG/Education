package com.example.spring02.service.shop;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.shop.dao.ProductDAO;
import com.example.spring02.model.shop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Inject
	ProductDAO productDAO;
	

	@Override
	public List<ProductDTO> listProduct() {
		return productDAO.listProduct();
	}

	@Override
	public ProductDTO detailProduct(int product_id) {
		return productDAO.detailProduct(product_id);
	}

	@Override
	public void updateProduct(ProductDTO dto) {
		productDAO.updateProduct(dto);

	}

	@Override
	public void deleteProduct(int product_id) {
		productDAO.deleteProduct(product_id);

	}

	@Override
	public void insertProduct(ProductDTO dto) {
		productDAO.insertProduct(dto);

	}

	@Override
	public String fileInfo(int product_id) {
		return productDAO.fileInfo(product_id);
	}

}
