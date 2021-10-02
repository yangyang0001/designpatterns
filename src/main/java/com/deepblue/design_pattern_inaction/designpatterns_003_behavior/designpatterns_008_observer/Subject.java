package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_008_observer;

public interface Subject {

    public void notifyAllObservers();

    public void update(String name);

    public void registerObserver(Observer observer);
}
