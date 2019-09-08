/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieServiceImpl.java 
 * @Prject: zhangshuaikang-week1
 * @Package: com.zhangshuaikang.week1.service.impl 
 * @Description: TODO
 * @author: 男神康   
 * @date: 2019年9月3日 上午9:01:50 
 * @version: V1.0   
 */
package com.zhangshuaikang.week1.service.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangshuaikang.week1.dao.MovieMapper;
import com.zhangshuaikang.week1.domain.Movie;
import com.zhangshuaikang.week1.domain.Movies;
import com.zhangshuaikang.week1.service.MovieService;

/** 
 * @ClassName: MovieServiceImpl 
 * @Description: TODO
 * @author: 男神康
 * @date: 2019年9月3日 上午9:01:50  
 */
@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieMapper mapper;

	/* (non Javadoc) 
	 * @Title: select
	 * @Description: TODO
	 * @return 
	 * @see com.zhangshuaikang.week1.service.MovieService#select() 
	 */
	@Override
	public List<Movie> selects(String mname) {
		// TODO Auto-generated method stub
		return mapper.selects(mname);
	}

	/* (non Javadoc) 
	 * @Title: getMovies
	 * @Description: TODO
	 * @return 
	 * @see com.zhangshuaikang.week1.service.MovieService#getMovies() 
	 */
	@Override
	public List<Movies> getMovies() {
		// TODO Auto-generated method stub
		return mapper.getMovies();
	}

	/* (non Javadoc) 
	 * @Title: add
	 * @Description: TODO
	 * @param movie 
	 * @see com.zhangshuaikang.week1.service.MovieService#add(com.zhangshuaikang.week1.domain.Movie) 
	 */
	@Override
	public void add(Movie movie, int[] mids) {
		// TODO Auto-generated method stub
		mapper.add(movie);
		for (int i : mids) {
			mapper.addms(movie.getMid(),i);
		}
	}

	/* (non Javadoc) 
	 * @Title: del
	 * @Description: TODO
	 * @param id
	 * @return 
	 * @see com.zhangshuaikang.week1.service.MovieService#del(int) 
	 */
	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return mapper.del(id);
	}
	
}
