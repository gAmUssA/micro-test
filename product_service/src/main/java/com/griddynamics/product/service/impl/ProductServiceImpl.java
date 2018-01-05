package com.griddynamics.product.service.impl;

import com.griddynamics.product.domain.Product;
import com.griddynamics.product.repository.ProductRepository;
import com.griddynamics.product.service.ProductService;
import org.apache.commons.collections4.IteratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        LOGGER.info("Save product: {}", product);
        return productRepository.save(product);
    }

    @Override
    public Product update(UUID id, Product updated) {
        LOGGER.info("Update product, id: {}, {}", id, updated);
        Product product = productRepository.findOne(id);
        product.setDescription(updated.getDescription());
        product.setImageUrl(updated.getImageUrl());
        product.setPrice(updated.getPrice());
        return productRepository.save(product);
    }

    @Override
    public Product findOne(UUID id) {
        LOGGER.info("Find product, id: {}", id);
        return productRepository.findOne(id);
    }

    @Override
    public List<Product> findAll() {
        LOGGER.info("Find all products");
        Iterable<Product> products = productRepository.findAll();
        return IteratorUtils.toList(products.iterator());
    }

    @Override
    public void delete(UUID id) {
        LOGGER.info("Delete product, id: {}", id);
        productRepository.delete(id);
    }

}
