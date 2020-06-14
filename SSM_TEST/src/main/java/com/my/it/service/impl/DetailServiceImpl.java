package com.my.it.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.it.dao.DetailDao;
import com.my.it.service.Detail;
import com.my.it.service.DetailService;

@Service("detailservice")
public class DetailServiceImpl implements DetailService {

	@Autowired
	private DetailDao dao=null;

	@Override
	public List<Detail> findAll() {
		return dao.selectAll();
	}

	@Override
	public List<Detail> findList(long sortid, int pageIndex, int row, String orderby) {
		return dao.selectList(sortid, (pageIndex-1)*row, row, orderby)
	}

	@Override
	public Detail findOne(long id) {
		return dao.selectOne(id);
	}

	@Override
	public void add(Detail o) {
		 dao.insert(o);
	}

	@Override
	public int edit(Detail o) {
	   return  dao.update(o);
	}
	@Override
	public int remove(Long id) {
	    return dao.delete(id);
	}

	@Override
	public int findCount(Long sortid) {
		return dao.selectCount(sortid);
	}
}
