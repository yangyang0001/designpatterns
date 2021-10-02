package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_008_observer;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class ConcreteSubjectA implements Subject{

    private String name;

    private List<Observer> observerList = Lists.newArrayList();


    @Override
    public void notifyAllObservers() {
        for (Observer o : observerList) {
            o.update(this.getName());
        }
    }

    @Override
    public void update(String name) {
        this.name = name;
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.getObserverList().add(observer);
    }

}
