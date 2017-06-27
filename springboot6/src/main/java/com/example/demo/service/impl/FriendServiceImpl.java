package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendMapper;
import com.example.demo.entity.Friend;
import com.example.demo.entity.ReturnMsg;
import com.example.demo.service.FriendService;

@Service
public class FriendServiceImpl implements FriendService{

	@Autowired
	private FriendMapper friendMapper;
	@Override
	public ReturnMsg insert(Friend friend) {
	int temp=friendMapper.insert(friend);
	ReturnMsg returnMsg=null;
		if (temp>0) {
			returnMsg=new ReturnMsg("SUCCESS",friend,"###添加成功###");
		}/*else{
			returnMsg=new ReturnMsg("FALSE",friend,"###添加失败###");
		}*/
		return returnMsg;
	}

}
