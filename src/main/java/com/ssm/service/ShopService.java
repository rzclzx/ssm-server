package com.ssm.service;

import java.io.File;

import org.springframework.stereotype.Service;

import com.ssm.dto.ShopExecution;
import com.ssm.entity.Shop;

@Service
public interface ShopService {
  ShopExecution addShop(Shop shop, String shopImg);
}
