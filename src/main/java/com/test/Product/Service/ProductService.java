package com.test.Product.Service;

import java.util.List;

import com.test.dto.ProductDto;

public interface ProductService {
	public List<ProductDto> getStoredList(String userid);

	public List<ProductDto> getStoredByUser();
}
