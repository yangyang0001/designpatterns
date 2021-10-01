package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_008_observer;

public interface Subject {

    public void notifyAllObservers();

    public void update(String name);

    public void registerObserver(Observer observer);
}
