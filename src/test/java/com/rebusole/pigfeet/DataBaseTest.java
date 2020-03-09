package com.rebusole.pigfeet;

import com.rebusole.pigfeet.mapper.BaseDictionaryMapper;
import com.rebusole.pigfeet.model.BaseDictionaryInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataBaseTest {

    @Autowired
    private BaseDictionaryMapper baseDictionaryMapper;

    @Test
    public void testSelect() {
        System.out.println(("————————————开始————————————"));
        List<BaseDictionaryInfo> userList = baseDictionaryMapper.selectList(null);
        userList.forEach(System.out::println);
        System.out.println(("————————————结束————————————"));
    }
}
