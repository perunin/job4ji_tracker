package ru.job4j.tracker;

public class Cat {

    private String food;
    private String name;

    public void show(){
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick){
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("gav");
        black.eat("fish");
        black.show();
    }
}
