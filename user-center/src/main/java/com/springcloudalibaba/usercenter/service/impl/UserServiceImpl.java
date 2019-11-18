package com.springcloudalibaba.usercenter.service.impl;
import com.springcloudalibaba.usercenter.domain.dto.BusinessOwnerCarDto;
import com.springcloudalibaba.usercenter.domain.dto.BusinessParkingSpanceDto;
import com.springcloudalibaba.usercenter.domain.entity.BusinessUser;
import com.springcloudalibaba.usercenter.domain.vo.UserVo;
import com.springcloudalibaba.usercenter.mapper.BusinessUserMapper;
import com.springcloudalibaba.usercenter.service.FloorService;
import com.springcloudalibaba.usercenter.service.OwnerService;
import com.springcloudalibaba.usercenter.service.UserCarParkService;
import com.springcloudalibaba.usercenter.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserCarParkService userCarParkService;
    @Resource
    BusinessUserMapper userMapper;
    @Resource
    FloorService floorService;
    @Resource
    OwnerService ownerService;
    @Override
    public UserVo info(String UserId) {
        UserVo userVo = new UserVo();
        List<BusinessParkingSpanceDto> businessParkingSpanceDtos = userCarParkService.userPark(UserId);
        BusinessUser businessUser = userMapper.selectByUserId(UserId);
        List<BusinessOwnerCarDto> usercars = userCarParkService.userCarInfo(UserId);
        userVo.setBusinessBuildingRoomDtoList( floorService.userRoomInfo(UserId));
        userVo.setBusinessBuildingOwnerDtoList( ownerService.getListInfo(UserId));
        userVo.setBusinessUser(businessUser);
        userVo.setBusinessParkingSpanceDtoList(businessParkingSpanceDtos);
        userVo.setBusinessOwnerCarDtoList(usercars);
        return userVo;
    }

    @Override
    public BusinessUser userInfo(String userId) {
        BusinessUser businessUser = userMapper.selectByUserId(userId);
        return businessUser;
    }
}
