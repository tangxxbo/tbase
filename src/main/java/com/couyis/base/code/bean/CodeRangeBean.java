package com.couyis.base.code.bean;

import com.couyis.common.web.bean.PageBean;

public class CodeRangeBean extends PageBean {

	private String code;
	
	private String startCode;
	
	private String stopCode;
	
	private String maxCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStartCode() {
		return startCode;
	}

	public void setStartCode(String startCode) {
		this.startCode = startCode;
	}

	public String getStopCode() {
		return stopCode;
	}

	public void setStopCode(String stopCode) {
		this.stopCode = stopCode;
	}

	public String getMaxCode() {
		return maxCode;
	}

	public void setMaxCode(String maxCode) {
		this.maxCode = maxCode;
	}

	@Override
	public String fieldConvert(String field) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
