package advanced_practice.practice11.abstaction_alan_hesaplama;

public class AbstractionRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5,4));
        System.out.println(dikdortgen.alanHesapla(7,4));


        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(6,2));
        System.out.println(ucgen.alanHesapla(10,5));

    }



}