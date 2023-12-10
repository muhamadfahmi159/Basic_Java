package com.javaprogram;

public class TugasSegitiga {
    public static void main(String[] args) {
        //Tugas : Membuat Segitiga Menggunakan Loop Statement
        System.out.println("Segitiga");
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= 10 - i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
