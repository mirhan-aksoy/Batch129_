package practice_nighttime.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {
        /*
        kullanıcıdan bir gün alın ve cuma ise müslümanlar için kutsal,
        c.tesi ise yahudiler için kutsal, pazar ise hristiyanlar için kutsal yazdır
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen gün ismi giriniz");
        String gun = input.next().toLowerCase();//kuçuk harfe çevirdik

        if (gun.equals("cuma")){
            System.out.println("müslümanlar için kutsal");

        } else if (gun.equals("cumartesi")){
            System.out.println("yahudiler için kutsal");
        } else if (gun.equals("pazar")){
            System.out.println("ristiyanlar için kutsal");
        }
        System.out.println("kutsal gün değil");

        {

        }


    }
}
