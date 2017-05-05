package pl.generatorgrafiku.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePageFilter implements Filter {
		
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpResp = (HttpServletResponse) response;
		String pageRequested = httpReq.getRequestURI().toString();
		if(httpReq.getUserPrincipal() != null && httpReq.getSession().getAttribute("user") != null && pageRequested.contains("index.jsp")) {
			if(httpReq.isUserInRole("admin") == true) {
				httpResp.sendRedirect("adminpage.jsp");
			} else if(httpReq.isUserInRole("user") == true){
				httpResp.sendRedirect("userpage.jsp");
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
