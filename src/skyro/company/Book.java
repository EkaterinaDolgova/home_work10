package skyro.company;

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
}


