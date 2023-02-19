package advanced_practice.practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {
    // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        String karar;
        int sayac=0;

        //Kullanıcıdan istediği kadar not girmesini iste
        do {
            sayac++;
            System.out.println(sayac+". notu giriniz");
            notlar.add(input.nextDouble());
            System.out.println("Çıkmak için H, yeniden not girmek için herhangi başka bir karakter giriniz");
            karar = input.next();

        }while (!karar.equalsIgnoreCase("H"));
        System.out.println("notlar = " + notlar);

        //Ortalamayı hesapla
        double toplam = 0;
        for(double w : notlar){
            toplam += w;
        }

        double ortalama = toplam/notlar.size();
        System.out.println("ortalama = " + ortalama);

        //Ortalama üstü not sayısını bul
        int ortalamaUstuNotSayisi = 0;
        for(double w : notlar){
            if(w>ortalama){
                ortalamaUstuNotSayisi++;
            }
        }
        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);

    }
}