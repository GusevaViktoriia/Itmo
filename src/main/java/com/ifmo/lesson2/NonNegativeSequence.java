package com.ifmo.lesson2;

public class NonNegativeSequence {
    /*
    Создайте программу, выводящую на экран все неотрицательные элементы
    последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        int first = 90;
       while (first>=0){
           System.out.printf(first+" ");
           first-=5;
       }
    }
}
