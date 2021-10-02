package com.deepblue.design_pattern_graphic.chapter_01_iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.util.CollectionUtils;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;

    private Integer index;

    @Override
    public boolean hasNext() {
        if(CollectionUtils.isEmpty(bookShelf.getBooks())) {
            return false;
        } else if(index < bookShelf.getBooks().size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if(index < bookShelf.getBooks().size()) {
            Book book = bookShelf.getBooks().get(index);
            index ++;
            return book;
        }
        return null;
    }
}
