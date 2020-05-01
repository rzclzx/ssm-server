package com.ssm.dto;

import java.util.List;

import com.ssm.entity.Shop;
import com.ssm.enums.ShopStateEnum;

public class ShopExecution {
  
  private int state;
  
  private String stateInfo;
  
  private int count;
  
  private Shop shop;
  
  private List<Shop> shopList;
  
  public ShopExecution() {
    
  }
  
  public ShopExecution(ShopStateEnum shopStateEnum) {
    this.state = shopStateEnum.getState();
    this.stateInfo = shopStateEnum.getStateInfo();
  }
  
  public ShopExecution(ShopStateEnum shopStateEnum, Shop shop) {
    this.state = shopStateEnum.getState();
    this.stateInfo = shopStateEnum.getStateInfo();
    this.shop = shop;
  }
  
  public ShopExecution(ShopStateEnum shopStateEnum, List<Shop> shopList) {
    this.state = shopStateEnum.getState();
    this.stateInfo = shopStateEnum.getStateInfo();
    this.shopList = shopList;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public String getStateInfo() {
    return stateInfo;
  }

  public void setStateInfo(String stateInfo) {
    this.stateInfo = stateInfo;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public List<Shop> getShopList() {
    return shopList;
  }

  public void setShopList(List<Shop> shopList) {
    this.shopList = shopList;
  }
  
}
