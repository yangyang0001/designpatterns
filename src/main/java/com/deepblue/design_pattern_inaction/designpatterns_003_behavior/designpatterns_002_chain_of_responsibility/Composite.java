package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_002_chain_of_responsibility;

public abstract class Composite implements Component{

    public Component component;

    @Override
    public abstract void request();
}
