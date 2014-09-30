package com.aobasushibar.basedata.factory;

import com.aobasushibar.basedata.dao.MenuDao;

public interface MenuDaoFactory {
	/**
	 * create MenuDao product
	 */
	public MenuDao createMenuDao();
}
