package ru.job4j.tracker;

public class DummyDic {
    public String engToRus(String eng){
        eng = "Неизвестное слово " + eng;
        return eng;
    }

    public static void main(String[] args) {
        DummyDic text = new DummyDic();
        String eng = "hello";
        System.out.println(text.engToRus(eng));
    }
}
