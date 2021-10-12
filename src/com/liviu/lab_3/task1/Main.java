package com.liviu.lab_3.task1;

public class Main {

    private static final String text = "Suspendisse non ultricies nibh. Fusce gravida elit non turpis ultricies tincidunt. Phasellus finibus mauris vel sapien vehicula scelerisque. Phasellus non risus non orci consequat dignissim. Nunc vestibulum neque ac leo gravida vulputate. Suspendisse potenti. Curabitur vulputate, massa ac vestibulum bibendum, mi purus porttitor urna, ac imperdiet erat ante nec risus. Suspendisse potenti. Nulla feugiat, lacus et auctor elementum, neque ante aliquet risus, quis commodo est neque a nunc. Integer ornare tortor justo, porta iaculis metus tincidunt quis. Ut vitae enim vehicula, suscipit lectus sit amet, accumsan libero. Ut vehicula ornare lacinia. Donec eu rutrum tortor, in mollis neque. Mauris cursus, ipsum vel venenatis posuere, ligula nibh hendrerit est, in ullamcorper est nulla id leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. ";

    public static void main(String[] args) {

        System.out.println(TextUtil.numberOfSentences(text));
        System.out.println(TextUtil.numberOfWords(text));
    }
}
