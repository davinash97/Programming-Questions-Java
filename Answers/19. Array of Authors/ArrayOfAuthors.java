import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayOfAuthors {
    public static void main(String[] args) {
        // Example input array of books
        Book[] books = {
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("1984", "George Orwell"),
                new Book("Pride and Prejudice", "Jane Austen"),
                new Book("To Kill a Mockingbird", "Harper Lee")
        };

        // Get array of unique authors
        String[] authors = getUniqueAuthors(books);

        // Print the result
        for (String author : authors) {
            System.out.println(author);
        }
    }

    static String[] getUniqueAuthors(Book[] books) {
        Set<String> authorSet = new HashSet<>();
        for (Book book : books) {
            authorSet.add(book.getAuthor());
        }
        List<String> authorList = new ArrayList<>(authorSet);
        authorList.sort(String::compareToIgnoreCase);
        return authorList.toArray(new String[0]);
    }

    static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
