package com.aobasushibar.basedata.dao;

import java.sql.Connection;

import com.aobasushibar.basedata.domain.Menu;
import com.aobasushibar.utils.PageModel;

public interface MenuDao {
	public void addMenu(Connection conn, Menu dish);
	public PageModel findAllMenu(Connection conn, String queryString, int pageNo, int pageSize);
	
}
