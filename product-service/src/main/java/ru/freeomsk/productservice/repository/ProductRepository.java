package ru.freeomsk.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.freeomsk.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
