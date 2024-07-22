package com.thinking.machines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinking.machines.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
