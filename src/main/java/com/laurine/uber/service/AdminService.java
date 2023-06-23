package com.laurine.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurine.uber.entity.AdminEntity;
import com.laurine.uber.repository.AdminRepository;
@Service
public class AdminService {
	private  AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<AdminEntity> getAllAdmins() {
        return adminRepository.findAll();
    }

    public AdminEntity getAdminById(Long adminId) {
        return adminRepository.findById(adminId)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    public AdminEntity createAdmin(AdminEntity admin) {
        return adminRepository.save(admin);
    }

    public AdminEntity updateAdmin(Long adminId, AdminEntity updatedAdmin) {
        AdminEntity admin = getAdminById(adminId);
        admin.setFirstName(updatedAdmin.getFirstName());
        admin.setLastName(updatedAdmin.getLastName());
        admin.setPhone(updatedAdmin.getPhone());
        admin.setAddress(updatedAdmin.getAddress());
        admin.setEmail(updatedAdmin.getEmail());
        admin.setPassword(updatedAdmin.getPassword());
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }

}
