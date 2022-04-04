package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Perunin Ilya Aleksandrovich");
        student.setGroup("101 - IST");
        student.setDate(new Date());
        System.out.println(student.getDate());
        System.out.println(student.getFio());
        System.out.println(student.getGroup());
    }

}
