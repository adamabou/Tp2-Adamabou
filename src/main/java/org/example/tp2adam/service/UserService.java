package org.example.tp2adam.service;

import org.example.tp2adam.entities.Role;
import org.example.tp2adam.entities.User;
import org.example.tp2adam.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
