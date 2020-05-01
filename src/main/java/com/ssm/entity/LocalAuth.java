package com.ssm.entity;

import java.util.Date;

public class LocalAuth {
  private Long localAuthId;
  private Long userId;
  private String userName;
  private String password;
  private Date createTime;
  private Date updateTime;
  public Long getLocalAuthId() {
    return localAuthId;
  }
  public void setLocalAuthId(Long localAuthId) {
    this.localAuthId = localAuthId;
  }
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
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
  
}
