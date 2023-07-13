package com.aibaozi.springmall.dao;

import com.aibaozi.springmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
