package com.ssm.service;

import java.io.File;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.BaseTest;
import com.ssm.dto.ShopExecution;
import com.ssm.entity.Area;
import com.ssm.entity.PersonInfo;
import com.ssm.entity.Shop;
import com.ssm.entity.ShopCategory;
import com.ssm.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest{
  @Autowired
  private ShopService shopService;
  
  @Test
  public void testAddShop() {
    Shop shop = new Shop();
    Area area = new Area();
    PersonInfo owner = new PersonInfo();
    ShopCategory shopCategory = new ShopCategory();
    owner.setUserId(1L);
    area.setAreaId(2);
    shopCategory.setShopCategoryId(1);
    shop.setArea(area);
    shop.setShopCategory(shopCategory);
    shop.setOwner(owner);
    shop.setShopName("测试尼玛");
    shop.setShopDesc("测试");
    shop.setShopAddr("东门");
    shop.setPhone(17718787876L);
    shop.setPriority(1);
    shop.setShopImg("test");
    shop.setCreateTime(new Date());
    shop.setUpdateTime(new Date());
    shop.setEnableStatus(ShopStateEnum.CHECK.getState());
    shop.setAdvice(1);
    
    File shopImg = new File("/Users/zhangfei/Pictures/tu.jpg");
    
    //ShopExecution se = shopService.addShop(shop, shopImg);
    //System.out.println(se.getState());
  }
}
