package skyro.company;

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
