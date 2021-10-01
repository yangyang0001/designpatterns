package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_001_chain_of_responsibility;

public class Client {

    public static void main(String[] args) {
        Application application = new Application();
        Dialog dialog = new Dialog(application);
        Button button = new Button(dialog);
        button.request();
    }
}
