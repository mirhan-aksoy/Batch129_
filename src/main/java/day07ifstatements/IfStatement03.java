package day07ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
      // 3) verilen sayının pozitif negatif veya nötr olduğunu kontrol eden kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int num = input.nextInt();

        if(num>0){
            System.out.println("pozitif...");
        } else if (num<0) {
            System.out.println("negaif...");
        }else {
            System.out.println("notr");
        }


    }
}
