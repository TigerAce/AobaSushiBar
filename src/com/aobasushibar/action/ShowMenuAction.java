package com.aobasushibar.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.aobasushibar.basedata.manager.MenuManager;
import com.aobasushibar.utils.PageModel;

public class ShowMenuAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		PageModel pageModel = MenuManager.getInstance().findAllMenu(null, 1, 10);
		request.setAttribute("pageModel",pageModel);
		return mapping.findForward("list");
	}

}
