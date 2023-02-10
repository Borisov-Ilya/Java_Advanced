package Task3.Array;

import java.util.Arrays;

/**
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 */

public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int negativeIndex = 0;
        int positiveIndex = 0;
        int temp;

        // Заполнить массив случайными целыми числами от -10 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 21) - 10);
        }

        System.out.println("1 массив: " + Arrays.toString(array));

        // Найти максимальный отрицательный и минимальный положительный элементы массива
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (maxNegative < array[i])) {
                maxNegative = array[i];
                negativeIndex = i;
            }
            if ((array[i] > 0) && (minPositive > array[i])) {
                minPositive = array[i];
                positiveIndex = i;
            }
        }

        // Меняем местами элементы массива
        temp = array[negativeIndex];
        array[negativeIndex] = array[positiveIndex];
        array[positiveIndex] = temp;

        System.out.println("2 массив: " + Arrays.toString(array));
        System.out.println("Минимальный положительный элемент: " + minPositive);
        System.out.println("Максимальный отрицательный элемент: " + maxNegative);
    }
}
