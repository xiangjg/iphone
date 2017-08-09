package com.jone.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 向敬光 on 2017-05-11.
 */
public class CORSFilter implements Filter {
    //@Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    //@Override
    public void destroy() {

    }
}
