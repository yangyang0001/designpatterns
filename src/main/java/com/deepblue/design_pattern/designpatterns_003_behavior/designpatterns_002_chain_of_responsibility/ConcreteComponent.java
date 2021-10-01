package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_002_chain_of_responsibility;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConcreteComponent implements Component{

    @Override
    public void request() {
        System.out.println("ConcreteComponent request()");
    }
}
