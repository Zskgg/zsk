package com.zhangshuaikang.week1.utils;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class PageUtils {

	public static void fenye(Model model, PageInfo info,String url) {

		String fenye = "当前是" + info.getPageNum() + "/" + info.getPages() + "页--共" + info.getTotal()
				+ "条数据<a href='list?pageNum=1"+url+"'>首页</a>&nbsp;&nbsp;<a href='list?pageNum=" + info.getPrePage()
				+ ""+url+"'>上一页</a>&nbsp;&nbsp;<a href='list?pageNum=" + info.getNextPage()
				+ ""+url+"'>下一页</a>&nbsp;&nbsp;<a href='list?pageNum=" + info.getPages() + ""+url+"'>尾页</a>";

		model.addAttribute("fenye", fenye);

	}

}
