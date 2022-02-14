package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private boolean makeProgramm;

    public Programmer(boolean makeProgramm, String skill, String name, String surname, String education, int birthday) {
        super(skill,  name, surname, education, birthday);
        this.makeProgramm = makeProgramm;
    }
}
