package com.springcloudalibaba.usercenter.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BusinessParkingSpanceDto {
    /**
     * 车位ID
     */
    private String psId;

    /**
     * 业务Id
     */
    private String bId;

    /**
     * 小区ID
     */
    private String communityId;

    /**
     * 车位编号
     */
    private String num;

    /**
     * 车位类型,地上停车位1001 地下停车位 2001
     */
    private String typeCd;

    /**
     * 车位状态 出售 S，出租 H ，空闲 F
     */
    private String state;

    /**
     * 车位面积
     */
    private BigDecimal area;

    /**
     * 用户ID
     */
    private String userId;

    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据状态，添加ADD，修改MOD 删除DEL
     */
    private String operate;
}
