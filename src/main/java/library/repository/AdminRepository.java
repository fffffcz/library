package library.repository;

import library.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin,Long> {
        Admin findAdminByAdminName(String adminName);
}

