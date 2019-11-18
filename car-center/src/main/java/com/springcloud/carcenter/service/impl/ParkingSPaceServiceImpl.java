package com.springcloud.carcenter.service.impl;

import com.springcloud.carcenter.entity.BusinessParkingSpace;
import com.springcloud.carcenter.mapper.BusinessParkingSpaceMapper;
import com.springcloud.carcenter.service.ParkingSpaceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingSPaceServiceImpl implements ParkingSpaceService {
    @Resource
    BusinessParkingSpaceMapper parkingSpaceMapper;

    /**
     *
     * @param psId
     * @return 车位信息
     */
    @Override
    public BusinessParkingSpace getParkSpace(String psId) {

        return parkingSpaceMapper.selectByPsId(psId);
    }

    /**
     *
     * @param userId
     * @return 用户所有的车位信息
     */
    @Override
    public List<BusinessParkingSpace> getUserAllParkSpace(String userId) {
        return parkingSpaceMapper.selectByUserId(userId);
    }
}

