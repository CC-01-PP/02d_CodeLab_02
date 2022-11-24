package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Swift", "Taylor", "singer", 2004);
        output(mitarbeiter1.getInfo("#lastName"));
        output(mitarbeiter1.getInfo("#firstName"));
        output(mitarbeiter1.getInfo("#role"));
        output(mitarbeiter1.getInfo("#yearOfEntry"));

        output("");
        
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Sheeran", "Ed", "Singer-songwriter", 2004);
        output(mitarbeiter2.getInfo("#lastName"));
        output(mitarbeiter2.getInfo("#firstName"));
        output(mitarbeiter2.getInfo("#role"));
        output(mitarbeiter2.getInfo("#yearOfEntry"));

        output("");

        Mitarbeiter mitarbeiter3 = new Mitarbeiter("John", "Elton", "Singer, Pianist, Composer and Philanthropist", 1962);
        output(mitarbeiter3.getInfo("#lastName"));
        output(mitarbeiter3.getInfo("#firstName"));
        output(mitarbeiter3.getInfo("#role"));
        output(mitarbeiter3.getInfo("#yearOfEntry"));
    }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

