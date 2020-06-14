package com.my.it.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SortDao {
	public List<Sort> selectAll();
}
