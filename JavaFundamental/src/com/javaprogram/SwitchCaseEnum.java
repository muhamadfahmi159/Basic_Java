package com.javaprogram;

public class SwitchCaseEnum {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        switch (color){
            case RED :
                System.out.println("RED");
                break;
            case BLUE :
                System.out.println("BLUE");
                break;
            case GREEN :
                System.out.println("GREEN");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }
    }
}
