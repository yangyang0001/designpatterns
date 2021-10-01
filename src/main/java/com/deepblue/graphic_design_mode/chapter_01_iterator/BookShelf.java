package com.deepblue.graphic_design_mode.chapter_01_iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookShelf implements Aggregate {

    private List<Book> books;

    @Override
    public Iterator iterator() {
        return null;
    }
}
