package com.javaprogram;

public class LoopingBersarang {
    public static void main(String[] args) {
        // looping bersarang

        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }
        for(int i =0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n\n");
        System.out.println("Segitiga");
        int x = 5;
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");
        System.out.println("PR");
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

        System.out.println("\n\n");
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= 10 - i; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
