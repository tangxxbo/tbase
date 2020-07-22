package com.couyis.base.codedis.dao;

import java.util.List;

import com.couyis.base.codedis.bean.CodeRangeDisBean;
import com.couyis.base.codedis.pojo.CodeRangeDis;

public interface CodeRangeDisMapper {

	Integer findCount(CodeRangeDisBean codeRangeBean);

	List<CodeRangeDis> findPage(CodeRangeDisBean codeRangeBean);

	List<CodeRangeDis> findAll();
	
	CodeRangeDis findById(String id);

	int deleteById(String id);

	int save(CodeRangeDis cr);

	int update(CodeRangeDis cr);
	
}
