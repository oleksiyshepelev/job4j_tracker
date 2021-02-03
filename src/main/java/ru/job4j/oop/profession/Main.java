package ru.job4j.oop.profession;

import ru.job4j.oop.profession.makes.Diagnosis;
import ru.job4j.oop.profession.makes.Operation;
import ru.job4j.oop.profession.makes.Projects;
import ru.job4j.oop.profession.makes.Refactoring;

public class Main {
    public static void main(String[] args) {

        Diagnosis diagBlue = new Diagnosis(1200);
        Operation operBlue = new Operation(521);
        Dentist dentRabinovich = new Dentist("Denis", "Petrenko", "ZubnoyInstitut",
                1980, operBlue, diagBlue);

        Diagnosis diagStomach = new Diagnosis(982);
        Operation operStomach = new Operation(750);
        Surgeon surgPetrenko = new Surgeon("Ivan", "Petrenko", "MedInstitut",
                1975, operStomach, diagStomach);

        Projects projectsBuildings = new Projects(23);
        Refactoring projectsRef = new Refactoring(420);
        Builder builderEng = new Builder("Anton", "Chexov", "StojInstitut",
                1965, projectsBuildings, projectsRef);

        Projects projProgramms = new Projects(10);
        Refactoring refProgramms = new Refactoring(1200);
        Programmer progEng = new Programmer("Oleg", "Zagogulenko", "FizMat",
                1981, projProgramms, refProgramms);
    }
}
