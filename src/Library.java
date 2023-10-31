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
            System.out.print(currentBook.pageCount + ", ");
            System.out.println(currentBook.hardback);
        }
    }
}

