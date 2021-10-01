package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_005_strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TextContext {

    private Strategy strategy;

    public void lineBreak() {
        strategy.lineBreak();
    }
}
