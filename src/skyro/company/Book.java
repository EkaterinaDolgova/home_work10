package skyro.company;

import java.util.Objects;

//Класс
public class Book {
    private String name;
    private Author author;
    private int year;


    //Конструктор
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //Геттеры
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    //Сеттер
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return getName().equals(c2.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Наименование книги: " + this.name + " Автор: " + this.author + " Дата издания: " + this.year ;
    }
}


