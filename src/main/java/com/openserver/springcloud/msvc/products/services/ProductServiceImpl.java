package com.openserver.springcloud.msvc.products.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.openserver.springcloud.msvc.products.entities.Product;
import com.openserver.springcloud.msvc.products.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    final private ProductRepository repository;
    final private Environment environment;

    public ProductServiceImpl(ProductRepository _repository, Environment _environment) {
        this.repository = _repository;
        this.environment = _environment;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return ((List<Product>) repository.findAll())
                .stream().map(prod -> {
                    prod.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
                    return prod;
                }).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id)
                .map(prod -> {
                    prod.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
                    return prod;
                });
    }

}
