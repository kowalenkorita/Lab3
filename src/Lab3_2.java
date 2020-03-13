import java.util.ArrayList;
import java.util.List;
//Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Переплет.
// Создать массив объектов. Вывести: a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством; c) список книг, выпущенных после заданного года.
// + класс Book
public class Lab3_2 {
    public static void main(String[] args) {
        String[] authorsBook1 = {"Author1"};
        Book book1 = new Book("nameBook1", authorsBook1, "publisher1", 2019, 300, 500, "hard");

        String[] authorBook2 = {"Author2"};
        Book book2 = new Book("nameBook2", authorBook2, "publisher2", 2018, 100, 1000, "limp");

        String[] authorBook3 = {"Author3", "Author4", "Author2"};
        Book book3 = new Book("nameBook3", authorBook3, "publisher2", 2000, 400, 100, "limp");

        Book[] books = {book1, book2, book3};

        System.out.println("Book by Author2: " + booksByAuthor("Author2", books));
        System.out.println("Book by publisher1: " + booksByPublisher("publisher1", books));
        System.out.println("Book after 2018: " + booksAfterYear(2018, books));
        System.out.println("Book with limp binding type: " + booksWithBindingType("limp", books));

    }

    public static List<Book> booksByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (String authorBook : book.getAuthors()) {
                if (author.equals(authorBook)) {
                    result.add(book);
                }
            }
        }

        return result;
    }

    public static List<Book> booksByPublisher(String publisher, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> booksAfterYear(int year, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (year < book.getYear()) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> booksWithBindingType(String bindingType, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (bindingType.equals(book.getBindingType())) {
                result.add(book);
            }
        }

        return result;
    }
}
