package com.aibaozi.springmall.service.impl;

import com.aibaozi.springmall.dao.ProductDao;
import com.aibaozi.springmall.model.Product;
import com.aibaozi.springmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
