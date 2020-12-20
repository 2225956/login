package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QuitLogin
 */
@WebServlet(urlPatterns="/QuitLogin.do")
public class QuitLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuitLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    HttpSession sessions = request.getSession(false);//∑¿÷π¥¥Ω®Session  
        if(sessions == null){  
        	request.getRequestDispatcher("index.jsp").forward(request, response);  
            return;  
        }  

        HttpSession session = request.getSession();
        session.invalidate();
        
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies)
        {
        	cookie.setMaxAge(0);
        	response.addCookie(cookie);
        }
//        request.getRequestDispatcher("index.jsp").forward(request, response);
		response.sendRedirect("index.jsp");;
        response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
