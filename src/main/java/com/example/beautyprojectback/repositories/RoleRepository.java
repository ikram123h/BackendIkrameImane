package com.example.beautyprojectback.repositories;

import com.example.beautyprojectback.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
