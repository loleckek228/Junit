package com.geekbrains.homework.junit.lesson6;

import java.util.Arrays;

public class MainApp {

    public static int[] getArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                return Arrays.copyOfRange(array, i + 1, array.length);
            }
        }
        throw new RuntimeException("Not found");
    }

    public static boolean checkOneandFour(int[] array) {
        boolean isOne = false;
        boolean isFour = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                isOne = true;
            }
            else if (array[i] == 4) {
                isFour = true;
            }
            else {
                return false;
            }
        }

        if (isOne && isFour) {
            return true;
        }
        return false;
    }
}
