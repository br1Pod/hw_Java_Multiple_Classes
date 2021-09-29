import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private Integer capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> bookGenre;


    public Library() {
        this.capacity = 5;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addBookIfThereIsCapacity(Book book) {
        if (this.capacity > this.getNumberOfBooks()) {
            this.addBook(book);
        }
    }

    public void lendBook(Book book) {
        this.books.remove(0);
    }

    public void genreHashmap(){

        HashMap<String, Integer> bookGenre = new HashMap<>();

        bookGenre.put("Childrens", 400);
        bookGenre.put("Romance", 500);
        bookGenre.put("Poetry", 200);
        bookGenre.put("SciFi", 300);

    }


}
