package day12forloopwhileloop;

import java.util.Scanner;

public class ForLooppratic1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("row sayısını giriniz...");
        int row= input.nextInt();
        System.out.println("coluam sayısını giriniz...");
        int column= input.nextInt();

        for(int i=1; i<=row; i++ ){
            for(int k=1; k<=column; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2. odev





    }
}
