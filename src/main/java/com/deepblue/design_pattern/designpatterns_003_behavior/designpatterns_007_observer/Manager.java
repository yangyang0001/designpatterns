package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_007_observer;

public interface Manager {

    public void registerSubjectAndObserver(Subject subject, Observer observer);

    public void update(Subject subject, Object update);
}
