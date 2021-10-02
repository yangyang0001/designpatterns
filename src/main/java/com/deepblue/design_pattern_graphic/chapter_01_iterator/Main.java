package com.deepblue.design_pattern_graphic.chapter_01_iterator;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = Lists.newArrayList();
        books.add(new Book("C++实战"));
        books.add(new Book("HotSpot实战"));
        books.add(new Book("加密解密的艺术"));
        books.add(new Book("深入理解Java虚拟机"));

        BookShelf bookShelf = new BookShelf(books);
        Iterator<Book> iterator = bookShelf.iterator();

        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(JSON.toJSONString(book));
        }
    }

}
