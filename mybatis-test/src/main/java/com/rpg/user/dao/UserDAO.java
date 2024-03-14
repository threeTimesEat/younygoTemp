package com.rpg.user.dao;

import com.rpg.user.dto.UserDTO;
import com.rpg.user.dto.UserItemDTO;

import java.util.List;
import java.util.Map;

public interface UserDAO {

    UserDTO getUserInfo(int code);

    int updateUserName(Map<String, String> parameter);

    List<UserItemDTO> getUserItemList(int bagCode);

    int updateUserCharm(Map<String, String> userInfoMap);

    int updateUserMoney(Map<String, String> userInfoMap);

    UserItemDTO getUserEquippedItem(int code);
}
