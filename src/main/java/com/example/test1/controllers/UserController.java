package com.example.test1.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.test1.models.UserModel;
import com.example.test1.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    

    @GetMapping
    public ArrayList<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUsers(user);
    }

    @GetMapping(path = "/{idUser}")
    public Optional<UserModel> getUsersById(@PathVariable("idUser") Integer idUser){
        return this.userService.getUsersById(idUser);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> getUsersByName(@RequestParam("name") String name){
        return this.userService.getUsersByName(name);
    }

    @DeleteMapping(path = "/{idUser}")
    public String deleteUserById(@PathVariable("idUser") Integer idUser){
        boolean delete = userService.deleteUserById(idUser);
        if (delete) {
            return "Usuario eliminado correctamente con id: " + idUser;
        }
        return "No se pudo eliminar el usuario con id: " + idUser;
    }


}
