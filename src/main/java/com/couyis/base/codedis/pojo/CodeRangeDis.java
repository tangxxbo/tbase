package com.couyis.base.codedis.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CodeRangeDis {
	
	private String id;
	
	private String codeRangeId;
	
	private	String codeRangeCode;
	
	private String typeUrl;
	
	private String createUser;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodeRangeId() {
		return codeRangeId;
	}

	public void setCodeRangeId(String codeRangeId) {
		this.codeRangeId = codeRangeId;
	}
	
	public String getCodeRangeCode() {
		return codeRangeCode;
	}

	public void setCodeRangeCode(String codeRangeCode) {
		this.codeRangeCode = codeRangeCode;
	}

	public String getTypeUrl() {
		return typeUrl;
	}

	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
}
