package ru.job4j.oop.profession;

import ru.job4j.oop.profession.makes.Diagnosis;
import ru.job4j.oop.profession.makes.Operation;

public class Surgeon extends Doctor {
    private Diagnosis diagnosis;
    private Operation operations;

    public Surgeon(String name, String shurname, String education,
                   int birthday, Operation operStomach, Diagnosis diagStomach) {
        super(name, shurname, education, birthday);
        this.diagnosis = diagStomach;
        this.operations = operStomach;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public Operation getOperations() {
        return operations;
    }
}
