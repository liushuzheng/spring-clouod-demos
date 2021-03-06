//package com.liushuz.springclouddemos.servicezuul.filter;
//
//import com.netflix.zuul.ZuulFilter;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LoggerFilter extends ZuulFilter {
//
//    @Autowired
//    private Tracer tracer;
//
//    @Override
//    public String filterType() {
//        return FilterConstants.POST_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return 900;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        tracer.addTag("operator","forezp");
//        System.out.println(tracer.getCurrentSpan().traceIdString());
//        return null;
//    }
//}
