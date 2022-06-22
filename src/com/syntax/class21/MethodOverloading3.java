package com.syntax.class21;

public class MethodOverloading3 {

    void method(){
        System.out.println("1");
    }
    void method(String name){
        System.out.println("2");
    }
    void method(String name,int num){
        System.out.println("3");
    }
    void method(int num2,int num){
        System.out.println("4");
    }
    void method(int num,String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodOverloading3 m = new MethodOverloading3();
        m.method("Hamid",50);
    }
}
// checks coming from top to bottom
// 1. check of name
// 2. check of number of parameters
// 3. check data types
// 4. check of sequence of parameters