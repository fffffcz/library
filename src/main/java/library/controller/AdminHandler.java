package library.controller;

import library.entity.Admin;
import library.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminHandler  {
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping("/findByAdminName/{name}")
    public Admin findByAdminName(@PathVariable("name") String name){
        return adminRepository.findAdminByAdminName(name);
    }
}
