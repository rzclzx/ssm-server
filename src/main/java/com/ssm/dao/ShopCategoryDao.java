package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.ShopCategory;

public interface ShopCategoryDao {
  List<ShopCategory> queryShopCategory(@Param("parentId") int parentId);

  List<ShopCategory> queryShopCategory();
}
