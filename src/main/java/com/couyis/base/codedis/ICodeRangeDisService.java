package com.couyis.base.codedis;

import java.util.List;

import com.couyis.base.codedis.pojo.CodeRangeDis;
import com.couyis.common.web.IService;

public interface ICodeRangeDisService extends IService<CodeRangeDis> {
	
	public List<CodeRangeDis> findAll();
	

	public CodeRangeDis findByd(String id);
	
	public CodeRangeDis findByCodeId(String Codeid);
	
	public CodeRangeDis findByUrl(String url); 
	
	
}
