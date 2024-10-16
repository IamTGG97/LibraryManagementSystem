public class Book {


private String title;
private String author;
private String isbn;
private boolean available;

public Book(String title, String author, String isbn){
this.author = author;
this.title = title;
this.isbn = isbn;
this.available = true;
}

//getters and setters
public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public boolean isAvailable() {
    return available;
}

public void setAvailable(boolean available) {
    this.available = available;
}

public String toString(){
    return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + available + "]";
    }



}
