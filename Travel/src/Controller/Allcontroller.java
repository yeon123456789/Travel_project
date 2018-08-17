package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.memberDAO;

@WebServlet("/Cont")
public class Allcontroller extends HttpServlet {

	public Allcontroller() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String command = request.getParameter("command");
		
		if (command.equals("login")) {
			login(request, response);
		} else if (command.equals("logout")) {
			/* logout(request, response); */
		} else if (command.equals("join")) {
			System.out.println("join");
			join(request, response);
		} else {
		}
	}

	// �α��� ó�� �޼ҵ�
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String memberID = request.getParameter("memberID");
		String memberPassword = request.getParameter("memberPassword");

		// ������ ����� ������ ����
		if (memberID != null && memberID.length() != 0 && memberPassword != null) {
			try {
				String memberName = memberDAO.loginCheck(memberID, memberPassword);
				if (memberName != null) {// ȸ���� ���
					HttpSession session = request.getSession();
					session.setAttribute("memberName", memberName);
					request.setAttribute("msg", "loginsucc");
					request.getRequestDispatcher("realindex.jsp").forward(request, response);
				} else {// ��ȸ���� ���
					request.setAttribute("msg", "����� ȸ���� �ƴϽʴϴ�");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("errorMsg", "�˼��մϴ�. ����Ŀ� �� ������ �ּ���");
				request.getRequestDispatcher("error/errorView.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	/*
	 * //�α׾ƿ� ó�� �޼ҵ� protected void logout(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException { //�̹� ������
	 * ��� ��ȯ HttpSession session = request.getSession();
	 * 
	 * session.invalidate(); session = null; response.sendRedirect("realindex.jsp");
	 * }
	 */

	protected void join(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String memberID = request.getParameter("memberID");
		String memberPassword = request.getParameter("memberPassword");
		String memberName = request.getParameter("memberName");
		String memberCountry = request.getParameter("memberCountry");
		String memberEmail = request.getParameter("memberEmail");
		String memberGender = request.getParameter("memberGender");

		try {
			int result = memberDAO.join(memberID, memberPassword, memberName, memberCountry, memberEmail, memberGender);
			//script.println("<script>alert('������ ��� �Ǿ����ϴ�'); location.href='realindex.jsp';</script>");
			//response.sendRedirect("realindex.jsp");
			//request.setAttribute("successMsg", "������ ��� �Ǿ����ϴ�");
			request.setAttribute("msg", "joinsucc");
			request.getRequestDispatcher("realindex.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "�˼��մϴ�. ����Ŀ� �� ������ �ּ���");
			request.getRequestDispatcher("error/errorView.jsp").forward(request, response);
		}
	}
}
