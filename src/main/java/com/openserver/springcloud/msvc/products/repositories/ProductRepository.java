package com.openserver.springcloud.msvc.products.repositories;

import org.springframework.data.repository.CrudRepository;
import com.openserver.springcloud.msvc.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {
    
}
