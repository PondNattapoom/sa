package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public abstract class BookCollection {
    protected Set<Book> books;

    public BookCollection() {
        books = new HashSet<>();
    }

    public void add(Book b) throws IOException, ParserConfigurationException {
        books.add(b);
    }

    public void remove(Book b) {
        books.remove(b);
    }
}
