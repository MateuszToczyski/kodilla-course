package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class LibraryTestSuite {

    @Test
    public void testShallowCopy() throws CloneNotSupportedException {

        Book book1 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));
        Book book3 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));

        Library library1 = new Library("Library 1");
        library1.getBooks().addAll(Arrays.asList(book1, book2,  book3));

        Library library2 = library1.shallowCopy();

        library1.getBooks().remove(book3);

        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, library2.getBooks().size());
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException {

        Book book1 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));
        Book book3 = new Book("Book One", "Author One", LocalDate.of(2000, 1, 1));

        Library library1 = new Library("Library 1");
        library1.getBooks().addAll(Arrays.asList(book1, book2,  book3));

        Library library2 = library1.deepCopy();

        library1.getBooks().remove(book3);

        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(3, library2.getBooks().size());
    }
}