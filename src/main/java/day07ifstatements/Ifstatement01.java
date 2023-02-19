package day07ifstatements;

import java.util.Scanner;
public class Ifstatement01 {
    public static void main(String[] args) {
        //example 1) verilen charekter buyuk harf ise "buyuk harf "yazdır
        // kuçuk harf ise ekrana kucuk harf yazdıran kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir charakter giriniz...");
        //1.yol
        char ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf...");
        }
        if(ch>='a' && ch<='z'){
            System.out.println("kucuk harf...");}
        //2.yol
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf...");
        } else if (ch>='a' && ch<='z'){
            System.out.println(("kucuk harf..."));
        }else {
            System.out.println("harf değil...");
        }

    }
}
