package com.geekster.assignment.UserManagement.Repository;

import com.geekster.assignment.UserManagement.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getUsers(){
        return userList;
    }



}
