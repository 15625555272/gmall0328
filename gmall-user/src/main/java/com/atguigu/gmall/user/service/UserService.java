package com.atguigu.gmall.user.service;

import com.atguigu.gmall.beans.UmsMember;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    UmsMember getUserById(String uid);
}
