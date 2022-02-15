package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean finishHouse;

    public Builder(boolean finishHouse, String skill, String name, String surname, String education, int birthday) {
        super(skill, name, surname, education, birthday);
        this.finishHouse = finishHouse;
    }

    public boolean house(boolean finishHouse) {
        this.finishHouse = finishHouse;
        return finishHouse;
    }

}
