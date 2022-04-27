package com.company;

public class Main {

    public static void main(String[] args) {
        int [] a = new int[]{1, 2, 3};
        float [] a2 = new float[]{(float) 1.57, (float) 7.654, (float) 9.986};
        boolean[] a3 = new boolean[]{true, false, true};
        //---------------------------------------------------
        for (int i=0; i<3; i++){
            System.out.print(a[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.print(" ");
        for (int i=0; i<3; i++){
            System.out.print(a2[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.print(" ");
        for (int i=0; i<3; i++){
            System.out.print(a3[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        //---------------------------------------------------
        for (int i=0; i<3; i++){
            System.out.print(a[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i=0; i<3; i++){
            System.out.print(a2[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i=0; i<3; i++){
            System.out.print(a3[i]);
            if(i<2){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        //---------------------------------------------------
        for (int i=2; i>-1; i--){
            System.out.print(a[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i=2; i>-1; i--){
            System.out.print(a2[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i=2; i>-1; i--){
            System.out.print(a3[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        //---------------------------------------------------
        for (int i=0; i<3; i++){
            if(a[i]%2!=0){
                a[i]++;
                System.out.print(a[i] + " ");
            }
            else{
                System.out.print(a[i] + " ");
            }
        }
    }
}
