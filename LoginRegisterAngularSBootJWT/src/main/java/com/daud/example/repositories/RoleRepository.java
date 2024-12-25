package com.daud.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daud.example.model.ERole;
import com.daud.example.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> 
{
	Optional<Role> findByName(ERole name);

}
