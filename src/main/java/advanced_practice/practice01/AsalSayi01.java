package advanced_practice.practice01;


import java.util.Scanner;

    public class AsalSayi01 {

        public static void main(String[] args) {
            //  Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
            Scanner sc = new Scanner(System.in);
            System.out.println("Bir sayı giriniz");
            int num = sc.nextInt();
            Asal(num);

        }
        public static void Asal(int num){
            int count = 0;

            for(int i = 2; i < num; i++){

                if(num % i==0){

                    count++;

                }
            }
            System.out.println(count);
            if(count != 0){
                System.out.println(num + " Asal sayı değildir .");
            }else{
                System.out.println(num + " Asal sayıdır.");
            }
        }
    }




