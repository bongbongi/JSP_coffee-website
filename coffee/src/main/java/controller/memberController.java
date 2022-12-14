package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.memberVO;
import service.boardService;
import service.boardServiceImpl;
import service.memberService;
import service.memberServiceImpl;


@WebServlet("/mem/*")
public class memberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int isOk;
    private String destPage;
    private memberService msv; //인터페이스
    private Logger Log = LoggerFactory.getLogger(memberController.class);
    private RequestDispatcher rdp;

    public memberController() {
    	msv = new memberServiceImpl();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String uri = request.getRequestURI();
		Log.info("uri >>> "+uri);
		String path = uri.substring(uri.lastIndexOf("/")+1);
		Log.info("path >>> "+path);
		
		switch(path) {
		case "login":
			destPage="/member/login.jsp";
			break;
		case "loginOk":
			try {
				
				Log.info("loginOk check 1");
				memberVO mvo = msv.loginOk(new memberVO(
						request.getParameter("id"),
						request.getParameter("password")));
				Log.info("loginOk check 4");
				if(mvo!=null) {
					HttpSession ses = request.getSession();
					ses.setAttribute("ses", mvo);
					ses.setMaxInactiveInterval(60*10);
				}else {
					request.setAttribute("msg_login", 0);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/index.jsp";
			break;
		case "logout":
			try {
				
				HttpSession ses = request.getSession();
				ses.invalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/index.jsp";
			break;
		case "join":
			destPage="/member/register.jsp";
			break;
		case "insert":
			try {
				Log.info("insert check 1");
				isOk = msv.insert(new memberVO(
						request.getParameter("id"),
						request.getParameter("password"),
						request.getParameter("name"),
						request.getParameter("brith"),
						request.getParameter("gender"),
						request.getParameter("email"),
						request.getParameter("mobile")
						));
				Log.info("insert "+(isOk>0?"OK":"Fail"));
				
			} catch (Exception e) {
				Log.info("insert error");
				e.printStackTrace();
			}
			destPage="/index.jsp";
			break;
		case "detail":
			destPage="/member/detail.jsp";
			break;
		case "modify":
			try {

				isOk = msv.update(new memberVO(
						request.getParameter("id"),
						request.getParameter("password"),
						request.getParameter("name"),
						request.getParameter("brith"),
						request.getParameter("gender"),
						request.getParameter("email"),
						request.getParameter("mobile")
						));
				Log.info("내정보 수정 "+(isOk>0?"Ok":"Fail"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/";
			break;
		case "remove" :
			try {
				isOk = msv.delete(request.getParameter("id"));
				
				Log.info("회원탈퇴 >>> "+(isOk>0?"성공":"실패"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/mem/list";
			break;
		case "list":
			try {
				List<memberVO> list = msv.getList();
				request.setAttribute("list", list);
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/member/list.jsp";
			break;
		}
		rdp = request.getRequestDispatcher(destPage);
		rdp.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
