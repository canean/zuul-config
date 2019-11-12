package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class MyFilter extends ZuulFilter {

    //表示将在路由阶段执行
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }
    //返回1，路由阶段，该过滤将会最先执行
    @Override
    public int filterOrder() {
        return 2 ;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("========我是第333个被执行的过滤器========");
        return null;
    }
}
