package com.springcloudalibaba.usercenter.domain.vo;

import com.springcloudalibaba.usercenter.domain.dto.BusinessBuildingOwnerDto;
import com.springcloudalibaba.usercenter.domain.dto.BusinessBuildingRoomDto;
import com.springcloudalibaba.usercenter.domain.dto.BusinessOwnerCarDto;
import com.springcloudalibaba.usercenter.domain.dto.BusinessParkingSpanceDto;
import com.springcloudalibaba.usercenter.domain.entity.BusinessUser;
import lombok.Data;

import java.util.List;

/**
 * @author www
 */
@Data
public class UserVo {
    /**
     * 用户信息
     */
    private BusinessUser businessUser;
    /**
     * 车辆信息
     */
    private List<BusinessOwnerCarDto> businessOwnerCarDtoList;
    /**
     * 车位信息
     */
    private List<BusinessParkingSpanceDto> businessParkingSpanceDtoList;

    /**
     * 用户房子信息
     */
    private List<BusinessBuildingRoomDto> businessBuildingRoomDtoList;
    /**
     * 人员信息
     */
    private List<BusinessBuildingOwnerDto>  businessBuildingOwnerDtoList;
}
