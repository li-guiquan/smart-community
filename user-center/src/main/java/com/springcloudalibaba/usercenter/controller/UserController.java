package com.springcloudalibaba.usercenter.controller;

import com.springcloudalibaba.usercenter.domain.vo.UserVo;
import com.springcloudalibaba.usercenter.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/list/{userId}")
    public UserVo getInfo( @PathVariable String userId){
        UserVo info = userService.info(userId);
        return info;
    }
}
