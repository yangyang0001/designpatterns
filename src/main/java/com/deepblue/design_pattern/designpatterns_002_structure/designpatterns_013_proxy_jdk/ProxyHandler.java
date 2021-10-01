package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_013_proxy_jdk;

import com.alibaba.fastjson.JSON;
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
        System.out.println("ProxyHandler proxy  :" + JSON.toJSON(proxy));
        System.out.println("ProxyHandler method :" + method.getName());
        System.out.println("ProxyHandler args   :" + JSON.toJSONString(args));
        System.out.println("ProxyHandler invoke before");
        Object result = method.invoke(subject, args);
        System.out.println("ProxyHandler invoke after");
        return result;
    }
}
