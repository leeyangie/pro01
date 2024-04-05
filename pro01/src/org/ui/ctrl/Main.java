package org.ui.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ui.dto.Notice;
import org.ui.dto.Qna;

/**
 * Servlet implementation class Main
 */
@WebServlet("/pro01")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Main() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String author = "이연정";
		ServletContext application = request.getServletContext();
		String realPath = request.getSession().getServletContext().getRealPath("/");
		
		application.setAttribute("realPath", realPath);
		

		//List<Notice> latestNoticeList = new ArrayList<>();
		//List<Qna> latestQnaList = new ArrayList<>();
		
//		request.setAttribute("latestNoticeList", latestNoticeList);
//		request.setAttribute("latestQnaList", latestQnaList);
		request.setAttribute("author", author);
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}



}
