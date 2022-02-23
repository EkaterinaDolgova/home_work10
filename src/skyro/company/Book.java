package skyro.company;

//Класс
public class Book {
    String name;
    String authorName;
    int year;

    //Класс
    public class Author {
        String name;
        String soname;

        //Конструктор
        public Author(String name, String soname) {
            this.name = name;
            this.soname = soname;
        }

        //Геттеры
        public String getName() {
            return this.name;
        }

        public String getSoname() {
            return this.soname;
        }
    }

    //Конструктор
    public Book(String name, String authorName, int year) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
    }

    //Геттеры
    public String getName() {
        return this.name;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getYear() {
        return this.year;
    }

    //Сеттер
    public void setYear(int year) {
        this.year = year;
    }
}


