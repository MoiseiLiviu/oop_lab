package com.liviu.lab_3.task1;


import java.util.stream.Collectors;

public class TextUtil {

    public static long numberOfSentences(String text){

        return text.chars().mapToObj(e->(char)e).collect(Collectors.toList()).stream().filter(c->c=='.').count();
    }

    public static long numberOfWords(String text){

        return  text.split(" ").length;
    }
}
