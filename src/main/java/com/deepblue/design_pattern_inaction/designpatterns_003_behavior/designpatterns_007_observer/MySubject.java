package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_007_observer;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class MySubject implements Subject {

    private String name;

    private List<Observer> observerList = Lists.newArrayList();

    @Override
    public void registerObserver(Observer observer) {
        this.getObserverList().add(observer);
    }

    @Override
    public void update(Object message) {
        this.name = message.toString();
        notifyObservers();
    }


    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update(this.getName());
        }
    }
}
