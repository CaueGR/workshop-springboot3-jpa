package com.firstprojectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.firstprojectspring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
