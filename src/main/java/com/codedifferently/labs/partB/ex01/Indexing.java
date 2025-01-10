package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "";
        String myStr = "Hello planet earth, you are a great planet.";
        /* Your code goes here*/
            int first = myStr.indexOf("e");
        System.out.println(myStr.indexOf("e", first+1));
        return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


