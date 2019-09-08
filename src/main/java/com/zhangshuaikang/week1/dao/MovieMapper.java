/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieMapper.java 
 * @Prject: zhangshuaikang-week1
 * @Package: com.zhangshuaikang.week1.dao 
 * @Description: TODO
 * @author: 男神康   
 * @date: 2019年9月3日 上午9:02:22 
 * @version: V1.0   
 */
package com.zhangshuaikang.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangshuaikang.week1.domain.Movie;
import com.zhangshuaikang.week1.domain.Movies;

/** 
 * @ClassName: MovieMapper 
 * @Description: TODO
 * @author: 男神康
 * @date: 2019年9月3日 上午9:02:22  
 */
public interface MovieMapper {

	/** 
	 * @param mname 
	 * @Title: selects 
	 * @Description: TODO
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> selects(@Param("mname")String mname);

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
	 * @return: void
	 */
	void add(Movie movie);

	/** 
	 * @Title: addms 
	 * @Description: TODO
	 * @param mid
	 * @param i
	 * @return: void
	 */
	void addms(@Param("mid")int mid, @Param("sid")int i);

	/** 
	 * @Title: del 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: int
	 */
	int del(int id);

}
