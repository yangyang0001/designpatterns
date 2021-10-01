package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_001_chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dialog {
    private Application application;
    public void request() {
        application.request();
    }
}
