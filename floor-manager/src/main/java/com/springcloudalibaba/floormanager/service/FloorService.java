package com.springcloudalibaba.floormanager.service;

import com.springcloudalibaba.floormanager.domian.entity.BusinessBuildingRoom;

import java.util.List;

public interface FloorService {
    List<BusinessBuildingRoom> getlist(String userId);
}
