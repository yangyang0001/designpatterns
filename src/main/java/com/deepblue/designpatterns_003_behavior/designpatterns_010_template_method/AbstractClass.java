package com.deepblue.designpatterns_003_behavior.designpatterns_010_template_method;

public abstract class AbstractClass {

    private String username;
    private String password;

    public void before() {
        System.out.println("AbstractClass before()");
    }

    public void after() {
        System.out.println("AbstractClass after()");
    }

    public abstract void doMethod();


    public void executeTemplateMethod() {
        before();
        doMethod();
        after();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
