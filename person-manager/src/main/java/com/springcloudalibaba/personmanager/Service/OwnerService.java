package com.springcloudalibaba.personmanager.Service;

import com.springcloudalibaba.personmanager.domain.entity.BusinessBuildingOwner;

import java.util.List;

public interface OwnerService {
    List<BusinessBuildingOwner> getList(String userId);
}
