package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student studentAlex = new Student();
        studentAlex.setFullName("Alexander Petrov");
        studentAlex.setGroup("Fourth Group");
        studentAlex.setDateStart(new Date());

        System.out.println("Student " + studentAlex.getFullName() + " of the "
                + studentAlex.getGroup() + " has entered the study " + studentAlex.getDateStart());
    }
}
