package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean teen;

    public Dentist(boolean deleteTeen, char sex, String name, String surname, String education, int birthday) {
        super(sex, name, surname, education, birthday);
        this.teen = deleteTeen;
    }

    public boolean deleteTeeen(boolean teen) {
        this.teen = teen;
        return teen;
    }
}
