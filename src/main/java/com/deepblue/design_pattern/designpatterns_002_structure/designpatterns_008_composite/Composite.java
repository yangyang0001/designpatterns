package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_008_composite;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@Data
@ToString
public class Composite extends Component {

    private List<Component> componentList = Lists.newArrayList();

    @Override
    public void draw() {
        System.out.println("Composite draw()");
    }

    @Override
    public void addChild(Component child) {
        this.getComponentList().add(child);
    }

    @Override
    public void removeChild(Component child) {
        this.componentList = this.getComponentList().stream().filter(item -> {return item.getId() != child.getId();}).collect(Collectors.toList());
    }

    @Override
    public Component getChild(Component child) {
        Component component = null;
        try {
            component = this.getComponentList().stream().filter(item -> {
                return item.getId() == child.getId();
            }).findFirst().get();
            return component;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Component> getAllChild() {
        return this.getComponentList();
    }
}
