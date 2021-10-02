package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_008_composite;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public abstract class Component {
    public long id;
    public abstract void draw();
    public abstract void addChild(Component child);
    public abstract void removeChild(Component child);
    public abstract Component getChild(Component child);
    public abstract List<Component> getAllChild();
}
