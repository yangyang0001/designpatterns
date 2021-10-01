package com.deepblue.design_pattern.designpatterns_002_structure.designpatterns_005_bridge;

public class Client {

    public static void callMethod(Window window) {
        window.drawText();
        window.drawRect();
    }

    public static void callNewMethod(WindowImplementor implementor) {
        implementor.drawText();
        implementor.drawRect();
        implementor.devDrawText();
        implementor.devDrawLine();
    }

    public static void main(String[] args) {
        IconWindow window = new IconWindow();
        XWindowImplementor implementor = new XWindowImplementor();
        Client.callMethod(window);
        Client.callNewMethod(implementor);

    }
}
