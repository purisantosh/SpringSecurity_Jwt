package com.example.spring_security_6.repository;

import com.example.spring_security_6.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
