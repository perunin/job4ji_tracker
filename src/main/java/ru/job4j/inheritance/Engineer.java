package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String skill;

    public Engineer(String skill, String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
        this.skill = skill;
    }

    public MakeDetail detail() {
        MakeDetail namedetail = new MakeDetail();
        return namedetail;
    }
}
