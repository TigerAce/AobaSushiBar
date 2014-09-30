package com.aobasushibar.basedata.factory;

import com.aobasushibar.basedata.dao.MenuDao;
import com.aobasushibar.basedata.dao.MenuDaoPostgresqlImpl;

public class MenuDaoPostgresqlFactory implements MenuDaoFactory{

	@Override
	public MenuDao createMenuDao() {
	
		return new MenuDaoPostgresqlImpl();
	}

}
