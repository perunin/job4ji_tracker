package ru.job4j.inheritance;

public class Doctor extends Profession {

    public Doctor(int height, String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Doctor() {

    }

    public Diagnosis heal(Pacient pacient) {

    }
}
