package oopJava;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("\n-------First task--------\n");

        Author Tolstoy = new Author("Лев", "Толстой");
        Author Pushkin = new Author("Александр", "Пушкин");

        Book PushkinsBook = new Book("Руслан и Л.", Pushkin, 203);
        Book TolstoyBook = new Book("WarAndPeace", Tolstoy, 153);

        TolstoyBook.setAge(154);
        System.out.println("TolstoyBook.getAge() = " + TolstoyBook.getAge());
    }
}