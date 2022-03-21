package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

import lombok.Data;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CommonInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(target, params);
    }
}
