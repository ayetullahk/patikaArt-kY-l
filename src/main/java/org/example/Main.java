package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yılı giriniz :");
        year= inp.nextInt();

        if (year%4==0&& year%100!=0||year%400==0){
            System.out.println("Artık yıl değildir :"+year);
        }else {
            System.out.println("Artık yıldır :"+year);
        }
    }
}