package com.deepblue.designpatterns_003_behavior.designpatterns_003_command;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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
