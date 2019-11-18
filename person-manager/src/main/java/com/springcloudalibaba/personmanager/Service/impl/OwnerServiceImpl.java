package com.springcloudalibaba.personmanager.Service.impl;

import com.springcloudalibaba.personmanager.Mapper.BusinessBuildingOwnerMapper;
import com.springcloudalibaba.personmanager.Service.OwnerService;
import com.springcloudalibaba.personmanager.domain.entity.BusinessBuildingOwner;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OwnerServiceImpl implements OwnerService {
    @Resource
    BusinessBuildingOwnerMapper ownerMapper;
    @Override
    public List<BusinessBuildingOwner> getList(String userId) {
        List<BusinessBuildingOwner> owners = ownerMapper.selectByUserId(userId);
        return owners;
    }
}
