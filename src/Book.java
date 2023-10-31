public class Book {
    String title;
    String author;
    private int pageCount;
    public boolean hardback;


    public Book(String t, String a, int pc, boolean h) {
        title = t;
        author = a;
        pageCount = pc;
        hardback = h;
    }


    public int getPageCount() {
        return pageCount;
    }
}
