package com.springcloudalibaba.personmanager.Controller;

import com.springcloudalibaba.personmanager.Service.OwnerService;
import com.springcloudalibaba.personmanager.domain.entity.BusinessBuildingOwner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author www
 */
@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Resource
    OwnerService ownerService;
    @RequestMapping("/info/{userId}")
    public List<BusinessBuildingOwner> getOwnerInfo(@PathVariable String userId){
        List<BusinessBuildingOwner> owners = ownerService.getList(userId);
        return owners;
    }
}
