package com.rebusole.pigfeet.model;

import lombok.Data;

import java.util.Date;
/**
 * 字典表
 * */
@Data
public class BaseDictionaryInfo {
    /**
     * id
     * */
    Integer id;

    /**
     * 编码
     * */
    String dicCode;

    /**
     * 描述
     * */
    String dicDesc;

    /**
     * 备注
     * */
    String remark;

    /**
     * 创建时间
     * */
    Date createTime;

    /**
     * 更新时间
     * */
    Date updateTime;
}
