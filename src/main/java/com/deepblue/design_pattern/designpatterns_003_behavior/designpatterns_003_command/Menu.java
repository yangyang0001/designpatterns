package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_003_command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {

    private MenuItem menuItem;

    public void execute() {
        menuItem.execute();
    }

}
