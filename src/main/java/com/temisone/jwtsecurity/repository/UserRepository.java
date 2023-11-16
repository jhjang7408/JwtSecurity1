package com.temisone.jwtsecurity.repository;

import com.temisone.jwtsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository라는 어노테이션이 없어도 IoC되요. 이유는 JpaRepository를 상속해서
public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy규칙 -> Username문법
    // select * from user where username = ?
    public User findByUsername(String username);    // Jpa Query methods

}
