package QAteam04;

import java.util.Scanner;

public class TasKagıt2 {
    public static void main(String[] args) {
         /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Can Game Tas,Kagit,Makas Oyununa Hosgeldiniz");
        System.out.println("Oyundan cikmak icin '00' basiniz");
        System.out.println("Lutfen birini seciniz= \nTas   icin : 1   \nKagit icin : 2  \nMakas icin : 3");
        do {
            int gamer = input.nextInt();
            int canGame = (int) (Math.random() * 3+1);
            if (gamer == 00) {
                System.out.println("Oyunu bitirdiniz");
                break;
            } else if (gamer == 1) {
                System.out.println("Tas");
            } else if (gamer == 2) {
                System.out.println("Kagit");
            } else if (gamer == 3) {
                System.out.println("Makas");
            } else if (gamer < 1 || gamer > 3) {
                System.out.println("Lutfen 1 ve 3arasinda karakter giriniz");
                continue;
            }
            if (canGame < 1) {
                continue;
            }
            System.out.println(canGame);
            if (canGame == 1) {
                System.out.println("Tas");
            } else if (canGame == 2) {
                System.out.println("Kagit");
            } else if (canGame == 3) {
                System.out.println("Makas");
            } else if (canGame < 1) {
                continue;
            }
            if ((gamer == 1) && (canGame == 1) || (gamer == 2) && (canGame == 2) || (gamer == 3) && (canGame == 3)) {
                System.out.println("BERABERE");
            } else if ((gamer == 1) && (canGame == 2) || (gamer == 2) && (canGame == 3) || (gamer == 3) && (canGame == 1)) {
                System.out.println("KAYBETTINIZ");
            } else if ((gamer == 1) && (canGame == 3) || (gamer == 2) && (canGame == 1) || (gamer == 3) && (canGame == 2)) {
                System.out.println("KAZANDINIZ");
            }
        } while (true);
    }
}