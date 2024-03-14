package com.rpg.user;

import com.rpg.user.service.UserService;
import com.rpg.user.view.UserMenu;


/**
 * 유저 기능 테스트용 Entry point
 * 유저에 관련된 기능을 테스트하려면 main Method 내의 주석을 풀고 실행하면 된다.
 */
public class UserApplication {

    public static void main(String[] args) {

        UserMenu userMenu = new UserMenu();
        userMenu.userMenu();

//        UserService userService = new UserService();
//
//        System.out.println(userService.getUserInfo(1));
//
//        userService.getUserItemList(1).forEach(System.out::println);
//
//        System.out.println(userService.updateUserName("test"));
//        System.out.println(userService.updateUserCharm(-1000));
//        System.out.println(userService.updateUserMoney(10000000));
    }
}
