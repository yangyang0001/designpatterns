package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_012_proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Subject{

    private Subject subject;

    @Override
    public void request() {
        System.out.println("Proxy request()");
        subject.request();
    }
}
