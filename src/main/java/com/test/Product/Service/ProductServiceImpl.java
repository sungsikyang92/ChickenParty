package com.test.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Product.Mapper.ProductMapper;
import com.test.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<ProductDto> getStoredList(String userid) {
		return productMapper.getStoredList(userid);
	}

	@Override
	public List<ProductDto> getStoredByUser() {
		return productMapper.getStoredByUser();
	}

}
