package com.vladbadey.spring.springboot.spring_data_rest.service;


import com.vladbadey.spring.springboot.spring_data_rest.dao.AdminRepository;
import com.vladbadey.spring.springboot.spring_data_rest.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }


    @Override
    public Admin findFirstByLoginAndPassword(String login, String password) {
//        List<Admin> allAdmins = adminRepository.findAll();
//        Admin rightAdmin = null;
//        for (Admin admin1 : allAdmins) {
//            if (admin.getLogin().equals(admin1.getLogin())) {
//                if (admin.getPassword().equals(admin1.getPassword())) rightAdmin = admin1;
//            }
//        }

//        Optional<Admin> optional = Optional.ofNullable(adminRepository.findAdminByLoginAndPassword(admin.getLogin(), admin.getPassword()));
//
//        if (optional.isPresent()) optional.get();



        return adminRepository.findFirstByLoginAndPassword(login, password);

    }
}
