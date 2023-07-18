package com.aibaozi.springmall.dao;

import com.aibaozi.springmall.dto.ProductRequest;
import com.aibaozi.springmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
