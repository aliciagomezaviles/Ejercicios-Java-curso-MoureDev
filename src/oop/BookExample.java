package oop;

public class BookExample {

    private final String title; //Solo lectura

    public BookExample(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
