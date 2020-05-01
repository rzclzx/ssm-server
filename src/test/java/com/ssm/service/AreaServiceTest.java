package com.ssm.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.BaseTest;
import com.ssm.entity.Area;

public class AreaServiceTest extends BaseTest{
  
  @Autowired
  private AreaService areaService;
  @Test
  public void testGetAreaList() {
    List<Area> areaList = areaService.getAreaList();
    assertEquals("东苑", areaList.get(1).getAreaName());
  }
}
