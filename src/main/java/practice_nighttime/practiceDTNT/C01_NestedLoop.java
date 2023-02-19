package practice_nighttime.practiceDTNT;

import java.util.Scanner;

public class C01_NestedLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("agaç tac uzunlugunu giriniz");
        int tac= input.nextInt();

        String yaprak="";
        for (int i = 0; i <tac ; i++) {
            yaprak += "^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("|||");
        }

    }
}
