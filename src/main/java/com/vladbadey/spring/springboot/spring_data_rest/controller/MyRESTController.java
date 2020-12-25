package com.vladbadey.spring.springboot.spring_data_rest.controller;


import com.vladbadey.spring.springboot.spring_data_rest.dao.AdminRepository;
import com.vladbadey.spring.springboot.spring_data_rest.entity.Admin;
import com.vladbadey.spring.springboot.spring_data_rest.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private AdminService adminService;

    @Autowired
    public MyRESTController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admins")
    public List<Admin> showAllAdmins() {
        return adminService.getAllAdmins();
    }

    @PostMapping("/admins")
    public Admin showAdminByLoginAndPassword(@RequestBody Admin admin) {
        adminService.findFirstByLoginAndPassword(admin.getLogin(), admin.getPassword());
        return admin;
    }
}
