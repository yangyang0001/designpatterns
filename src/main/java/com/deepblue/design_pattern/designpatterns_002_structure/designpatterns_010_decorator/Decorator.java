package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_010_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class Decorator implements Component{

    protected Component component;

    @Override
    public abstract void draw();
}
