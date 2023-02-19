package ssgGenel.ssg29aralikifstatmentsternay4;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();
        if (gunIsmi.equals("pazar")&& gunIsmi.equals("cumartesi")){
            System.out.println("Hafta Sonu");
        }else{
            System.out.println("HaftaIci");
        }

        if (gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsemeb")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma")){
            System.out.println("HaftaIci");
        }else{
            System.out.println("Hafta sonu");
        }

    }
}