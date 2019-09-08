/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieService.java 
 * @Prject: zhangshuaikang-week1
 * @Package: com.zhangshuaikang.week1.service 
 * @Description: TODO
 * @author: 男神康   
 * @date: 2019年9月3日 上午9:01:31 
 * @version: V1.0   
 */
package com.zhangshuaikang.week1.service;

import java.util.List;

import com.zhangshuaikang.week1.domain.Movie;
import com.zhangshuaikang.week1.domain.Movies;

/** 
 * @ClassName: MovieService 
 * @Description: TODO
 * @author: 男神康
 * @date: 2019年9月3日 上午9:01:31  
 */
public interface MovieService {

	/** 
	 * @param mname 
	 * @Title: select 
	 * @Description: TODO
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> selects(String mname);

	/** 
	 * @Title: getMovies 
	 * @Description: TODO
	 * @return
	 * @return: List<Movies>
	 */
	List<Movies> getMovies();

	/** 
	 * @Title: add 
	 * @Description: TODO
	 * @param movie
	 * @param mids 
	 * @return: void
	 */
	void add(Movie movie, int[] mids);

	/** 
	 * @Title: del 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int del(int id);

}
