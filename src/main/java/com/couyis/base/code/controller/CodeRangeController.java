package com.couyis.base.code.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couyis.base.code.ICodeRangeService;
import com.couyis.base.code.bean.CodeRangeBean;
import com.couyis.base.code.pojo.CodeRange;
import com.couyis.common.web.bean.PageBean;
import com.couyis.common.web.controller.BaseController;

@RestController
@RequestMapping("/base/coderange")
public class CodeRangeController extends BaseController{
	
	@Resource
	private ICodeRangeService codeRangeService;
	 
	@RequestMapping(value = "/list")
	public PageBean list(@RequestBody CodeRangeBean pageBean) {
		return codeRangeService.findPage(pageBean);
	}
	
	@RequestMapping(value = "/add")
	public void add(@RequestBody CodeRange cr, HttpServletRequest request) {
		cr.setCreateUser(getAccount(request));
		cr.setCreateTime(getNow());
		codeRangeService.save(cr);
	}

	@RequestMapping(value = "/edit/{id}")	
	public CodeRange edit(@PathVariable("id") String id) {
		return codeRangeService.findById(id);
	}

	@RequestMapping(value = "/edit")
	public void edit(@RequestBody CodeRange cr, HttpServletRequest request) {
		cr.setUpdateUser(getAccount(request));
		cr.setUpdateTime(getNow());
		codeRangeService.update(cr);
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") String id) {
		codeRangeService.delete(id);
	}
	
	@RequestMapping(value = "/delete")
	public void delete(@RequestBody String[] ids) {
		for (String id : ids) {
			codeRangeService.delete(id);
		}
	}
	
	@RequestMapping(value = "/findAll")
	public List<CodeRange> findAll() {
		List<CodeRange> abc = codeRangeService.findAll();
		for (int i = 0; i < abc.size(); i++) {
			System.out.println(abc.get(i).getId()+"-"+abc.get(i).getCode());
		}
		
		return codeRangeService.findAll();
	}
	
	@RequestMapping(value = "/checkCode")
	public Boolean checkCode(String code) {
		return codeRangeService.findCode(code);
	}
	
	@RequestMapping(value = "/findByCrId")
	public String findByCrId(String id) {
		return codeRangeService.findByCrId(id);
	}
}
