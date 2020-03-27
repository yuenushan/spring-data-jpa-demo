package com.example.spring0319.repository;

import com.example.spring0319.entiry.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
