package com.deepblue.design_pattern_graphic.chapter_01_iterator;

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
        return new BookShelfIterator(this, 0);
    }
}
