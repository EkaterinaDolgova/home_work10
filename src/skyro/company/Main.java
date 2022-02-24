package skyro.company;

public class Main {

    public static void main(String[] args) {
        Author Martin = new Author("Джордж", "Мартин");
        Author Martin1 = new Author("Ники", "Мартин");
        Author Martin2 = new Author("Майкл", "Мартин");
        Book Garry = new Book("Игры престолов", Martin, 1985);
        Book Garry1 = new Book("Игры престолов1", Martin1, 1987);
        Book Garry2 = new Book("Игры престолов2", Martin2, 1988);
        System.out.println("Книга " + Garry.getName());
        System.out.println("Автор книги " + Garry.getAuthor());
        System.out.println("Год выпуска книги " + Garry.getYear());
        Garry.setYear(1990);
        System.out.println("Год выпуска книги " + Garry.getYear());

        String[] arrString = {Garry.getName(), Garry1.getName(), Garry2.getName()};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrString[i] + ",");
        }
    }
}
