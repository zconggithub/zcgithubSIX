package com.example.demo.entity;
/**
 * 
 * @author 周聪
 * 返回数据的封装
 *
 */
public class ReturnMsg {
	
	private String returnCode;//返回码
	
	private Object data;//返回数据
	
	private String backMsg;//返回信息

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getbackMsg() {
		return backMsg;
	}

	public void setbackMsg(String backMsg) {
		this.backMsg = backMsg;
	}

	public ReturnMsg(String returnCode, Object data, String backMsg) {
		super();
		this.returnCode = returnCode;
		this.data = data;
		this.backMsg = backMsg;
	}
	
	public ReturnMsg(){}

}
