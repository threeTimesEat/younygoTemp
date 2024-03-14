package com.rpg.user.controller;

import com.rpg.user.dto.UserDTO;
import com.rpg.user.dto.UserItemDTO;
import com.rpg.user.service.UserService;

import java.util.List;

public class UserController {

    private final UserService userService = new UserService();

    public UserDTO getUserInfo(int code) {
        return userService.getUserInfo(code);
    }

    public UserItemDTO getUserEquippedItem(int code) {
        return userService.getUserEquippedItem(code);
    }

    public List<UserItemDTO> getUserItemList(int bagCode){
        return userService.getUserItemList(bagCode);
    }

    public boolean updateUserName(String name) {
        return userService.updateUserName(name);
    }

    public boolean updateUserCharm(int charm) {
        return userService.updateUserCharm(charm);
    }

    public boolean updateUserMoney(int money) {
        return userService.updateUserMoney(money);
    }





}
