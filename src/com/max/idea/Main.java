package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.println("Введите длину массива: ");

        int size = input.nextInt();
        double array[] = new double[size];

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            double result = array[i] * average;
            System.out.println("Умножение на среднее арифметическое: " + result);
        }

    }
}































































































































