package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_011_proxy_jdk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProxyHandler implements Subject{

    private Subject subject;



    @Override
    public void request() {
        System.out.println("ProxyHandler request()");
        subject.request();
    }
}
