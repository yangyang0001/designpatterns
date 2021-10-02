package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_001_chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Button {
    private Dialog dialog;
    public void request() {
        dialog.request();
    }
}
