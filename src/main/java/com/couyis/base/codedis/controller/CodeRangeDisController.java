package com.couyis.base.codedis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couyis.base.codedis.ICodeRangeDisService;
import com.couyis.base.codedis.bean.CodeRangeDisBean;
import com.couyis.base.codedis.pojo.CodeRangeDis;
import com.couyis.common.web.bean.PageBean;
import com.couyis.common.web.controller.BaseController;


@RestController
@RequestMapping("/base/coderangedis")
public class CodeRangeDisController extends BaseController{

	@Resource
	private ICodeRangeDisService codeRangeDisService;
	
	@RequestMapping(value = "/list")
	public PageBean list(@RequestBody CodeRangeDisBean pageBean) {
		
		return codeRangeDisService.findPage(pageBean);
	}
	
	@RequestMapping(value = "/add")
	public void add(@RequestBody CodeRangeDis cr, HttpServletRequest request) {
		cr.setCreateUser(getAccount(request));
		cr.setCreateTime(getNow());
		codeRangeDisService.save(cr);
	}

//	@RequestMapping(value = "/edit/{id}")
//	public CodeRangeDis edit(@PathVariable("id") String id) {
//		return codeRangeDisService.findById(id);
//	}
//
//	@RequestMapping(value = "/edit")
//	public void edit(@RequestBody CodeRangeDis cr, HttpServletRequest request) {
//		cr.setUpdateUser(getAccount(request));
//		cr.setUpdateTime(getNow());
//		codeRangeDisService.update(cr);
//	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") String id) {
		codeRangeDisService.delete(id);
	}
	
	@RequestMapping(value = "/delete")
	public void delete(@RequestBody String[] ids) {
		for (String id : ids) {
			codeRangeDisService.delete(id);
		}
	}
	
	@RequestMapping(value = "/findAll")
	public List<CodeRangeDis> findAll() {
		return codeRangeDisService.findAll();
	}
	
}
