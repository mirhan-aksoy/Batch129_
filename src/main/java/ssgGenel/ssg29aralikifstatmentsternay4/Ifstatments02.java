package ssgGenel.ssg29aralikifstatmentsternay4;

import java.util.Scanner;

public class Ifstatments02 {
    public static <Scaner> void main(String[] args) {
       /* Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        int sayi= input.nextInt();

        if(sayi%2==0){
            System.out.println("cıft");
        }
        if(sayi%2!=0){
            System.out.println("tektir");
        }
        if(sayi%2==0){
            System.out.println("cift");
        }else {
            System.out.println("TEKTIR");
        }
    }
}
