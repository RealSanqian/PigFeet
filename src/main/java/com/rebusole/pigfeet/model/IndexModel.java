package com.rebusole.pigfeet.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class IndexModel {
    // 获取.yml 文件中值
    @Value("${rebusole}")
    private String name;

}
