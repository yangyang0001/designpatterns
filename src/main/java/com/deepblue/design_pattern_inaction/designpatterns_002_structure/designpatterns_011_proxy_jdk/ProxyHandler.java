package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_011_proxy_jdk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProxyHandler implements InvocationHandler {

    private Subject subject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy handler invoke before!");
        Object result = method.invoke(subject, args);
        System.out.println("proxy handler invoke  after!");
        return result;
    }
}
