package com.example.forstudyingspringmavenetc.common.filter;

import jakarta.servlet.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SampleFilter implements Filter {
    private final Log log =LogFactory.getLog(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("init!!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        log.info("[SampleFilter]:start:"+ System.currentTimeMillis());
        chain.doFilter(request, response);
        log.info("[SampleFilter]:end:"+ System.currentTimeMillis());
    }

    @Override
    public void destroy() {
        System.out.println("destroy!!");
    }
}
