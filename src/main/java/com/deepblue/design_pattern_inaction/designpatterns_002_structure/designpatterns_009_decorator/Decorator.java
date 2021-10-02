package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_009_decorator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class Decorator implements VisualComponent{
    protected VisualComponent component;
    public abstract void draw();
}
