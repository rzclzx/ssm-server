package com.ssm.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.BaseTest;
import com.ssm.entity.ShopCategory;

public class ShopCategoryTest extends BaseTest{
  @Autowired 
  private ShopCategoryDao shopCategoryDao;
  
  @Test
  public void testQueryShopCategory() {
    
    List<ShopCategory> list = shopCategoryDao.queryShopCategory();
    System.out.println(list.get(1).getShopCategoryName());
    
  }
}
