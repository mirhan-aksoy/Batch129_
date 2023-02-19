package ssgGenel.ssg29aralikifstatmentsternay4;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {


        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();


        // 1 .yol
        if (sayi%2==0){
            System.out.println("CIFT");
        }else {
            System.out.println("TEK");
        }

     // 2 .yol
        System.out.println(sayi%2==0 ? "CIFT" : "TEK");


        String str = sayi%2==0 ? "CIFT" : "TEK";
        System.out.println(str);

    }

}