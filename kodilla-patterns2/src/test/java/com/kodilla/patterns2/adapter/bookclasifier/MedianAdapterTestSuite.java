package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedianAdapterTestSuite {

    @Autowired private MedianAdapter medianAdapter;

    @Test
    public void publicationYearMedianTest() {
        Set<Book> bookSet = new HashSet<>(Arrays.asList(
                new Book("Author 1", "Title 1", 2000, "Signature 1"),
                new Book("Author 2", "Title 2", 2001, "Signature 2"),
                new Book("Author 3", "Title 3", 2002, "Signature 3"),
                new Book("Author 4", "Title 4", 2003, "Signature 4"),
                new Book("Author 5", "Title 5", 2004, "Signature 5")
        ));

        assertEquals(2002, medianAdapter.publicationYearMedian(bookSet));
    }
}
