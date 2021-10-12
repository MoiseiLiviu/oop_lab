package com.liviu.lab_3.task2;

public class TextUtil {


    private static long numberOf_X(String text, String x) {

        return text.chars().mapToObj(c -> (char) c).filter(c -> x.contains(("" + c).toLowerCase())).count();
    }

    public static long numberOfVowels(String text) {

        return numberOf_X(text, "aeiou");
    }

    public static long numberOfConsonants(String text) {

        return numberOf_X(text, "bcdfghjklmnpqrstvwxyz");
    }
}
