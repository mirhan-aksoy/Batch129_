package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        ssekli yazdır   * * * * *
                        * * * * *
                        * * * * *
         */
        Scanner input= new Scanner(System.in);

        System.out.println("satır row sayısı giriniz");
        int row= input.nextInt();

        System.out.println("sutun column sayısı giriniz");
        int column= input.nextInt();

        for (int i = 0; i <row ; i++) {
            for (int k = 0; k <column ; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }







    }
}
