package day13whileloopdowhileloo;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        // 3==> 3x1=3 3x2=6 ...
        Scanner input =new Scanner(System.in);
        System.out.println("carpma için bir sayı giriniz");
        int num= input.nextInt();
        int i=1;
        while (i<11){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }
        // verilen bir stringte her harfin sonrasına * ekleyiviz
        //java ==>j*a*v*a*
        System.out.println("bir kelime giriniz");
        String word= input.next();
        String newWord="";

        int k=0;
        while (k<word.length()){
            newWord=newWord + word.charAt(k)+"*";
            k++;
        }
        System.out.println(newWord);



    }


}
