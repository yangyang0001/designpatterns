package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_009_decorator;

public class Client {

    public static void invokeDecorator(VisualComponent component) {
        component.draw();
    }

    public static void main(String[] args) {

        TextView textView = new TextView();
        Decorator borderDecorator = new BorderDecorator();
        Decorator scrollDecorator = new ScrollDecorator();

        borderDecorator.setComponent(scrollDecorator);
        scrollDecorator.setComponent(textView);

        Client.invokeDecorator(borderDecorator);

    }
}
