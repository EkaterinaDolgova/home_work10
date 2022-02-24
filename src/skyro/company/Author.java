package skyro.company;

//Класс
public class Author {
    private String name;
    private String soname;

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

    @Override
    public String toString() {
        return "Автор книги " + this.name + " " + this.soname ;
    }
}
