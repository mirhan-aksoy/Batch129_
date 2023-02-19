package team04.Depo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Depo {

    static Map<Integer, UrunBilgi> urunler = new HashMap<>();
    static Set<Map.Entry<Integer, UrunBilgi>> setUrunler = urunler.entrySet();
    static Scanner scan = new Scanner(System.in);
    Ruuner ruuner =new Ruuner();
    public static void urun() {

        urunler.put(1000, new UrunBilgi("Seker", "Hekimoglu", 3, "Cuval", "null"));
        urunler.put(1001, new UrunBilgi("Tuz", "Hekimoglu", 0, "Cuval", "null"));
        urunler.put(1002, new UrunBilgi("Baharat", "Hekimoglu", 8, "Cuval", "null"));
        urunler.put(1003, new UrunBilgi("Gofret", "Hekim", 16, "Kutu", "null"));
        urunler.put(1004, new UrunBilgi("Biskuvi", "Hekim", 7, "Kutu", "null"));

        System.out.println("\t                     *** Urunlerimiz ***                    \n" +
                "ID    ISMI       URETICISI   MIKTARI     BIRIMI     RAF ");
//        for (Map.Entry<Integer, UrunBilgi> each : setUrunler) {
//            Integer eachKey = each.getKey();
//            String eachValue = each.getValue(urunler);
//            String[] eachValueArr = eachValue.split(", ");
//            System.out.printf("%-4s   %-10s    %-20s  %-5s    %-7s    %-7s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2],
//                    eachValueArr[3],eachValueArr[4] );

        System.out.println(urunler);

    }

    public static void miktarGuncelle(){

        System.out.println("Miktar Guncellenecek ID : ");
        int id = scan.nextInt();
        if (urunler.keySet().contains(id)){
            System.out.println("Guncel Miktarinizi Giriniz");
            int guncelMiktar=scan.nextInt();
            urunler.get(id).setMiktar(guncelMiktar+urunler.get(id).getMiktar());
            System.out.println("MIktar guncellendi");
            Ruuner.menu();
        }else System.out.println("Aradiginiz urun yok");
    }

    public static void urunCikisi(){
        System.out.println("Cikis Yapacak Urun ID : ");
        int exId = scan.nextInt();
        if (urunler.keySet().contains(exId)){
            System.out.println("Cikacak Miktarinizi Giriniz");
            int guncelMiktar=scan.nextInt();
            if (guncelMiktar>urunler.get(exId).getMiktar()){
                System.out.println("Stokta olan"+urunler.get(exId).getMiktar() +" miktardan  daha buyuk cikis yapamazsiniz..");
                urunCikisi();
            }
            urunler.get(exId).setMiktar(guncelMiktar-urunler.get(exId).getMiktar());//deger sifirin altina dusmemeli
            System.out.println("MIktar guncellendi");
            Ruuner.menu();
        }else System.out.println("Aradiginiz urun yok");
    }

    public static void urunListesi(){
        System.out.println("----------- Urun Listesi -----------");
        System.out.println(urunler);
        Ruuner.menu();
    }

    public static void rafaKoy() {
    }

}