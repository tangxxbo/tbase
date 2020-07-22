package com.couyis.base.codedis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.couyis.base.codedis.ICodeRangeDisService;
import com.couyis.base.codedis.bean.CodeRangeDisBean;
import com.couyis.base.codedis.dao.CodeRangeDisMapper;
import com.couyis.base.codedis.pojo.CodeRangeDis;
import com.couyis.common.util.UUIDUtil;
import com.couyis.common.web.bean.PageBean;

@Service
public class CodeRangeDisService implements ICodeRangeDisService{

	@Resource
	private CodeRangeDisMapper codeRangeDisMapper;
	
	@Override
	@Transactional
	public void save(CodeRangeDis t) {
		// TODO Auto-generated method stub
		t.setId(UUIDUtil.get());
		codeRangeDisMapper.save(t);
	}

	@Override
	@Transactional
	public void update(CodeRangeDis t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CodeRangeDis findById(String id) {
		// TODO Auto-generated method stub
		return codeRangeDisMapper.findById(id);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		codeRangeDisMapper.deleteById(id);
	}

	@Override
	public PageBean findPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		pageBean.setTotal(codeRangeDisMapper.findCount((CodeRangeDisBean)pageBean));
		PageBean.calculate(pageBean);
		List<CodeRangeDis> codeRanges = codeRangeDisMapper.findPage((CodeRangeDisBean) pageBean);
		pageBean.setList(codeRanges);
		return pageBean;
	}

	@Override
	public List<CodeRangeDis> findAll() {
		// TODO Auto-generated method stub
		return codeRangeDisMapper.findAll();
	}

	@Override
	public CodeRangeDis findByd(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeRangeDis findByCodeId(String Codeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeRangeDis findByUrl(String url) {
		// TODO Auto-generated method stub
		return null;
	}

}
