package com.couyis.base.code.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.couyis.base.code.ICodeRangeService;
import com.couyis.base.code.bean.CodeRangeBean;
import com.couyis.base.code.dao.CodeRangeMapper;
import com.couyis.base.code.pojo.CodeRange;
import com.couyis.common.util.UUIDUtil;
import com.couyis.common.web.bean.PageBean;

@Service
public class CodeRangeService implements ICodeRangeService {

	@Resource
	private CodeRangeMapper codeRangeMapper;
	
	@Override
	@Transactional
	public void save(CodeRange t) {
		// TODO Auto-generated method stub
		t.setId(UUIDUtil.get());
		codeRangeMapper.save(t);
	}

	@Override
	@Transactional
	public void update(CodeRange t) {
		// TODO Auto-generated method stub
		codeRangeMapper.update(t);
	}

	@Override
	public CodeRange findById(String id) {
		// TODO Auto-generated method stub
		return codeRangeMapper.findById(id);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		codeRangeMapper.deleteById(id);
	}

	@Override
	public PageBean findPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		pageBean.setTotal(codeRangeMapper.findCount((CodeRangeBean)pageBean));
		PageBean.calculate(pageBean);
		List<CodeRange> codeRanges = codeRangeMapper.findPage((CodeRangeBean) pageBean);
		pageBean.setList(codeRanges);
		return pageBean;
	}
	
	@Override
	public List<CodeRange> findAll() {
		// TODO Auto-generated method stub
		return codeRangeMapper.findAll();
	}

	@Override
	public CodeRange findByCode(String code) {
		// TODO Auto-generated method stub
		return codeRangeMapper.findByCode(code);
	}

	@Override
	public CodeRange findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findMaxCode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean findCode(String code) {
		// TODO Auto-generated method stub
		System.out.println(codeRangeMapper.findCode(code));
		if(codeRangeMapper.findCode(code)== null || "".equals(codeRangeMapper.findCode(code))) {
			return false;
		}
		return true ;
	}

	@Override
	public String findByCrId(String id) {
		// TODO Auto-generated method stub
		return codeRangeMapper.findByCrId(id);
	}

}
