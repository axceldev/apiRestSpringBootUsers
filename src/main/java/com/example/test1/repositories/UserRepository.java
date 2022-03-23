package com.example.test1.repositories;

import java.util.ArrayList;

import com.example.test1.models.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
    public abstract ArrayList<UserModel> findUsersByName(String name);
}