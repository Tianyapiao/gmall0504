package com.comstar.user.service.impl;

import com.comstar.user.bean.UmsMember;
import com.comstar.user.mapper.UserMapper;
import com.comstar.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Asus
 * Date: 2020-05-04
 * Time: 11:47
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UmsMember> getAllUser() {
        //List<User> users=userMapper.selectAllUser();
        //调用通用mapper中的查询方法
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }
}
