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

import domain.boardVO;
import domain.memberVO;
import domain.pagingHandler;
import domain.pagingVO;
import service.boardService;
import service.boardServiceImpl;

    
@WebServlet("/brd/*")
public class boardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Logger Log = LoggerFactory.getLogger("boardController.class");  
    private String destPage;
    private int isOk;
    private boardService bsv;
    private RequestDispatcher rdp;
  
    public boardController() {
    	bsv = new boardServiceImpl();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")+1);
		Log.info("uri >>> "+uri);
		Log.info("path >>> "+path);
		
		switch(path) {
		case "list":
			/* HttpSession ses = request.getSession(); */
			List<boardVO> list =  bsv.getList(); ;
			request.setAttribute("list", list);
			destPage="/brd/pagelist";
			break;
		case "register":
			destPage="/board/register.jsp";
			break;
		case "insert":
			try {
				isOk = bsv.insert(new boardVO(
						/* Integer.parseInt(request.getParameter("bno")), */
							request.getParameter("title"),
							request.getParameter("writer"),
							request.getParameter("content"),
							request.getParameter("image_file")));
				Log.info("글작성 >>> "+(isOk>0?"성공":"실패"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/brd/pagelist";
			break;
		case "detail":
			try {
				//클릭하면 해당하는 bno의 read_count 올리기
				isOk = bsv.read_countUp(Integer.parseInt(request.getParameter("bno")));
				
				boardVO bvo = bsv.getDetail(Integer.parseInt(request.getParameter("bno")));
				request.setAttribute("bvo", bvo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			destPage="/board/detail.jsp";
			break;
		case "modify":
			boardVO bvo = bsv.getDetail(Integer.parseInt(request.getParameter("bno")));
			request.setAttribute("bvo", bvo);
			destPage="/board/modify.jsp";
			break;
		case "update":
			try {
				isOk = bsv.update(new boardVO(
						Integer.parseInt(request.getParameter("bno")),
						request.getParameter("title"),
						request.getParameter("content"),
						request.getParameter("image_file")
						));
				Log.info("내정보 수정 "+(isOk>0?"Ok":"Fail"));
				destPage="/brd/pagelist";
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "remove":
			isOk = bsv.deleteOne(Integer.parseInt(request.getParameter("bno")));
			destPage="/brd/pagelist";
			break;
		case "pagelist":
			try {
				pagingVO pvo = new pagingVO();
				int totalPage = bsv.getPageCnt(); 
				System.out.println("totalPage : " + totalPage);
				List<boardVO> list2 = bsv.getListPage(pvo); 
				pagingHandler ph = new pagingHandler(pvo, totalPage);
				request.setAttribute("list", list2); 
				request.setAttribute("pgh", ph); 
				
				String writer = request.getParameter("writer");
				if(writer.equals("관리자")) {
					destPage = "/board/list_admin.jsp";	
				}else {
					destPage = "/board/list.jsp";	
				}
			} catch (Exception e) {
				Log.info("paging error");
				e.printStackTrace();
			}
			break;
		case "page":
			try {
				int pageNo = Integer.parseInt(request.getParameter("pageNo"));
				int qty = Integer.parseInt(request.getParameter("qty"));
				System.out.println(pageNo);
				
				pagingVO pvo = new pagingVO(pageNo, qty);
				
				Log.info("페이징네이션 1");
				int totalPage = bsv.getPageCnt();
				List<boardVO> list2 = bsv.getListPage(pvo); 
				Log.info("페이징네이션 2");
				pagingHandler ph = new pagingHandler(pvo, totalPage);
				request.setAttribute("list", list2); 
				request.setAttribute("pgh", ph); 
				
				String writer = request.getParameter("writer");
				
				if(writer.equals("관리자")) {
					destPage = "/board/list_admin.jsp";	
				}else {
					destPage = "/board/list.jsp";	
				}
			} catch (Exception e) {
				Log.info("페이징네이션 error");
				e.printStackTrace();
			}
			break;
		case "hide":
			try {
				//관리자외에는 해당 글만 안보이게 리스트 출력
				int bno = Integer.parseInt(request.getParameter("bno"));
				List<boardVO> list2 = bsv.getHide(bno);
				
				request.setAttribute("list", list2);
				destPage="/board/list.jsp";
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		rdp = request.getRequestDispatcher(destPage);
		rdp.forward(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
