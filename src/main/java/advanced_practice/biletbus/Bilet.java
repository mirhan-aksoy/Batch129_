package advanced_practice.biletbus;

import java.util.Scanner;

public class Bilet {
   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int km=0;
        int yas=0;
        int yolculuktipi=1;
        
        String turizm="***********Varan Turizm iyi yolculuklar diler*********";
        System.out.println(turizm);
        System.out.println("km nizi giriniz");
        km= input.nextInt();
        System.out.println("yasınızı giriniz");
        yas= input.nextInt();
        System.out.println("yolculuk tipi gidis-1,\nçift yön-2 giriniz");
        yolculuktipi= input.nextInt();

        if(km>0 && yas>0  && (yolculuktipi==1 || yolculuktipi==2)) {
            double biletUcreti = km * 0.1;
            double yasIndirimOrani = 0;
            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }
            biletUcreti -= biletUcreti * yasIndirimOrani;
            if (yolculuktipi == 2) {
                biletUcreti -= biletUcreti * 0.2;
                biletUcreti *= 2;
            }
            biletDokum(turizm, km, yolculuktipi, (int) biletUcreti);
        }else
            System.out.println("hatalı veri girdiniz");
    }//main
    private static void biletDokum(String Turizm, int km, int yolculuktipi, int biletUcreti){
        System.out.println("*************bilet dokum********************");
        System.out.println("bilet ücreti "+biletUcreti);
        System.out.println("mesafe "+km);
        System.out.println("yolculuk tipi "+(yolculuktipi==1 ? "tek yön":"çift yön"));

   slowPrint("*************keyifli yolculuklar******");
    }
    public static void slowPrint(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                long delay = 0;
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}//class
