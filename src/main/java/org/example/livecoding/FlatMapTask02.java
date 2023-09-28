package org.example.livecoding;

import java.util.Arrays;
import java.util.List;

public class FlatMapTask02 {


    // Вернуть Collection<String>  без повторений title всех авторов
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", Arrays.asList(new Book("A"), new Book("B"), new Book("C"), new Book("A")));
        Author author2 = new Author("Petr", Arrays.asList(new Book("A"), new Book("B"), new Book("D")));
        List<Author> list1 = List.of(author1, author2);
    }
}

class Author {

    private String name;
    private final List<Book> books;

    Author(String name, List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}

class Book {
    private final String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
