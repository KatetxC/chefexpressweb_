package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
