package com.liviu.lab_3.task3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Collections.reverseOrder;

public class TextUtil {

    public static List<String> firstFiveMostUsedWords(String text){
        return getWordsStream(text).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByValue())).limit(5).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static String longestWord(String text) {

        return getWordsStream(text).sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get();
    }

    private static Stream<String> getWordsStream(String text){

        return Arrays.stream(text.split(" ")).map(str ->str.chars().filter(c->c>=65).mapToObj(c->""+(char)c).reduce("",(res,current)->res+current));
    }
}
