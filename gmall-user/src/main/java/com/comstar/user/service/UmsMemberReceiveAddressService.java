package com.comstar.user.service;

import com.comstar.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Asus
 * Date: 2020-05-04
 * Time: 21:10
 */
public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getMemberAddress(String id);
}
