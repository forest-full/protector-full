package com.forestfull.protector.tag;

import jakarta.servlet.*;

import java.io.IOException;

public class TagFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        chain.doFilter(request, response);
    }
}
