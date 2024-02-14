package com.petprokect.gr.bunkergame.service.database;

import com.petprokect.gr.bunkergame.entity.database.User;
import com.petprokect.gr.bunkergame.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void saveOrUpdateUser(User user) {
        userRepo.save(user);
    }

    public User getUserByLoginAndPassword(String login, String pas) {
        return userRepo.getUserByLoginAndPassword(login, pas);
    }
}
