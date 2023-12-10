package com.javaprogram;

public class BreakContinueReturn {
    public static void main(String[] args) {
        //break, continue, return

        int a=0;
        while(true){
            a++;
            if(a == 8){
                break;
            } else if (a == 5) {
                continue; //akan kembali keatas (seperti diskip)
            } else if (a == 7) {
                return; //akan berhenti total
            }
            System.out.println("loop ke-"+a);
        }
    }
}
