package com.upc.chefexpressweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.upc.chefexpressweb.entities.Role;
import com.upc.chefexpressweb.repositories.IRoleRepository;
import com.upc.chefexpressweb.serviceinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Role listarId(Long idRol) {
        return rR.findById(idRol).orElse(new Role());
    }
}
