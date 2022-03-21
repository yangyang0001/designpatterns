package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_012_proxy_cglib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

@Data
public class SubjectInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(target, params);
    }
}
