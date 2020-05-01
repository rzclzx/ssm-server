package com.ssm.entity;

import java.util.Date;

public class Shop {
  private Integer shopId;
  private Integer ownerId;
  private Integer areaId;
  private Integer shopCategoryId;
  private String shopName;
  private String shopDesc;
  private String shopAddr;
  private Long phone;
  private int priority;
  private String shopImg;
  private Date createTime;
  // 更新时间
  private Date updateTime;
  private int enableStatus;
  private int advice;
  
  private Area area;
  private PersonInfo owner;
  private ShopCategory shopCategory;
  public Integer getShopId() {
    return shopId;
  }
  public void setShopId(Integer shopId) {
    this.shopId = shopId;
  }
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }
  public Integer getAreaId() {
    return areaId;
  }
  public void setAreaId(Integer areaId) {
    this.areaId = areaId;
  }
  public Integer getShopCategoryId() {
    return shopCategoryId;
  }
  public void setShopCategoryId(Integer shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }
  public String getShopName() {
    return shopName;
  }
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }
  public String getShopDesc() {
    return shopDesc;
  }
  public void setShopDesc(String shopDesc) {
    this.shopDesc = shopDesc;
  }
  public String getShopAddr() {
    return shopAddr;
  }
  public void setShopAddr(String shopAddr) {
    this.shopAddr = shopAddr;
  }
  public Long getPhone() {
    return phone;
  }
  public void setPhone(Long phone) {
    this.phone = phone;
  }
  public int getPriority() {
    return priority;
  }
  public void setPriority(int priority) {
    this.priority = priority;
  }
  public String getShopImg() {
    return shopImg;
  }
  public void setShopImg(String shopImg) {
    this.shopImg = shopImg;
  }
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  public Date getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
  public int getEnableStatus() {
    return enableStatus;
  }
  public void setEnableStatus(int enableStatus) {
    this.enableStatus = enableStatus;
  }
  public int getAdvice() {
    return advice;
  }
  public void setAdvice(int advice) {
    this.advice = advice;
  }
  public Area getArea() {
    return area;
  }
  public void setArea(Area area) {
    this.area = area;
  }
  public PersonInfo getOwner() {
    return owner;
  }
  public void setOwner(PersonInfo owner) {
    this.owner = owner;
  }
  public ShopCategory getShopCategory() {
    return shopCategory;
  }
  public void setShopCategory(ShopCategory shopCategory) {
    this.shopCategory = shopCategory;
  }
  
  
}
