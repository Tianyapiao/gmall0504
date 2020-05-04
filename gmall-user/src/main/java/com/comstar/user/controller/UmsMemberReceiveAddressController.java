package com.comstar.user.controller;

import com.comstar.user.bean.UmsMemberReceiveAddress;
import com.comstar.user.service.UmsMemberReceiveAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description: 收获地址控制类
 * User: Asus
 * Date: 2020-05-04
 * Time: 21:09
 */
@Controller
public class UmsMemberReceiveAddressController {
    private Logger logger= LoggerFactory.getLogger(UmsMemberReceiveAddressController.class);
    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    //查询用户id查询
    @GetMapping("/queryByMemberId/{id}")
    @ResponseBody
    public List<UmsMemberReceiveAddress> queryByMemberId(@PathVariable("id")String id){
        logger.debug("正在查询"+id+"号用户的收获地址");
        List<UmsMemberReceiveAddress> address=umsMemberReceiveAddressService.getMemberAddress(id);
        return address;
    }
}
