package com.hermessonaula.crud.repositories;

import com.hermessonaula.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
