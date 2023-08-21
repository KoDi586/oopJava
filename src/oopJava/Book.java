package oopJava;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author authorName;
    private int age;

    public Book(String name, Author authorName, int age) {
        this.name = name;
        this.authorName = authorName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, age);
    }

    @Override
    public String toString() {
        return "Название: '" + name + '\'' +
                ", автор - " + authorName.getFirstName() + " " + authorName.getLastName() +
                ", книга была написанна " + age +
                " лет назад.";
    }
}
