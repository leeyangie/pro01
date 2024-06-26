package org.ui.ctrl.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ui.dao.NoticeDAO;
import org.ui.dto.Notice;

@WebServlet(name = "EditNotice.do", urlPatterns = { "/EditNotice.do" })
public class EditNoticeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditNoticeCtrl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		int no = Integer.parseInt(request.getParameter("no"));
		
		NoticeDAO dao = new NoticeDAO();
		Notice noti = dao.getNotice2(no);
		
		request.setAttribute("noti", noti);
		RequestDispatcher view = request.getRequestDispatcher("/notice/editNotice.jsp");
		view.forward(request, response);
	}

}
