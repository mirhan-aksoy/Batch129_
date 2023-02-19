package day12forloopwhileloop;

import java.util.Scanner;

public class ForLooppratice2 {
    public static void main(String[] args) {
        // satır sayısı row girin her satırda azalarak row kadar yıldız yapın
        Scanner input= new Scanner(System.in);
        System.out.println("row sayısını giriniz...");
        int row= input.nextInt();
        for (int i =1; i<=row ; i++) {
            for (int k =i ; k<=row ; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
