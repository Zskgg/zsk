/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieController.java 
 * @Prject: zhangshuaikang-week1
 * @Package: com.zhangshuaikang.week1.controller 
 * @Description: TODO
 * @author: 男神康   
 * @date: 2019年9月3日 上午9:00:51 
 * @version: V1.0   
 */
package com.zhangshuaikang.week1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangshuaikang.week1.domain.Movie;
import com.zhangshuaikang.week1.domain.Movies;
import com.zhangshuaikang.week1.service.MovieService;
import com.zhangshuaikang.week1.utils.PageUtils;

/** 
 * @ClassName: MovieController 
 * @Description: TODO
 * @author: 男神康
 * @date: 2019年9月3日 上午9:00:51  
 */
@Controller
public class MovieController {

	@Resource
	private MovieService service;
	
	@RequestMapping("selects")
	public String selects(@RequestParam(defaultValue = "")String mname,Model model,@RequestParam(defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Movie> moviea = service.selects(mname);
		PageInfo info = new PageInfo(moviea);
		PageUtils.fenye(model, info, "&mname="+mname);
		model.addAttribute("moviea", moviea);
		model.addAttribute("mname", mname);
		return "moviea";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		List<Movies> moviess = service.getMovies();
		model.addAttribute("movis", moviess);
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("add")
	public boolean add(Movie movie,int[] mids) {
		try {
			service.add(movie,mids);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@ResponseBody
	@RequestMapping("del")
	public boolean del(int id) {
		return service.del(id)>0;
	}
}
