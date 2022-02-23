package skyro.company;

public class Main {

    public static void main(String[] args) {

        Book Garry = new Book("Игры престолов", "Мартин", 1985);
        Book Garry1 = new Book("Игры престолов1", "Мартин", 1987);
        Book Garry2 = new Book("Игры престолов2", "Мартин", 1988);
        Author Martin = new Author("Джордж", "Мартин");
        Author Martin1 = new Author("Ники", "Мартин");
        Author Martin2 = new Author("Майкл", "Мартин");
        System.out.println("Книга " + Garry.getName());
        System.out.println("Автор книги " + Garry.getAuthorName());
        System.out.println("Год выпуска книги " + Garry.getYear());
        Garry.setYear(1990);
        System.out.println("Год выпуска книги " + Garry.getYear());

        String[] arrString = {Garry.getName(), Garry1.getName(), Garry2.getName()};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrString[i] + ",");
        }
    }
}
