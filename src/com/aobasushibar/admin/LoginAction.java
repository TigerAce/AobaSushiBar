package com.aobasushibar.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * get form data
 * processing request
 * post response and redirect
 *
 */
public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//get login action form
		LoginActionForm laf = (LoginActionForm)form;
		
		//get username and password from action form
		String username = laf.getUsername();
		String password = laf.getPassword();
	
		//connect database
		/*Class.forName("org.postgresql.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection(
		   "jdbc:postgresql://aobadb.ci841sb1zcxx.ap-southeast-2.rds.amazonaws.com:5432/aobadb","aobadbadmin", "aobadbadmin");
		System.out.println(connection);
		connection.close();*/
		
		//verify username and password
		if("admin".equals(username) && "password".equals(password)){
			//login success and redirect
			
			return mapping.findForward("success");
		}else{
			//login failed and redirect
			return mapping.findForward("error");
		}
		
		//return super.execute(mapping, form, request, response);
	}

}
