package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean deleteTeen;

    public Dentist(boolean deleteTeen, char sex, String name, String surname, String education, int birthday) {
        super(sex, name, surname, education, birthday);
        this.deleteTeen = deleteTeen;
    }
}
