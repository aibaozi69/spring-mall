package com.aibaozi.springmall.service;

import com.aibaozi.springmall.dto.ProductRequest;
import com.aibaozi.springmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);
}
