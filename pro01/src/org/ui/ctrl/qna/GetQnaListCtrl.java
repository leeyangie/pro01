package org.ui.ctrl.qna;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ui.dao.QnaDAO;
import org.ui.dto.Qna;


@WebServlet("/GetQnaList.do")
public class GetQnaListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public GetQnaListCtrl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaDAO dao = new QnaDAO();	//DAO 객체생성
		List<Qna> qList = dao.getQnaList();	//dao객체 리스트
		request.setAttribute("qnaList", qList);	//리스트 정보 파라미터로 넘김 jsp파일로
		
		RequestDispatcher view = request.getRequestDispatcher("/qna/qnaList.jsp");
		view.forward(request, response); //jsp 파일 호출, 결과값을 넘겨줌
	}

}
