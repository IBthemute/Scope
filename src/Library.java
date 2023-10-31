public class Library {
    private Book[] collection;
    private int currentSize;


    public Library(int maxSize) {
        collection = new Book[maxSize];
        currentSize = 0;
    }


    public void listBooks() {
        for (int i=0; i<currentSize; i++) {
            Book currentBook = collection[i];
            System.out.print(currentBook.title + ", ");
            System.out.print(currentBook.author + ", ");
            System.out.print(currentBook.getPageCount() + ", ");
            System.out.println(currentBook.hardback);
        }
    }

    public Book[] addbook(String title, String author, int pageCount, boolean hardback) {
        Book theBook;
        theBook = new Book(title, author, pageCount, hardback);

        // add to collection
        for (int i=0; i<= collection.length; i++) {
            // check if the item in the array is "null" (has not been set)
            if (collection[i] == null) {
                collection[i] = theBook;
                break;
            }
        }

        return collection;
    }
}

