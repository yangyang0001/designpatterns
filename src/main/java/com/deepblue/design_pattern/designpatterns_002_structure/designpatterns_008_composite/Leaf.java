package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_008_composite;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Leaf extends Component {

    @Override
    public void draw() {
        System.out.println("Leaf draw()");
    }

    @Override
    public void addChild(Component child) {

    }

    @Override
    public void removeChild(Component child) {

    }

    @Override
    public Component getChild(Component child) {
        return null;
    }

    @Override
    public List<Component> getAllChild() {
        return null;
    }
}
