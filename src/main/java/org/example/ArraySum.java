package org.example;

public class ArraySum {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) { // Ошибка: использование <= вместо <
            sum += array[i];
        }
        return sum;
    }
}
