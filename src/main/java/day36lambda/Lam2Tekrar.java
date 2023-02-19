package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Lam2Tekrar {
    public static void main(String[] args) {


        List<String>list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");


        System.out.println();
        tekrarsizbuyukalfabetik(list);
        System.out.println();
        tekrarsizkucukharfters(list);
        System.out.println();
        tekrarsizkucukharfuzunluksirala(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        System.out.println(bestenBuyukOlanlar(list));
        System.out.println(kareal(list));
        System.out.println(karaktercift(list));


    }//1) ELEMANLARINYARINISI BULAK İÇİN METOT OLUSTURUNUZ . (TEKRARSIZ 5 TEN BÜYÜK ELEMANLARI LİST İÇİNDE YAZAN)


     //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void tekrarsizbuyukalfabetik(List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t+" "));

    } //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz

    public static void tekrarsizkucukharfters(List<String> list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));

    }//Example 4: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz

    public static void tekrarsizkucukharfuzunluksirala(List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));

    }//Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }// 5) 2.yol ile çözüm

        public static void printAllSortWithLastCharUpperDistinct2(List<String> list){
            list.stream().
                    distinct().
                    map(String::toUpperCase).
                    sorted(Comparator.comparing(Utils::getLastChar).
                            reversed()).
                    forEach(Utils::printInTheSameLineWithSpace);


    } //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yazdiriniz
    //           Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    // "method reference" class'in icindeki methodu adresle demek

    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){
        list.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).forEach(System.out::println);

    }
    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz ve sonucu list olarak yazdiriniz

    public static List<String> bestenBuyukOlanlar(List<String> list){
        list.removeIf(t -> t.length() > 5);
        return list;

    }
    //5 ten kucuklerin karesini al
    public static List<Integer> kareal(List<String> list){
      return   list.stream().map(t->t.length()*t.length()).collect(Collectors.toList());
    }
    //karakter saısı çift olanları yazdır

    private static List<String> karaktercift(List<String> list){
        list.stream().filter(t->t.length()%2==0).collect(Collectors.toList());
        return list;

    }









}
