package com.couyis.base.code.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.couyis.base.code.bean.CodeRangeBean;
import com.couyis.base.code.pojo.CodeRange;

public interface CodeRangeMapper {
	
	Integer findCount(CodeRangeBean codeRangeBean);

	List<CodeRange> findPage(CodeRangeBean codeRangeBean);

	List<CodeRange> findAll();
	
	String findCode(String code);
	
	String findByCrId(String id);
	
	CodeRange findByCode(@Param("code") String code);
	
	CodeRange findById(String id);

	int deleteById(String id);

	int save(CodeRange cr);

	int update(CodeRange cr);
}
