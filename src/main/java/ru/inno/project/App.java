package ru.inno.project;

import java.util.Scanner;

/**
 * Клиентский код.
 */
public class App {
    private static final int N = 10; // количество повторений

    /**
     * Печатает заданное количество раз заданную строку.
     *
     * @param s строка, которую нужно напечатать
     * @param n количество раз
     */
    private static void printSeveralTimes(String s, int n) {
        while (n-- > 0) {
            System.out.println(s);
        }
    }

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.nextLine();
        printSeveralTimes(string, N);
    }
}
