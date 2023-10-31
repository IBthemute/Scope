import java.util.ArrayList;

public class Library {
    ArrayList<Book> collection;
    private int currentSize;
    private int maxSize;


    public Library(int maxSize) {
        collection = new ArrayList<>();
        currentSize = 0;
        maxSize = maxSize;
    }


    public void listBooks() {
        for (int i=0; i<currentSize; i++) {
            Book currentBook = collection.get(i);
            System.out.print(currentBook.title + ", ");
            System.out.print(currentBook.author + ", ");
            System.out.print(currentBook.getPageCount() + ", ");
            System.out.println(currentBook.hardback);
        }
    }

    public ArrayList<Book> addBook(String title, String author, int pageCount, boolean hardback) {
        Book theBook;
        theBook = new Book(title, author, pageCount, hardback);

        // no changes
        if (collection.size() >= maxSize) {
            throw new RuntimeException("Collection is at maximum capacity, cannot add more books.");
        }
        collection.add(theBook);

        return collection;
    }
}

