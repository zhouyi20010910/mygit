package com.my.it.service;

import java.util.List;

public interface DetailService {
		public List<Detail> findAll();
		public List<Detail> findList(long sortid,int pageIndex,int row,String orderby);
		public Detail findOne(long id);
		public void add(Detail o);
		public int edit(Detail o);
		public int remove(Long id);
		public int findCount(Long sortid);
}
