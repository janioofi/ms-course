package com.jan1ooo.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jan1ooo.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
