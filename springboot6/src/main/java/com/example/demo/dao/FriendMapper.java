package com.example.demo.dao;

import com.example.demo.entity.Friend;

public interface FriendMapper {


    int insert(Friend record);

    int insertSelective(Friend record);

}