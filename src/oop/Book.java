package oop;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void titleBook() {
        System.out.println("El libro se titula " + title + ", y el autor es " + author);

    }
}

