package ru.job4j.inheritance;

public class Doctor extends Profession {

    private char sex;

    public Doctor(char sex, String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
        this.sex = sex;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }

}
