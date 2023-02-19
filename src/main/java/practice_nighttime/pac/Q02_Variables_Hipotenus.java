package practice_nighttime.pac;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    public static void main(String[] args) {
        // hipotenıus
        Scanner input = new Scanner(System.in);
        System.out.println(" birinci dik kenar degeri giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar giriniz");
        double b = input.nextDouble();
        double c =Math.sqrt(a*a+b*b);
        System.out.println("hipotenus"+c);
        System.out.printf("%.2f",c);


    }
}
