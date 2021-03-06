package com.ifmo.lesson3;

import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        for (int i:randomNumbers) System.out.print(i+" ");
        System.out.println("");

        int evens = evens(randomNumbers);

        System.out.print(evens);
    }

    public static int[] randomNumbers() {
        Random number = new Random();
        int [] array = new int[15];
        for (int i=0; i<array.length; i++) {
            array[i] = 1 + number.nextInt(9);
        }
        return array;
    }

    private static int evens(int[] arr) {
       int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2==0) cnt++;
        }
        return cnt;
    }
}
