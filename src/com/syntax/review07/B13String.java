package com.syntax.review07;

public class B13String {
    // Best practice is to always try to make all of your instance variables as private
    private String str;
    public B13String(String str) {

        this.str = str;
    }

    // write a method that can tell me how many times as character
    // been repeated in String.

    public int coutChars(char c) {
        int counter = 0;
        for (char cha : str.toCharArray()) {
            if (cha == c) {
                counter++;
            }
        }
        return counter;
    }

    public void print(char c) {
        int counter =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==c) {
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" times inside this string");
    }
}
