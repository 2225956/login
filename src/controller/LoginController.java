package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import vo.User;
import dao.UserDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(urlPatterns="/LoginController.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		String check = request.getParameter("validateCode");
		String sc = (String)request.getSession().getAttribute("checkcode");
		String  ck = request.getParameter("nologin");
//		System.out.println(name+"-------------"+pwd);
		User user = new User();
		user.setUname(name);
		user.setUpwd(pwd);
		UserDao ud = new UserDao();
		boolean flag = ud.queryUser(user);
		System.out.println(flag);
		PrintWriter out = response.getWriter();
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("pwd", pwd);
		if(check.equals(sc))
		{
			if(flag)
			{
				if(ck.equals("yes"))
				{
					Cookie[] cookies = request.getCookies();
					Cookie c1 = new Cookie(name, pwd);
					response.addCookie(c1);
					c1.setMaxAge(60*60*24*7);
					System.out.println("c1:"+c1.getName()+"   "+c1.getValue());
					for(Cookie c:cookies)
					{
						System.out.println("key:"+c.getName()+"=========="+"value:"+c.getValue());
					}
				}
//				request.getRequestDispatcher("/main.jsp").forward(request, response);
				response.sendRedirect("main.jsp");
				request.getSession().setAttribute("currentUser", 1);
				
			}
			else
			{
				out.write("1");
//				request.getRequestDispatcher("/no.jsp").forward(request, response);
//				System.out.println("1");
//				request.getSession().setAttribute("error1", "用户名或密码错误！");
			}
		}
		else
		{
			out.write("2");
//			request.getRequestDispatcher("/no.jsp").forward(request, response);
//			System.out.println("2");
//			request.getSession().setAttribute("error2", "验证码错误！");
		}
	}

}
