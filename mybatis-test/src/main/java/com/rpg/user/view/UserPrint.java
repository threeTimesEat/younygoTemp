package com.rpg.user.view;

import com.rpg.user.dto.UserDTO;
import com.rpg.user.dto.UserItemDTO;

import java.util.List;

public class UserPrint {

    public void printUserInfo(UserDTO userInfo, UserItemDTO userEquippedItem, List<UserItemDTO> itemList) {

        System.out.println("■ ■ 내 상태 ■ ■ ");
        System.out.println("[이름] : " + userInfo.getName());
        System.out.println("[나의 매력도] : " + userInfo.getCharm());
        System.out.print("[소지품] : ");

        for (UserItemDTO item : itemList) {
            System.out.print(item.getName() + ", ");
        }
        System.out.println("[착용한 옷] : " +  (userEquippedItem == null ? "없음" : userEquippedItem));
        System.out.println("[소지한 돈] : " + userInfo.getMoney() + "원");
    }

}
