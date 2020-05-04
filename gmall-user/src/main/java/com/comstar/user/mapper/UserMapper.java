package com.comstar.user.mapper;

import com.comstar.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description: 继承通过mapper，可以减少单表查询的书写
 * User: Asus
 * Date: 2020-05-04
 * Time: 11:47
 */
public interface UserMapper extends Mapper<UmsMember> {

    //List<User> selectAllUser();
}
