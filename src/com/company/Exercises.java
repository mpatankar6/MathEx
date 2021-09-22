package com.company;

public class Exercises {
    public static int digitSwapper(int input)
    {
        int ones = input % 10;
        int tens = (input / 10) % 10;
        int rest = input / 100;
        int newNumber = rest * 100 + ones * 10 + tens;
        return newNumber;
    }

    public static void timeLeft(int currHour, int currMin, int depHour, int depMin)
    {

        int minutesToGo = ((depHour * 60 + depMin) - (currHour * 60 + currMin));
        int hours = minutesToGo / 60;
        int minutes = minutesToGo % 60;
        System.out.println(hours + ":" + minutes + " remaining");

    }
    public static int dayOfWeek(int daysOfWeek1, int day)
    {
        int daysLeft = (daysOfWeek1 + (day-1)) % 7;
        return daysLeft;
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input +" " + output);

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));

    }

}