package ru.job4j.oop.profession;

import ru.job4j.oop.profession.makes.Projects;
import ru.job4j.oop.profession.makes.Refactoring;

public class Builder extends Engineer {
    private Projects projects;
    private Refactoring refactorings;

    public Builder(String name, String shurname, String education, int birthday,
                   Projects pro, Refactoring refac) {
        super(name, shurname, education, birthday);
        this.projects = pro;
        this.refactorings = refac;
    }

    public Projects getProjects() {
        return projects;
    }

    public Refactoring getRefactorings() {
        return refactorings;
    }
}
