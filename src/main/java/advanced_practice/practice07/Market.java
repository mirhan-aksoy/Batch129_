package advanced_practice.practice07;

import java.time.LocalDate;


public class Market {
    String urunAdi;
    Double urunfiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra){
        this.urunAdi = urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunfiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    Market(String urunAdi, double fiyat){
        this.urunAdi = urunAdi;
        if(fiyat>99){
            fiyat=fiyat*0.9;
        }
        urunfiyati = fiyat;
        sonKullanmaTarihi = "Bu ürünün son kullanma tarihi yoktur";
    }

    public Market() {

    }


    @Override
    public String toString() {
        return "Market{" +
                "ürünAdi='" + urunAdi + '\'' +
                ", ürünfiyati=" + urunfiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}