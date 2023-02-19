package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        // 2: bir sayı tek mi çift mi kontrol edelim
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int num = input.nextInt();
        // 1. yol
        if (num%2==0){
            System.out.println("cift sayı");
        }
        if (num%2!=0){
            System.out.println("tek sayı...");
        }
        // 2. yol
        if (num%2==0) {
            System.out.println("cift sayı");
        }else {
            System.out.println("tek sayı...");
        }


    }
}
