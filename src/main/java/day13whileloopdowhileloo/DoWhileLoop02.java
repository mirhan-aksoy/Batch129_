package day13whileloopdowhileloo;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*kullanıcıdan bir tamsayı alınız tamsayı 100' den kucukse kullanıcıya kaybettiniz
        meajı vererek oyunu sonlandırınız. tamsayı 100 ve 100 den buyukse kazndınız il edevam hakkı veriniz
         */
        Scanner input = new Scanner(System.in);
        int num=0;

        do {

            System.out.println("bir sayı giriniz");
            num= input.nextInt();
            if(num>=100){
                System.out.println("kazandınız");
            }

        }while (num>=100);
        System.out.println("kaybettiniz");


    }
}
