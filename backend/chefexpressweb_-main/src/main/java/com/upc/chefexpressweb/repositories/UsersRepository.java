package com.upc.chefexpressweb.repositories;

import com.upc.chefexpressweb.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
