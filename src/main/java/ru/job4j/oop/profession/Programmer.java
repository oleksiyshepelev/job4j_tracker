package ru.job4j.oop.profession;

import ru.job4j.oop.profession.makes.Projects;
import ru.job4j.oop.profession.makes.Refactoring;

public class Programmer extends Engineer {
    private Projects projectsReal;
    private Refactoring refactoringsReal;

    public Programmer(String name, String shurname, String education, int birthday,
                      Projects pro, Refactoring refac) {
        super(name, shurname, education, birthday);
        this.projectsReal = pro;
        this.refactoringsReal = refac;
    }

    public Projects getProjectsReal() {
        return projectsReal;
    }

    public Refactoring getRefactoringsReal() {
        return refactoringsReal;
    }
}
