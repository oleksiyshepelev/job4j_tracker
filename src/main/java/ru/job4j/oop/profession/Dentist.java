package ru.job4j.oop.profession;

import ru.job4j.oop.profession.makes.Diagnosis;
import ru.job4j.oop.profession.makes.Operation;

public class Dentist extends Doctor {
    private Diagnosis diagnosis;
    private Operation operations;

    public Dentist(String name, String shurname, String education,
                   int birthday, Operation operations, Diagnosis diagnosis) {
        super(name, shurname, education, birthday);
        this.diagnosis = diagnosis;
        this.operations = operations;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public Operation getOperations() {
        return operations;
    }
}
