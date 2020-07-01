package com.deepblue.designpatterns_003_behavior.designpatterns_007_observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void update(Object message);

    public void notifyObservers();

}
