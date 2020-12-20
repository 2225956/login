package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutoLoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		Cookie[] cookies = req.getCookies();
		if(cookies != null){
			for(Cookie c :cookies)
			{
				if(c.getName().equals(req.getSession().getAttribute("name")))
				{
					if(c.getValue().equals(req.getSession().getAttribute("pwd")))
					{
						resp.sendRedirect("main.jsp");
	//					req.getRequestDispatcher("/mian.jsp").forward(req, response);
	//					System.out.println("name:"+c.getName()+"+++++++++value:"+c.getValue());
					}
					else
					{	
						chain.doFilter(req, response);
					}	
				}
				else
				{
					chain.doFilter(req, response);
				}
			}
		}
		chain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
