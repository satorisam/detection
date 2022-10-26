package com.hehe.store;
import org.springframework.data.repository.CrudRepository;

import com.hehe.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}