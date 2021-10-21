package com.SpringbootJdbcTemplate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Demo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getallStudentnames(){
        List<String> names=new ArrayList<>();
        names.addAll(jdbcTemplate.queryForList("select name from student1",String.class));

        return names;
    }
}
