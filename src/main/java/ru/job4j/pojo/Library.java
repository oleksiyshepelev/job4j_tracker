package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 200);
        Book linuxCode = new Book("Linux Code", 1000);
        Book javaCode = new Book("Java Code", 1500);
        Book pythonCode = new Book("Python Code", 900);
        Book[] booksColection = new Book[4];
        booksColection[0] = cleanCode;
        booksColection[1] = linuxCode;
        booksColection[2] = javaCode;
        booksColection[3] = pythonCode;
        System.out.println("---Before change:");
        for (int i = 0; i < booksColection.length; i++) {
            Book bk = booksColection[i];
            System.out.println(bk.getName());
        }
        if (booksColection[0] != null && booksColection[3] != null) {
            Book bk = booksColection[0];
            booksColection[0] = booksColection[3];
            booksColection[3] = bk;
        }
        System.out.println("---After change:");
        for (int i = 0; i < booksColection.length; i++) {
            Book bk = booksColection[i];
            System.out.println(bk.getName());
        }
        System.out.println("---Search book:");
        for (int i = 0; i < booksColection.length; i++) {
            Book bk = booksColection[i];
            if (bk.getName().equals("Clean Code")) {
                System.out.println("Name of book: " + bk.getName() + System.lineSeparator()
                        + "Has pages: " + bk.getCountOfPage());
            }
        }
    }
}
