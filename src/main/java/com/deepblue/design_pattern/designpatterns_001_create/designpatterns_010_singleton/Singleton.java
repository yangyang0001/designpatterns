package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_010_singleton;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Singleton {

    private long singletonId;

    private Singleton() {}

    private Singleton(long singletonId) {
        this.singletonId = singletonId;
    }

    public static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton(100L);
        public static Singleton getInstance() {
            return INSTANCE;
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.getInstance();
    }
}
