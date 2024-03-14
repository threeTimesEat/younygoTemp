package com.rpg.user.view;

import com.rpg.user.controller.UserController;
import com.rpg.user.dto.UserDTO;

import java.util.Scanner;

public class UserMenu {

    private UserController userController = new UserController();
    UserPrint userPrint = new UserPrint();
    private final int USER_CODE = 1; // 로그인한 유저의 Code값을 1로 가정


    public void userMenu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("유저 메뉴");
            System.out.println("1. 이름 변경하기");
            System.out.println("2. 내 정보 확인하기");
            System.out.println("3. 아르바이트 하기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴를 선택하세요 > ");
            int menuNumber = Integer.parseInt(scanner.nextLine());

            switch (menuNumber) {
                case 1 -> System.out.println();
                case 2 -> getUserInfo();
                default -> System.out.println("잘못된 번호를 입력하셨습니다.");
            }

        }while (true);

    }
    public void getUserInfo() {
        UserDTO userInfo = userController.getUserInfo(USER_CODE);
        if (userInfo == null) {
            System.out.println("유저 정보가 없습니다.");
        }
        userPrint.printUserInfo(userInfo, userController.getUserEquippedItem(userInfo.getEquippedItemCode()), userController.getUserItemList(userInfo.getBagCode()));

    }
}
