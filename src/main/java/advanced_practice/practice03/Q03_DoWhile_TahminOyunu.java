package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rastgelleSayi = (int) (Math.random()*101);
        System.out.println("0-100 arası(dahil) bir tamsayı giriniz");
        int sayi;
        int sayac = 10;

        do {
            sayac--;
            sayi = input.nextInt();

            if(sayi<rastgelleSayi){
                System.out.println(sayac+" hakkınız kaldı");
                System.out.println("Daha büyük bir sayı giriniz");

            } else if (sayi>rastgelleSayi) {
                System.out.println(sayac+" hakkınız kaldı");
                System.out.println("Daha küçük bir sayı giriniz");

            }else {
                System.out.println("Tebrikler!!! "+(10-sayac)+" tahminde sayiyi buldunuz. Puaniniz: "+(sayac+1)*10);
            }
            if(sayac == 0){
                System.out.println("Hakkınız bitti");
                //Ödev: Yeniden oynama hakkı ...
                break;
            }

        }while (sayi!=rastgelleSayi);

    }
}