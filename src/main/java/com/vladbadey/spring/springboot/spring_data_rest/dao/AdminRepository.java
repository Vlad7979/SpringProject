package com.vladbadey.spring.springboot.spring_data_rest.dao;

import com.vladbadey.spring.springboot.spring_data_rest.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findFirstByLoginAndPassword(String login, String password);
}
