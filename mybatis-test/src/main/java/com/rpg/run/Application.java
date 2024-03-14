package com.rpg.run;

import com.rpg.user.dao.UserDAO;
import com.rpg.user.dto.UserDTO;
import com.rpg.util.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        SqlSession sqlSession = Template.getSqlSession();

        UserDAO userDAO = sqlSession.getMapper(UserDAO.class);

        UserDTO user = userDAO.getUserInfo(1);

        Map<String, String> userInfoMap = new HashMap<>();
        userInfoMap.put("code", "1");
        userInfoMap.put("name", "안정원");
        int result = userDAO.updateUserName(userInfoMap);
        if (result>0)
            sqlSession.commit();

        System.out.println(user);

    }

}
