package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_003_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Application {

    /**
     * Menu
     */
    private Menu menu;


    public void execute() {
        menu.execute();
    }

}
