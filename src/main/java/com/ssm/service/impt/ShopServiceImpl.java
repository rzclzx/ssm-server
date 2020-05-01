package com.ssm.service.impt;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.ShopDao;
import com.ssm.dto.ShopExecution;
import com.ssm.entity.Shop;
import com.ssm.enums.ShopStateEnum;
import com.ssm.service.ShopService;
import com.ssm.util.ImageUtil;
import com.ssm.util.PathUtil;

import exceptions.ShopOperationException;

@Service
public class ShopServiceImpl implements ShopService{
  
  @Autowired
  private ShopDao shopDao;
  @Override
  @Transactional
  public ShopExecution addShop(Shop shop, String shopImg) {
    if(shop == null) {
      return new ShopExecution(ShopStateEnum.NULL_SHOP);
    }
    
    try {
      
      shop.setEnableStatus(0);
      shop.setCreateTime(new Date());
      shop.setUpdateTime(new Date());
      int effectNum = shopDao.insertShop(shop);
      
      if (effectNum <= 0) {
        throw new ShopOperationException("店铺创建失败");
      } else {
        if (shopImg != null) {
          try {
            addShopImg(shop, shopImg);
          } catch (Exception e) {
            throw new ShopOperationException("addShopImg error:" + e.getMessage());
          }
          
          // 更新店铺图片地址
          effectNum = shopDao.updateShop(shop);
          
          if (effectNum <= 0) {
            throw new ShopOperationException("更新图片地址失败");
          }
        }
      }
    } catch (Exception e) {
      throw new ShopOperationException("addShop error" + e.getMessage());
    }
    return new ShopExecution(ShopStateEnum.CHECK, shop);
  }
  // 添加店铺图片
  private void addShopImg(Shop shop, String shopImg) throws IOException {
    String shopImgPath = PathUtil.getShopImagePath(shop.getShopId());
    String path = ImageUtil.generateThumbnail(shopImg, shopImgPath);
    shop.setShopImg(path);
  }

}
