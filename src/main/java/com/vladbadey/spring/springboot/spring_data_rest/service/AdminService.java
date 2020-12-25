package com.vladbadey.spring.springboot.spring_data_rest.service;



import com.vladbadey.spring.springboot.spring_data_rest.entity.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> getAllAdmins();
    public Admin findFirstByLoginAndPassword(String login, String password);

}
