package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        // Example 1: ay numarası verilince verilen aydan başlayıp kalan ayları yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("başlangıç ayının sayısını giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("jabuary");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("gecerli ay numarası giriniz");

                // 2. yol: switch












        }




    }
}
