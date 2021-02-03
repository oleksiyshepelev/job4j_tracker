package ru.job4j.oop.profession;

public class Profession {
    private String name;
    private String shurname;
    private String education;
    private int birthday;

    public Profession() {
    }

    public Profession(String name, String shurname, String education, int birthday) {
        this.name = name;
        this.shurname = shurname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public String getShurname() {
        return this.shurname;
    }

    public String getEducation() {
        return this.education;
    }

    public int getBirthday() {
        return this.birthday;
    }
}
