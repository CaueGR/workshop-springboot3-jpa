package com.firstprojectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojectspring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
