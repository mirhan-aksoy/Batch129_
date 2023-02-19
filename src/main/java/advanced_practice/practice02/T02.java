package advanced_practice.practice02;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /* Katsayıları verilen ikinci dereceden 1 bilinmeyenli denklemin kökleriniz bulunuz.
       ax² + bx + c;
        Çözüm adımları kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = b² - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.*/

        Scanner input= new Scanner(System.in);
        System.out.println("denklemin a b c şeklinde uc adet katsayısını giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();


        double delta=b*b-(4*a*c);

        if(delta>0){
            double x1=(-b + Math.sqrt(delta)) / (2*a);
            double x2=(-b - Math.sqrt(delta)) / (2*a);
            System.out.println("denkleminiz :"+a+"x²+"+b+"x+"+c+";");
            System.out.println("denkleminizin kökleri: x1=" + x1 + ",x2=" + x2);
        }else if(delta==0){
            double x= -b/(2*a);
             System.out.println("denkleminizin kökü +"+x);
        }else {
            System.out.println("denkleminizin kökü yoktur");
        }





    }
}
