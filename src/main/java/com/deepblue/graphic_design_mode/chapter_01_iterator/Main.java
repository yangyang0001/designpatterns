package com.deepblue.graphic_design_mode.chapter_01_iterator;

import com.google.common.collect.Lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book0 = new Book("C++实战");
        Book book1 = new Book("HotSpot实战");
        Book book2 = new Book("加密解密的艺术");
        Book book3 = new Book("深入理解Java虚拟机");

        List<Book> books = Lists.newArrayList();
        books.add(book0);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Aggregate aggregate = new BookShelf();

    }






}
