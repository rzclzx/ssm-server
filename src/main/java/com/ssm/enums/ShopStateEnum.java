package com.ssm.enums;

public enum ShopStateEnum {
  CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(2, "内部系统错误"),
  NULL_SHOPID(-1002, "店铺id为空"), NULL_SHOP(-1003, "店铺不存在");

  private int state;

  private String stateInfo;

  private ShopStateEnum(int state, String stateInfo) {
    this.state = state;
    this.stateInfo = stateInfo;
  }

  public static ShopStateEnum stateOf(int state) {
    for (ShopStateEnum shopStateEnum : values()) {
      if (shopStateEnum.getState() == state) {
        return shopStateEnum;
      }
    }
    return null;
  }

  public int getState() {
    return state;
  }

  public String getStateInfo() {
    return stateInfo;
  }

}
