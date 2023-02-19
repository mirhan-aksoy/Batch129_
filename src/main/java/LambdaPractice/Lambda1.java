package LambdaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda1 {
    //reduce methodu terminal methoddur.
//Bir methoddan sonra hicbir islem yapilamiyorsa buna terminal method denir.

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        ciftVePozitifLamExYazdir(sayi);
        System.out.println("\n ********************");
        ciftvePozitifMetRef(sayi);
        System.out.println("\n ********************");
        kareYazdir(sayi);
        System.out.println("\n ********************");
        kareTekrarsiz(sayi);
        System.out.println("\n ********************");
        buyuktenKucugeSirala(sayi);
        System.out.println("\n ********************");
        pozitifkupbirlerbes(sayi);
        System.out.println();
        System.out.println("******************");
        toplamMetRef(sayi);
        System.out.println("*******************");
        toplamLambdaExp(sayi);
        System.out.println("*******************");
        System.out.println(pozCarpBulLamEx(sayi));
        System.out.println("*****************");
        System.out.println(ciftkaresirala(sayi));


    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0 && t>0).
                forEach(t-> System.out.print(t+" "));

    }

        //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
        
    public static  void ciftvePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);

    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi){

        sayi.stream().map(Utils::kareAl).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().distinct().map(Utils::kareAl).forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyuktenKucugeSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifkupbirlerbes(List<Integer> sayi) {
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }
    // SORU 7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc= sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
    }
// SORU 8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
public static void toplamLambdaExp(List<Integer> sayi){
       Integer toplam= sayi.stream().reduce(0,(t,u)->t+u);
    System.out.println(toplam);
}
//SORU9 : Listin pozitif elemanlarının, carpımını
// Lambda Expression ile return ederek yazdırın
public static int pozCarpBulLamEx(List<Integer> sayi) {
    int carpim = sayi.stream().filter(t -> t > 0).reduce(1, (t, u) -> t * u);
    return carpim;
}
//SORU10 : Listin cift elemanlarının, karelerini,
// kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftkaresirala(List<Integer> sayi){

        return sayi.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());
    }








}