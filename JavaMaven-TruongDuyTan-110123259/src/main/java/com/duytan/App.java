package com.duytan;

public class App {

    public static String giaiPhuongTrinhBac1(double a, double b) {

        if (a == 0 && b == 0) {
            return "Phuong trinh vo so nghiem";
        }

        if (a == 0 && b != 0) {
            return "Phuong trinh vo nghiem";
        }

        double x = -b / a;

        return "Phuong trinh co nghiem x = " + x;
    }

    public static void main(String[] args) {

        System.out.println(
                giaiPhuongTrinhBac1(2, -4)
        );
    }
}