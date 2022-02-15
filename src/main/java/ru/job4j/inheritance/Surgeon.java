package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean makeOperation;

    public Surgeon(boolean makeOperation, char sex, String name, String surname, String education, int birthday) {
        super(sex, name, surname, education, birthday);
        this.makeOperation = makeOperation;
    }

    public boolean operation(boolean makeOperation) {
        this.makeOperation = makeOperation;
        return makeOperation;
    }

}
