package com.rpg.user.dto;

/**
 * ItemDTO가 이미 정의되어 있으나, 유저의 정보를 불러올 때도 ItemDTO를 사용해야 한다.
 * 그러나 기존에 있던 ItemDTO와 충돌 및 혼선을 방지하기 위해 새롭게 만들었다.
 * 단순히 Item을 보여주기만 하면 되므로, 아이템의 타입은 ITEM_CATEGORY 속성으로 구분하고
 * 객체를 생성하기 위해 추상 클래스로 정의하지 않고 일반 클래스로 정의하였다.
 */
public class UserItemDTO {

    private int code;

    private int category;

    private String name;

    private int price;

    private int charm;

    public UserItemDTO() {
    }

    public UserItemDTO(int code, int category, String name, int price, int charm) {
        this.code = code;
        this.category = category;
        this.name = name;
        this.price = price;
        this.charm = charm;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    @Override
    public String toString() {
        return name;
    }
}