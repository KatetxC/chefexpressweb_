package com.upc.chefexpressweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.upc.chefexpressweb.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
