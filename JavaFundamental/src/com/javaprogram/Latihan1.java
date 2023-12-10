package com.javaprogram;

public class Latihan1 {
    public static void main(String[] args) {
//        System.out.println("Hello Word");
//
//        String kata1 = "Hello Word";
//        System.out.println(kata1);
//
//        int a = 2;
//        int b = 8;
//
//        int c = a+b;
//
//        double angkaBerkoma = 3.7897;
//
//        System.out.println("Pertambahan a + b = "+c);
//        System.out.println(c+angkaBerkoma);
//
//        String kataBaru = "Nama Saya ";
//        String namaSaya = "Fahmi";
//        String gabungKata = kataBaru+namaSaya;
//        System.out.println(gabungKata);
//
//        String url = "https://bukugambar.com";
//        Boolean isThisTrue = url.startsWith("http");
//        System.out.println(isThisTrue);
//
//        Boolean isThisTrue2 = url.endsWith("com");
//        System.out.println(isThisTrue2);

        String textRegex = "DigitalSkola2023";
        System.out.println(textRegex.replaceAll("[A-Z0-9]",""));
        String textRegex2 = "Saya mendapatkan uang senilai RP 15000";
        System.out.println(textRegex2.replaceAll("[A-Za-z]",""));

        //String namaMakan = "Mie Goreng, Nasi Uduk, pempek, gado-gado"
    }
}
