package com.codedifferently.labs.partB.ex01;

public class IndexingExample {

    public static String index(){
        String response = "";

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');//3
        response += "index of first dash: "+ idx1 + "\n";
        int idx2 = phoneNum.indexOf('-', idx1 + 1);//7
        response += "second dash index: "+ idx2;

        return response;
    }

    public static void main(String args[]) {
        String indexOutput = index();
        System.out.print(indexOutput);
    }
}
