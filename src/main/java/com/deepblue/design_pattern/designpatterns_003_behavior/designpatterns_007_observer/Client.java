package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_007_observer;

public class Client {

    public static void main(String[] args) {

        Manager manager = new MyManager();

        MySubject subject = new MySubject();
        Observer observerM = new MyObserver();
        Observer observerY = new YoObserver();

        manager.registerSubjectAndObserver(subject, observerM);
        manager.registerSubjectAndObserver(subject, observerY);

        subject.getObserverList().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------");

        manager.update(subject, "YangMarshall");

        subject.getObserverList().stream().forEach(System.out::println);

    }
}
