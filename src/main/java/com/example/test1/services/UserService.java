package com.example.test1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.test1.models.UserModel;
import com.example.test1.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<UserModel> getAllUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUsers(UserModel user){
        return userRepository.save(user);
    }

    public Optional<UserModel> getUsersById(Integer idUser){
        return userRepository.findById(idUser);
    }

    public List<UserModel> getUsersByName(String name){
        return userRepository.findUsersByName(name);
    }

    public boolean deleteUserById(Integer idUser){
        try {
            userRepository.deleteById(idUser);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
