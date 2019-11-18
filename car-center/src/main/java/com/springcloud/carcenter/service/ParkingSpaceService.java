package com.springcloud.carcenter.service;

import com.springcloud.carcenter.entity.BusinessParkingSpace;

import java.util.List;

public interface ParkingSpaceService {
    /**根据用户id查询车辆的信息
     *
     * @param userId
     * @return
     */
   BusinessParkingSpace getParkSpace(String userId);

    /**根据用户Id查询他所有的车位信息
     *
     * @param userId
     * @return
     */
    List<BusinessParkingSpace> getUserAllParkSpace(String userId);
}
