package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int values = 7;
        for (int index = 0; index < values; index++) {
            System.out.println("First Commit");
        }

        int ran= 7;

        for (int i = 0; i < ran; i++) {
            System.out.println("This is a random value "+ ran);
        }
        
        String frase ;
        frase= "This is more code";
        int j=0;
        for (char str : frase.toCharArray() ) {
            System.out.println(str);
            j++;
        }
        System.out.println("Interactions: "+j);
    }
}