package com.dgut.clouddisk;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dgut.clouddisk.entity.File;
import com.dgut.clouddisk.service.impl.FileServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test {

    @Autowired
    FileServiceImpl fileService;

    @Test
    void testSql() {
        QueryWrapper<File> wrapper = new QueryWrapper<>();
        wrapper.like("file_name", "你");
        List<File> list = fileService.list(wrapper);
        for (File file : list) {
            System.out.println(file);

        }
    }
}
