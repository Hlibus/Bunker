package com.petproject.gr.bunkergame.service.database;

import com.petproject.gr.bunkergame.dto.UserDto;
import com.petproject.gr.bunkergame.entity.database.Role;
import com.petproject.gr.bunkergame.entity.database.User;
import com.petproject.gr.bunkergame.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void registerUser(UserDto userDto, Role role){
        User user = new User();

        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRole(role);

        userRepo.save(user);
    }

    public User getUserByEmailAndPassword(String email, String pas) {
        return userRepo.getUserByEmailAndPassword(email, pas);
    }

    public boolean isEmailUsed(String email){
        return userRepo.existsByEmail(email);
    }
}
