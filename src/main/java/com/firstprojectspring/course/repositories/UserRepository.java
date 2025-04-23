package com.firstprojectspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojectspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
