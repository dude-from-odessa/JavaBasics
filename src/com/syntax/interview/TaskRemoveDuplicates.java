package com.syntax.interview;

import java.util.Arrays;

public class TaskRemoveDuplicates {

    public static void main(String[] args) {

        int[] array = {30, 0, 0, 30, 40, 45, 453534, 234, 123, 43432, 234, 12};

        System.out.println(Arrays.toString(dublicates(array)));

    }

    static int[] dublicates(int[] array) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = i + 1; x < array.length; x++) {
                if (array[i] == array[x]) {
                    array[x] = 0;
                }
            }
        }
        for (int y : array) {
            if (y != 0) {
                counter++;
            }
        }

        int[] arrayC = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                arrayC[counter] = array[i];
                counter++;
            }
        }
        return arrayC;

    }
}




