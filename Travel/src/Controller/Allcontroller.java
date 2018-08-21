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

	// 로그인 처리 메소드
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String memberID = request.getParameter("memberID");
		String memberPassword = request.getParameter("memberPassword");

		// 보안을 고려한 신중한 검증
		if (memberID != null && memberID.length() != 0 && memberPassword != null) {
			try {
				String memberName = memberDAO.loginCheck(memberID, memberPassword);
				if (memberName != null) {// 회원인 경우
					HttpSession session = request.getSession();
					session.setAttribute("memberName", memberName);
					request.setAttribute("msg", "loginsucc");
					request.getRequestDispatcher("realindex.jsp").forward(request, response);
				} else {// 미회원인 경우
					request.setAttribute("msg", "당신은 회원이 아니십니다");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
				request.getRequestDispatcher("error/errorView.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	/*
	 * //로그아웃 처리 메소드 protected void logout(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException { //이미 존재할
	 * 경우 반환 HttpSession session = request.getSession();
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
			//script.println("<script>alert('계정이 등록 되었습니다'); location.href='realindex.jsp';</script>");
			//response.sendRedirect("realindex.jsp");
			//request.setAttribute("successMsg", "계정이 등록 되었습니다");
			request.setAttribute("msg", "joinsucc");
			request.getRequestDispatcher("realindex.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
			request.getRequestDispatcher("error/errorView.jsp").forward(request, response);
		}
	}
}
