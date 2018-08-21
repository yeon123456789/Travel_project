package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.mapDAO;
import Model.map;


/**
 * Servlet implementation class mapController
 */
@WebServlet("*.do")
public class mapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public mapController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 정상 실행
		 * 		- 데이터 있다
		 * 			요청 객체에 데이터 저장해서 ajax/res.jsp로 이동
		 * 		- 데이터 없다
		 * 			msg.jsp로 요청 데이터가 없습니다.
		 * 비정상 실행
		 * 		- error.jsp
		 * 			죄송합니다. 잠시후에 다시 요청해 주세요
		 */
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());
		
		
		String url = "error.jsp";
		ArrayList<map> data = null;
		try {
			
			if(command.equals("/popularAll.do")) {
				data = mapDAO.getAllpopular();
			}else if(command.equals("/historyAll.do")) {
				data = mapDAO.getAllhistory();
			}else if(command.equals("/cultureAll.do")) {
				data = mapDAO.getAllculture();
			}else if(command.equals("/dietoeatAll.do")) {
				data = mapDAO.getAlldietoeat();
			}else if(command.equals("/leisureAll.do")) {
				data = mapDAO.getAllleisure();
			}else if(command.equals("/springfallAll.do")) {
				data = mapDAO.getAllspringfall();
			}else if(command.equals("/summerAll.do")) {
				data = mapDAO.getAllsummer();
			}else if(command.equals("/winterAll.do")) {
				data = mapDAO.getAllwinter();
			}else {}
			
			if(data.size() != 0) {
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=utf-8");
				request.setAttribute("datas", data);
				url = "jsonRes.jsp";
			}else {
				request.setAttribute("message", "요청한 데이터는 없습니다");
				url = "msg.jsp";
			}
		} catch (SQLException e) {
			e.printStackTrace();//예외 발생 히스토리를 관리자가 콘솔창에서 확인
			request.setAttribute("errorMsg", "죄송합니다, 재 요청해주세요");
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	
	
	
	}

}
