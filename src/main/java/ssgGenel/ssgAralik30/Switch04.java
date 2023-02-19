package ssgGenel.ssgAralik30;

import java.util.Scanner;

public class Switch04 {

    public static void main(String[] args) {

        //ingilizce de Ünlü veya Ünsüz harflerini kontrol etmek için bit program yaziniz:

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ingilizce harfi yaziniz");
        char ch=input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("=="  + ch + "=="  + " unlu  bir harf dir : ");
                break;
            default:
                System.out.println("=="  + ch + "=="  + " unsuz bir harf dir : ");
        }
    }
}