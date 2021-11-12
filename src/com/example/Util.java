package com.example;

import java.util.ArrayList;

public class Util {
    public static ArrayList stringToArray(String input) throws Exception, NumberFormatException {
        if(!isValidString(input))
            throw new Exception("[ERROR]: El formato del String no es válido. Debe ser un Array dentro de un String. Ej: \"[1,2,3,4,4]\"");
        String inputString = input.replace("[", "").replace("]","");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(String part : inputString.split(",")){
            Integer number = Integer.parseInt(part);
            arrayList.add(number);
        }

        return arrayList;
    }

    private static boolean isValidString(String input) {
        if((!input.startsWith("[") || !input.endsWith("]")) || !input.contains(","))
            return false;
        return true;
    }
}
