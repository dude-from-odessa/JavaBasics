package com.syntax.class18;


public class TaskMethods {

    /*
 1. Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
 2. Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
 3. Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    int sum(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    public static String reverse(String str) {
        String reversed;
        StringBuilder builder = new StringBuilder(str);
        return reversed = builder.reverse().toString();
    }
    private static String vowels(String str) {
        return str.replaceAll("[^aAeEiIoOuU ]","");
    }

    public static void main(String[] args) {

        TaskMethods object = new TaskMethods();

        System.out.println(object.sum(new int[]{1, 2, 3, 4, 5, 5, 5, 5}));

        System.out.println(TaskMethods.reverse("Hello"));

        System.out.println(vowels("Syntax Technologies"));
    }
}
