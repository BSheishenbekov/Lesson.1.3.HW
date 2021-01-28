package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myArrey = {5.1, 15.5, 2.3, 8.4, -4.1, 9.5, -1.7, 6.4, 7.4, -9.7, 24.5, 3.6, 4.8, 14.9, 8.2};
        double sumNumber = 0;
        double result = 0;
        int count = 0;
        boolean negatNumber = false;

        for (double temp : myArrey) {
            if (temp < 0) {
                negatNumber = true;
                continue;
            }
            if (negatNumber) {
                if (temp > 0) {

                    count = count + 1;
                    sumNumber = sumNumber + temp;
                    result = sumNumber / count;
                }
            }
        }
        System.out.println("Количество - " + count);
        System.out.println("Сумма- " + sumNumber);
        System.out.println("Результат - " + result);
    }
}