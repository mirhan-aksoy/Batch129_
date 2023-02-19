package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        /*1
          1 2
          1 2 3

         */

        Scanner input= new Scanner(System.in);

        System.out.println("satır row sayısı giriniz");
        int row= input.nextInt();


        for (int i = 1; i <=row ; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }


    }
}
