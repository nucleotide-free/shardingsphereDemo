package com.tl.jdbc;

import com.example.shardingspheredemo.ShardingsphereDemoApplication;
import jdbcDemo.entity.Course;
import jdbcDemo.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = {ShardingsphereDemoApplication.class })
@RunWith(SpringRunner.class)
public class testDemo {

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void addCourse(){
    for(int i = 0; i < 10; i++) {
        Course course = new Course();
        course.setCname("java");
        course.setUserId(100L);
        course.setCstatus("1");
        courseMapper.insert(course);
        System.out.println(course);
    }
}
}
