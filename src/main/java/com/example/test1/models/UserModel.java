package com.example.test1.models;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idUser;

    private String name;
    private String email;
    private Integer priority;

    public void setpriority(Integer priority){
        this.priority = priority;
    }

    public Integer getpriority(){
        return priority;
    }

    public Integer getidUser() {
        return idUser;
    }

    public void setidUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
