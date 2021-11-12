package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String inputString = "[1,2,10,20,100,300]";
        try {
            System.out.println("Tratando de convertir el String \"" + inputString + "\" a ArrayList...");
            ArrayList<Integer> arrayList = Util.stringToArray(inputString);
            System.out.println("ArrayList tras la conversión: " + arrayList);
        } catch(NumberFormatException e) {
            System.out.println("[ERROR]: Al menos uno de los elementos introducidos no es un número entero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
