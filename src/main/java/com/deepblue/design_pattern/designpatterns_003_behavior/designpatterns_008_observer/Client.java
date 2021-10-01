package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_008_observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubjectA();
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();
        System.out.println("observerA.receiver: " + observerA.getReceiver());
        System.out.println("observerB.receiver: " + observerB.getReceiver());

        System.out.println("----------------------------------------------");

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.update("deepblue");

        System.out.println("observerA.receiver: " + observerA.getReceiver());
        System.out.println("observerB.receiver: " + observerB.getReceiver());

    }


}
