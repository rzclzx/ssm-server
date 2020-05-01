package com.ssm.entity;

import java.util.Date;

public class WechatAuth {
  private Integer wechatAuthId;
  private Long userId;
  private Long openId;
  private Date createTime;
  public Integer getWechatAuthId() {
    return wechatAuthId;
  }
  public void setWechatAuthId(Integer wechatAuthId) {
    this.wechatAuthId = wechatAuthId;
  }
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public Long getOpenId() {
    return openId;
  }
  public void setOpenId(Long openId) {
    this.openId = openId;
  }
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
  
}
