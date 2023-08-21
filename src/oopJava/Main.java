package oopJava;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("\n-------First task--------\n");

        Author tolstoy = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");

        Book pushkinsBook = new Book("Руслан и Л.", pushkin, 203);
        Book tolstoyBook = new Book("WarAndPeace", tolstoy, 153);

        tolstoyBook.setAge(154);
        System.out.println("TolstoyBook.getAge() = " + tolstoyBook.getAge());

        System.out.println(pushkin);
        System.out.println(pushkinsBook);
    }
}