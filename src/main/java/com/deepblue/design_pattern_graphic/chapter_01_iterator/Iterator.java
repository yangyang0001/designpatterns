package com.deepblue.design_pattern_graphic.chapter_01_iterator;

public interface Iterator<T> {

    public abstract boolean hasNext();

    public abstract T next();
}
