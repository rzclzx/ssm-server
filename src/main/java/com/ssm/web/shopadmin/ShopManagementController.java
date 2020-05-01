package com.ssm.web.shopadmin;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.dto.ShopExecution;
import com.ssm.entity.Area;
import com.ssm.entity.PersonInfo;
import com.ssm.entity.Shop;
import com.ssm.entity.ShopCategory;
import com.ssm.enums.ShopStateEnum;
import com.ssm.service.ShopService;

@Controller
@RequestMapping("/shopadmin")
public class ShopManagementController {
  @Autowired
  private ShopService shopService;
  @CrossOrigin
  @RequestMapping(value = "/registershop", method = RequestMethod.POST)
  @ResponseBody
  private Map<String, Object> registerShop(HttpServletRequest request) throws IOException {
    Map<String, Object> modelMap = new HashMap<String, Object>();
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
    shop.setPriority(1);
    shop.setShopImg("test");
    shop.setCreateTime(new Date());
    shop.setUpdateTime(new Date());
    shop.setEnableStatus(ShopStateEnum.CHECK.getState());
    shop.setAdvice(1);
    shop.setShopName(request.getParameter("name"));
    shop.setShopAddr(request.getParameter("addr"));
    shop.setOwnerId(123);
    shop.setPhone(17718787876L);
    shop.setShopDesc(request.getParameter("desc"));
    ShopExecution se = shopService.addShop(shop, request.getParameter("file"));
    return modelMap;
  }
}
