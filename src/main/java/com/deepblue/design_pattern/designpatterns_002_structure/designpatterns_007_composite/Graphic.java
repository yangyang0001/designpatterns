package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_007_composite;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public abstract class Graphic {
    public long id;
    public abstract void draw();
    public abstract void addChild(Graphic child);
    public abstract void removeChild(Graphic child);
    public abstract Graphic getChild(Graphic child);
    public abstract List<Graphic> getAllChild();
}
