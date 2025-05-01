package com.firstprojectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.firstprojectspring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
