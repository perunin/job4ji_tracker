package ru.job4j.inheritance;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession() {

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

}
