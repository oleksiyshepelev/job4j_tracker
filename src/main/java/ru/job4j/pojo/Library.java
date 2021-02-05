package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book();
        Book linuxCode = new Book();
        Book javaCode = new Book();
        Book pythonCode = new Book();
        cleanCode.setName("Clean Code");
        cleanCode.setCountOfPage(200);
        linuxCode.setName("Linux Code");
        linuxCode.setCountOfPage(1000);
        javaCode.setName("Java Code");
        javaCode.setCountOfPage(1500);
        pythonCode.setName("Python Code");
        pythonCode.setCountOfPage(900);
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
