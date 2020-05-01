package com.ssm.dao;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.BaseTest;
import com.ssm.entity.Area;
import com.ssm.entity.PersonInfo;
import com.ssm.entity.Shop;
import com.ssm.entity.ShopCategory;

import ch.qos.logback.core.encoder.EchoEncoder;

public class ShopDaoTest extends BaseTest{
  
  @Autowired
  private ShopDao shopDao;
  @Test
  @Ignore
  public void testInsertShop() {
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
    shop.setAdvice(1);
    System.out.println(shopDao.insertShop(shop));
  }
  @Test
  public void testUpdateShop() {
    Shop shop = new Shop();
    shop.setShopId(9);
    shop.setShopDesc("张飞真帅");
    shop.setShopAddr("缩缝元");
    shop.setUpdateTime(new Date());
    try {
      int effectNum = shopDao.updateShop(shop);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }
    
  }
}
