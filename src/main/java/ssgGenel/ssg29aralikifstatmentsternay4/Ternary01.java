package ssgGenel.ssg29aralikifstatmentsternay4;

public class Ternary01 {
    public static <object> void main(String[] args) {

//verilen sayi 100'den buyukse sayi’nin karesini  alip yazdiran
        // 100'den kucukse ” sayi 100'den buyuk olmali” yazdiran
        // bir ternary olusturalim

                 int sayi = 120;

        System.out.println(sayi>100 ? sayi*sayi :"sayi 100 en buyuk olmali");

        Object str= sayi>100 ? sayi*sayi : "sayi yüzden buyuk olmali";
        System.out.println(str);

        int num= sayi>100 ?sayi*sayi: sayi;
        System.out.println(num);

    }
}
