package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Friend;
import com.example.demo.entity.ReturnMsg;
import com.example.demo.service.FriendService;

@RestController
@RequestMapping("/validated")
public class FriendController {
	
	@Autowired
	private FriendService friendService;
	
	@RequestMapping(value="/addFriend",method=RequestMethod.POST)
	public ReturnMsg addFriend(@Valid Friend friend,BindingResult result){
		//@RequestBody
		ReturnMsg	returnMsg=null;
		if (!result.hasErrors()) {
				returnMsg=friendService.insert(friend);
			return returnMsg;
				}else{
					String errorMsg=null;
			//获取错误字段集合
			List<FieldError> fieldErrors=result.getFieldErrors();
			//遍历错误字段获取错误消息
				for (FieldError fieldError : fieldErrors) {
			//	errorMsg=fieldError.toString();
					errorMsg=fieldError.getDefaultMessage();
				//System.out.println(fieldError.getDefaultMessage());
				//	System.out.println(fieldError);
					
		}
				returnMsg=new ReturnMsg("FALSE",friend,errorMsg);
				}
		return returnMsg;	
}
}
