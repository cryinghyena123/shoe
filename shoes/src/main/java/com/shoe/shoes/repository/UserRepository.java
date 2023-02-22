package com.shoe.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoe.shoes.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
