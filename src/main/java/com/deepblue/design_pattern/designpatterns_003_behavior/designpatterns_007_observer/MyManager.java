package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_007_observer;

public class MyManager implements Manager{

    @Override
    public void registerSubjectAndObserver(Subject subject, Observer observer) {
        subject.registerObserver(observer);
    }

    @Override
    public void update(Subject subject, Object update) {
        subject.update(update);
    }
}
