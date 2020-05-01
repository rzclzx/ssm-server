package com.ssm.entity;

import java.util.Date;

public class ShopCategory {
  private Integer shopCategoryId;
  private String shopCategoryName;
  private String shopCategoryDesc;
  private String shopCategoryImg;
  private int priority;
  private Date createTime;
  // 更新时间
  private Date updateTime;
  private int parentId;
  public Integer getShopCategoryId() {
    return shopCategoryId;
  }
  public void setShopCategoryId(Integer shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }
  public String getShopCategoryName() {
    return shopCategoryName;
  }
  public void setShopCategoryName(String shopCategoryName) {
    this.shopCategoryName = shopCategoryName;
  }
  public String getShopCategoryDesc() {
    return shopCategoryDesc;
  }
  public void setShopCategoryDesc(String shopCategoryDesc) {
    this.shopCategoryDesc = shopCategoryDesc;
  }
  public String getShopCategoryImg() {
    return shopCategoryImg;
  }
  public void setShopCategoryImg(String shopCategoryImg) {
    this.shopCategoryImg = shopCategoryImg;
  }
  public int getPriority() {
    return priority;
  }
  public void setPriority(int priority) {
    this.priority = priority;
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
  public int getParentId() {
    return parentId;
  }
  public void setParentId(int parentId) {
    this.parentId = parentId;
  }
  
}
