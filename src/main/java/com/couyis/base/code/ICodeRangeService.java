/**
 * 
 */
package com.couyis.base.code;

import java.util.List;

import com.couyis.base.code.pojo.CodeRange;
import com.couyis.common.web.IService;

/**
 * @author tangxiaoxu
 *
 */
public interface ICodeRangeService extends IService<CodeRange> {
	public List<CodeRange> findAll();
	
	public CodeRange findByCode(String code);
	
	public CodeRange findByName(String name); 
	
	public String findMaxCode(); 
	

	public Boolean findCode(String code);
	
	public String findByCrId(String id);
}
