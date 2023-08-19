package oopJava;

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

//    public void setName(String name) {
//        this.name = name;
//    }

    public Author getAuthorName() {
        return authorName;
    }

//    public void setAuthorName(Author authorName) {
//        this.authorName = authorName;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
