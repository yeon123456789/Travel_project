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
		/* ���� ����
		 * 		- ������ �ִ�
		 * 			��û ��ü�� ������ �����ؼ� ajax/res.jsp�� �̵�
		 * 		- ������ ����
		 * 			msg.jsp�� ��û �����Ͱ� �����ϴ�.
		 * ������ ����
		 * 		- error.jsp
		 * 			�˼��մϴ�. ����Ŀ� �ٽ� ��û�� �ּ���
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
				request.setAttribute("message", "��û�� �����ʹ� �����ϴ�");
				url = "msg.jsp";
			}
		} catch (SQLException e) {
			e.printStackTrace();//���� �߻� �����丮�� �����ڰ� �ܼ�â���� Ȯ��
			request.setAttribute("errorMsg", "�˼��մϴ�, �� ��û���ּ���");
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	
	
	
	}

}
