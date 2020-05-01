package com.ssm.service.impt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.service.AreaService;
import com.ssm.dao.AreaDao;
import com.ssm.entity.Area;

@Service
public class AreaServierImpl implements AreaService{
  
  @Autowired
  private AreaDao areaDao;
  
  @Override
  public List<Area> getAreaList () {
    return areaDao.queryArea();
    
  }

}
