package com.rpg.user.service;

import com.rpg.user.dao.UserDAO;
import com.rpg.user.dto.UserDTO;
import com.rpg.user.dto.UserItemDTO;
import com.rpg.util.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

public class UserService {

    private UserDAO userDAO;

    public UserDTO getUserInfo(int code){
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        UserDTO user = userDAO.getUserInfo(code);

        sqlSession.close();

        return user;

    }

    public UserItemDTO getUserEquippedItem(int code) {
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        UserItemDTO userEquippedItem = userDAO.getUserEquippedItem(code);

        sqlSession.close();
        return userEquippedItem;
    }

    public List<UserItemDTO> getUserItemList(int bagCode) {
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        List<UserItemDTO> itemList = userDAO.getUserItemList(bagCode);

        sqlSession.close();

        return itemList;
    }


    public boolean updateUserName(String name) {
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        Map<String, String> userInfoMap = new HashMap<>();
        userInfoMap.put("code", "1");
        userInfoMap.put("name", name);

        boolean isUpdated = userDAO.updateUserName(userInfoMap) > 0;
        if (isUpdated)
            sqlSession.commit();
        else
            sqlSession.rollback();

        return isUpdated;
    }

    public boolean updateUserCharm(int charm) {
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        Map<String, String> userInfoMap = new HashMap<>();
        userInfoMap.put("code", "1");
        userInfoMap.put("charm", Integer.toString(charm));

        boolean isUpdated = userDAO.updateUserCharm(userInfoMap) > 0;
        if (isUpdated)
            sqlSession.commit();
        else
            sqlSession.rollback();

        return isUpdated;
    }

    public boolean updateUserMoney(int money) {
        SqlSession sqlSession = Template.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);

        Map<String, String> userInfoMap = new HashMap<>();
        userInfoMap.put("code", "1");
        userInfoMap.put("money", Integer.toString(money));

        boolean isUpdated = userDAO.updateUserMoney(userInfoMap) > 0;
        if (isUpdated)
            sqlSession.commit();
        else
            sqlSession.rollback();

        return isUpdated;
    }


}
