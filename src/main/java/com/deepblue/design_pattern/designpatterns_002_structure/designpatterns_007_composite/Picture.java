package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_007_composite;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@Data
@ToString
public class Picture extends Graphic {

    private List<Graphic> childList = Lists.newArrayList();

    @Override
    public void draw() {
        System.out.println("Picture draw()");
    }

    @Override
    public void addChild(Graphic child) {
        this.getChildList().add(child);
    }

    @Override
    public void removeChild(Graphic child) {
        this.childList = this.getChildList().stream().filter(item -> {return item.getId() != child.getId();}).collect(Collectors.toList());
    }

    @Override
    public Graphic getChild(Graphic child) {
        Graphic graphic = null;
        try {
            graphic = this.getChildList().stream().filter(item -> {
                return item.getId() == child.getId();
            }).findFirst().get();
            return graphic;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Graphic> getAllChild() {
        return this.getChildList();
    }
}
