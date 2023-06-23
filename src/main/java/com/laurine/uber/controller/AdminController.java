package com.laurine.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.AdminEntity;
import com.laurine.uber.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public List<AdminEntity> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/{adminId}")
    public AdminEntity getAdminById(@PathVariable Long adminId) {
        return adminService.getAdminById(adminId);
    }

    @PostMapping
    public AdminEntity createAdmin(@RequestBody AdminEntity admin) {
        return adminService.createAdmin(admin);
    }

    @PutMapping("/{adminId}")
    public AdminEntity updateAdmin(@PathVariable Long adminId, @RequestBody AdminEntity updatedAdmin) {
        return adminService.updateAdmin(adminId, updatedAdmin);
    }

    @DeleteMapping("/{adminId}")
    public void deleteAdmin(@PathVariable Long adminId) {
        adminService.deleteAdmin(adminId);
    }

}
