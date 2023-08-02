package com.jan1ooo.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jan1ooo.hruser.entities.User;
import com.jan1ooo.hruser.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(repository.findById(id).get());
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		return ResponseEntity.ok().body(repository.findByEmail(email));
	}

}
