package com.company;

public class NewRandom {
    //package public static final const int double float boolean if else for while switch byte short long void protected private case break default class abstract enum interface extends implements
    public static void main(String[] args) {
        double r = Math.random();
        System.out.println(r);
        r = Math.random() * 10;
        System.out.println(r);
        int p = (int) (Math.random() * 10);
        System.out.println(p);
        p = (int) (Math.random()*10) + 1; // [1,10]
    }
}
