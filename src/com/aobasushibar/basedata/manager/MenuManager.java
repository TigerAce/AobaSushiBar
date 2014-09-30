package com.aobasushibar.basedata.manager;

import java.sql.Connection;


import com.aobasushibar.basedata.domain.Menu;
import com.aobasushibar.basedata.factory.MenuDaoFactory;
import com.aobasushibar.basedata.factory.MenuDaoPostgresqlFactory;
import com.aobasushibar.utils.DBUtil;
import com.aobasushibar.utils.PageModel;

public class MenuManager {

		private static MenuManager instance = new MenuManager();
		
		private MenuDaoFactory factory;
		
		private MenuManager(){
			//need to config from xml later
			factory = new MenuDaoPostgresqlFactory();
		};
		
		public static MenuManager getInstance() {
			return instance;
		}
		
		public void addMenu(Menu dish){
			Connection conn = null;
			
			//no need to catch
			try{
				conn = DBUtil.getConnection();
				factory.createMenuDao().addMenu(conn, dish);
			}finally{
				DBUtil.close(conn);
			}
		}
		
		public PageModel findAllMenu(String queryString, int pageNo, int pageSize){
			Connection conn = null;
			
			PageModel pageModel = null;
			//no need to catch
			try{
				conn = DBUtil.getConnection();
				pageModel = factory.createMenuDao().findAllMenu(conn, queryString, pageNo, pageSize);
			}finally{
				DBUtil.close(conn);
			}
			
			return pageModel;
			
		}
}
