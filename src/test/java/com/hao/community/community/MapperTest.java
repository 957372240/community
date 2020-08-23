package com.hao.community.community;


import com.hao.community.community.dao.DiscussPostMapper;
import com.hao.community.community.dao.UserMapper;
import com.hao.community.community.entity.DiscussPost;
import com.hao.community.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }
    @Test
    public void testInsertUser(){
        User user =new User();

    }
    @Test
    public void testSelectPost(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post :list
                ) {
            System.out.println(post);
        }
        int row =discussPostMapper.selectDiscussPostRows(0);
        System.out.println(row);
    }
}
