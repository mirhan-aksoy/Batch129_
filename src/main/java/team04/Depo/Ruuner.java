package team04.Depo;

import java.util.Scanner;
import static team04.Depo.Depo.miktarGuncelle;
import static team04.Depo.Depo.urun;

public class Ruuner {

    public static void main(String[] args) {
        urun();
        menu();
        miktarGuncelle();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Urun Guncellemek Icin 1");
        System.out.println("Urunu Raf'a Koymak Icin 2");
        System.out.println("Urunu Cikisi Icin 3");
        System.out.println("Urunu Listesi Icin 4");
        System.out.println("Sistemden Cikis Icin 0");

        int select = sc.nextInt();
        System.out.println("----------------------------------------------------");

        switch (select) {
            case 1:
                miktarGuncelle();
                break;
            case 2:
                Depo.rafaKoy();
                break;
            case 3 :
                Depo.urunCikisi();
                break;
            case 4:
                Depo.urunListesi();
                break;

            case 0:
                System.out.println("Iyi Gunler.. ");
                break;
            default:
                System.out.println("Hatali Giris");
                break;
        }
    }
}