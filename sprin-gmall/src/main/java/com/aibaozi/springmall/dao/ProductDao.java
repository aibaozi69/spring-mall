package com.aibaozi.springmall.dao;

import com.aibaozi.springmall.dto.ProductRequest;
import com.aibaozi.springmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product>getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
