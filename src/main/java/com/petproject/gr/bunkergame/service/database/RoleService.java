package com.petproject.gr.bunkergame.service.database;

import com.petproject.gr.bunkergame.entity.database.Role;
import com.petproject.gr.bunkergame.repo.RoleRepo;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepo roleRepo;

    public RoleService(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public Role getUserRole(){
        return roleRepo.getByRoleName("player");
    }

}
