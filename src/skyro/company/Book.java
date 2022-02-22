package skyro.company;
//Класс
public class Book {String name;
                   String authorName;
                   int year;
//Конструктор
      public Book(String name, String authorName, int year) {
          this.name =name;
          this.authorName = authorName;
          this.year = year;
      }
//Геттеры
      public String getName(){
          return this.name;
      }
      public String getAuthorName(){
          return this.authorName;
      }
      public int getYear(){
        return this.year;
    }
//Сеттер
      public void setYear(int year){
          this.year = year;
      }
}


