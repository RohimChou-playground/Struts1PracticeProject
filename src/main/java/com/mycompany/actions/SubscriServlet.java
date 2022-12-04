package com.mycompany.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SubscriServlet extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
            HttpServletResponse resp) throws Exception {

        resp.getWriter().print("<h3>Hello World From SubscriServlet Action</h3>");
        resp.setContentType("text/html; charset=utf-8");

        return null;
    }

}