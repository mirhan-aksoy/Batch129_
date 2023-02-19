package practice_nighttime.pac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahrenheitToCelcius {
    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");
        double f = input.nextDouble();

        double c = (f-32)*5/9;

        System.out.println("Celcius: "+c);

        //Ondalık kısmı belirli bir formatta yazdırmak için:
        //1. yol: DecimalFormat class ile;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedCelcius = decimalFormat.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius);

        //2. Yol: printf ile;
        System.out.printf("Printf ile: " + "%.2f",c);// %=> herhangi bir sayı, 2f=> iki basakmalı format

    }
}