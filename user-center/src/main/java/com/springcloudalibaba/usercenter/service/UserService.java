package com.springcloudalibaba.usercenter.service;

import com.springcloudalibaba.usercenter.domain.entity.BusinessUser;
import com.springcloudalibaba.usercenter.domain.vo.UserVo;

public interface UserService {
    UserVo info (String UserId);
    BusinessUser userInfo (String userId);
}
