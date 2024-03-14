package com.rpg.user.dao;

import com.rpg.user.dto.UserDTO;

import java.util.Map;

public interface UserDAO {

    UserDTO getUserInfo(int code);
    int updateUserName(Map<String, String> parameter);
}
