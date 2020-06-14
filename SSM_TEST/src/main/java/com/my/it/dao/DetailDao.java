package com.my.it.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DetailDao {
	public List<Detail> selectAll();
	public Detail selectOne(long id);
	public List<Detail> selectList(@Param("sortid")Long sortid
			,@Param("begin")int begin,@Param("row")int row
			,@Param("orderby")String orderby);
	public void insert(Detail d);
	public int update(Detail d);
	public int delete(long id);
	public int selectCount(Long sortid);
}
