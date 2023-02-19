package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {
    /*
   baş bit araında tüüm çift sayılar
    */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("baslangıc degeri giriniz");
        int start= input.nextInt();

        System.out.println("bitis degegri giriniz");
        int end= input.nextInt();

        if(start>end){
            System.out.println("baslangıç degeri bitiş degerinden buyuk olamaz");
        }

        for (int i =start; i <=end ; i++) {
            if(i%2==0) {
                System.out.println(i+" ");
            }

        }

    }

}
