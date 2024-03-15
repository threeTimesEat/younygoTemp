package com.rpg.user.view;

import com.rpg.user.controller.UserController;
import com.rpg.user.dto.UserDTO;

import java.util.Scanner;

public class UserMenu {

    private final UserController userController = new UserController();
    private final Scanner scanner = new Scanner(System.in);
    private final UserPrint userPrint = new UserPrint();
    private final int USER_CODE = 1; // 로그인한 유저의 Code값을 1로 가정


    public void userMenu() {
        do {

            System.out.println("유저 메뉴");
            System.out.println("1. 이름 변경하기");
            System.out.println("2. 내 정보 확인하기");
            System.out.println("3. 아르바이트 하기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴를 선택하세요 : ");
            int menuNumber = Integer.parseInt(scanner.nextLine());

            switch (menuNumber) {
                case 1 -> updateUserName();
                case 2 -> getUserInfo();
                case 3 -> userAlba();
                default -> System.out.println("잘못된 번호를 입력하셨습니다.");
            }

        }while (true);

    }

    private void updateUserName() {

        System.out.print("변경할 이름을 입력하세요 :");
        String name = scanner.nextLine();

        boolean isUpdated = userController.updateUserName(name);

        if (isUpdated) {
            System.out.println("이름이 " + name + "으로 변경되었습니다.");
        } else {
            System.out.println("이름 변경 실패.");
        }

    }

    private void userAlba() {

        System.out.println("어느 아르바이트를 하러 갈까?");
        System.out.println("1. 편의점 / 2. 영화관 / 3. 식당");
        System.out.println("============================");
        System.out.print("번호를 선택하세요 : ");
        int workType = Integer.parseInt(scanner.nextLine());

        switch (workType) {
            case 1 -> workConvenienceStore();
            case 2 -> workCinema();
            case 3 -> workRestaurant();
        }


    }

    private void workConvenienceStore() {
        System.out.println("편의점 알바를 했다.");
        System.out.println("진상이 너무 많다............");
        takeMoney(50000);
        loseCharm(3);

    }

    private void workCinema() {
        System.out.println("영화관 알바를 했다.");
        System.out.println("메뚜기족들 잡느라 너무 힘들다........");
        takeMoney(70000);
        loseCharm(1);
    }

    private void workRestaurant() {
        System.out.println("식당 알바를 했다.");
        System.out.println("손님이 팁을 만원 주셨다!");
        takeMoney(100000);
        loseCharm(2);
    }

    public void takeMoney(int money) {
        System.out.println("총 " + money + "원을 벌었다.");
        userController.updateUserMoney(money); // 유저의 돈이 +로 업데이트 된다.
    }

    public void loseCharm(int charm) {
        System.out.println("나의 매력이" + charm + " 하락했다.");
        userController.updateUserCharm(charm); // 유저의 매력도가 -로 업데이트 된다.
    }

    private void getUserInfo() {
        UserDTO userInfo = userController.getUserInfo(USER_CODE);
        if (userInfo == null) {
            System.out.println("유저 정보가 없습니다.");
        }
        userPrint.printUserInfo(userInfo, userController.getUserEquippedItem(userInfo.getEquippedItemCode()), userController.getUserItemList(userInfo.getBagCode()));

    }
}
