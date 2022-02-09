package com.codegym;

import java.util.Scanner;

public class Main {
    //    Xây dựng phương thức chuyển đổi từ độ F sang độ C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0/9) * (fahrenheit - 32);
        return celsius;
    }

    //    Xây dựng phương thức chuyển đổi từ độ C sang độ F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }

    //    Sử dụng vòng lặp do/while và cấu trúc lựa chọn switch/case để hiển in ra menu lựa chọn cho người dùng.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit,celsius;
        int choise;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choise = input.nextInt();
            switch (choise) {
                case 1:
//                    Gọi phương thức chuyển từ độ F sang độ C khi người dùng lựa chọn 1
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
//                    Gọi phương thức chuyển từ độ C sang độ F khi người dùng lựa chọn 2
                    System.out.println("Enter celsius");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit" + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choise != 0);
    }
}