package com.forestfull.protector.script;

import jakarta.servlet.*;

import java.io.IOException;

public class ScriptFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {



        chain.doFilter(request, response);
    }
}
