package com.aobasushibar.basedata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;






import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aobasushibar.basedata.domain.Menu;
import com.aobasushibar.utils.DBUtil;
import com.aobasushibar.utils.PageModel;

public class MenuDaoPostgresqlImpl implements MenuDao{

	@Override
	public void addMenu(Connection conn, Menu dish) {
		//add to menu sql
		String sql = "insert into menu(name, description, price) values(?,?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dish.getName());
			pstmt.setString(2, dish.getDescription());
			pstmt.setFloat(3, dish.getPrice());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("add to menu failed -- MenuDaoPostgresqlImpl");
			
		}finally{
			DBUtil.close(pstmt);
		}
		
	}

	@Override
	public PageModel findAllMenu(Connection conn, String queryString,
			int pageNo, int pageSize) {

	
		String sql = "select id, name, description, price from menu limit ? offset ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PageModel pageModel = null;
		
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pageSize);
			pstmt.setInt(2, (pageNo - 1) * pageSize);
			rs = pstmt.executeQuery();
			List menuList = new ArrayList();
			while (rs.next()) {
				Menu menu = new Menu();
				
				menu.setID(rs.getInt("id"));
				menu.setName(rs.getString("name"));
				menu.setDescription(rs.getString("description"));
				menu.setPrice(rs.getFloat("price"));
				
				
				menuList.add(menu);
			}
			pageModel = new PageModel();
			pageModel.setPageNo(pageNo);
			pageModel.setPageSize(pageSize);
			pageModel.setList(menuList);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
		return pageModel;
	}

}
