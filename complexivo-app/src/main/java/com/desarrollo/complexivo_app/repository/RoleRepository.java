package com.desarrollo.complexivo_app.repository;

import com.desarrollo.complexivo_app.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {
    Optional<Role> findByName(String name);
}
