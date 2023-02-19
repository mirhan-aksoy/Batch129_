package ssgGenel.ssg28aralikifelseNested;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayi= scan.nextDouble();

        if (notSayi<0 || notSayi>101){

            System.out.println("Gecerli bir  Not Giriniz.");
        } else if (notSayi<50) {
            System.out.println("Notunuz D");
        } else if (notSayi<60) {
            System.out.println("Notunuz C");
        } else if (notSayi<80) {
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");
        }



    }
}