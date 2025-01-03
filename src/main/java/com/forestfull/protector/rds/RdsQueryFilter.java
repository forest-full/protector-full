package com.forestfull.protector.rds;

import jakarta.servlet.*;

import java.io.IOException;

public class RdsQueryFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        chain.doFilter(request, response);
    }
}
