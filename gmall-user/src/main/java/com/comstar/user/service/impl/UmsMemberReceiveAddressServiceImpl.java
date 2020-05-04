package com.comstar.user.service.impl;

import com.comstar.user.bean.UmsMemberReceiveAddress;
import com.comstar.user.mapper.UmsMemberReceiveAddressMapper;
import com.comstar.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Asus
 * Date: 2020-05-04
 * Time: 21:10
 */
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    private UmsMemberReceiveAddressMapper memberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getMemberAddress(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        List<UmsMemberReceiveAddress> addressList = memberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return addressList;
    }
}
