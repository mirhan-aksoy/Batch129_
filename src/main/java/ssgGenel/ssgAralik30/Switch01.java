package ssgGenel.ssgAralik30;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        // kullanicidan ayiIsmini     alip
        // istenen ay kacinic  ay oldugnuz  yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        String ayIsmi=scan.next().toLowerCase();


        switch (ayIsmi){

            case "ocak":
                System.out.println(1);
                break;
            case "subat":
                System.out.println(2);
                break;
            case "mart":
                System.out.println(3);
                break;
            case "nisan":
                System.out.println(4);
                break;
            case "mayis":
                System.out.println(5);
                break;
            case "haziran":
                System.out.println(6);
                break;
            case "temmuz":
                System.out.println(7);
                break;
            case "agustos":
                System.out.println(8);
                break;
            case "eylul":
                System.out.println(9);
                break;
            case "ekim":
                System.out.println(10);
                break;
            case "kasim":
                System.out.println(11);
                break;
            case "aralik":
                System.out.println(12);

            default :
                System.out.println("Gecerli bir ayIsim Giriniz");
        }

        if (ayIsmi.equals("Ocak")) {
            System.out.println(1);
        } else if (ayIsmi.equals("Subat")) {
            System.out.println(2);
        }else if (ayIsmi.equals("Mart")) {
            System.out.println(3);
        }else if (ayIsmi.equals("Nisan")) {
            System.out.println(4);
        }else if (ayIsmi.equals("Mayis")) {
            System.out.println(5);
        }else if (ayIsmi.equals("Haziran")) {
            System.out.println(6);
        }else if (ayIsmi.equals("Temmuz")) {
            System.out.println(7);
        }else if (ayIsmi.equals("Augstos")) {
            System.out.println(8);
        }else if (ayIsmi.equals("Eylul")) {
            System.out.println(9);
        }else if (ayIsmi.equals("Ekim")) {
            System.out.println(10);
        }else if (ayIsmi.equals("Kasim")) {
            System.out.println(11);
        }else if (ayIsmi.equals("Aralik")) {
            System.out.println(12);
        }else {
            System.out.println("Lutfen gecerli bir ay isminize giriniz");
        }

    }
}