package com.codedifferently.labs.partB.ex03;

public class Replace {
    public static String sentence(){
        String response = "";
        String sentence = "Using String replace to replace character";
        sentence = sentence.replace("r", "R");
        response += sentence;

        return response;
    }
    public static void main(String[] args) {
        String sentenceOutput = sentence();
        System.out.println(sentenceOutput);
    }
}
