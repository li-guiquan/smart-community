package com.springcloudalibaba.usercenter.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessBuildingOwnerDto {
    /**
     * 业主成员ID
     */
    private String memberId;

    /**
     * 业主ID
     */
    private String ownerId;

    /**
     * 业务Id
     */
    private String bId;

    /**
     * 业主名称
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 联系人手机号
     */
    private String link;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据状态，添加ADD，修改MOD 删除DEL
     */
    private String operate;

    /**
     * 1001 业主本人 1002 家庭成员
     */
    private String ownerTypeCd;
}
