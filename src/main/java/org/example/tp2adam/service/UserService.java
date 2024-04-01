package org.example.tp2adam.service;

import ma.chaimae.tp2app.entities.Role;
import ma.chaimae.tp2app.entities.User;
import org.example.tp2adam.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
