package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Tekrar {
    public static void main(String[] args) {

        List<Integer> nums  =  new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elementyazdir(nums);
        System.out.println();
        ikiyebolunenelementler(nums);
        System.out.println();
        teksayikareleri(nums);
        System.out.println();
        System.out.println(ciftSayilarinKareleriTopla(nums));
        System.out.println();
        ciftkarecarptopla(nums);
        System.out.println();
        enbuyukdeger(nums);
        System.out.println();
        yedidenbuyukcift(nums);


    }
    // 1)  Bir  list'teki  elemanlarını  ayni  satirda  aralarina  bosluk  yönlerinde  yazdiran  method'u  olusturunuz.
public static void elementyazdir(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t+" "));

}
// 2)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ikiyebolunenelementler(List<Integer> nums){
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
    // 3)//  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void teksayikareleri(List<Integer> nums){
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //4) çift sayıların karelerini toplayınız
    public static Integer ciftSayilarinKareleriTopla(List<Integer> nums){
        return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);

    }
    //8 farklı çift lerin karelerinin carpımı hesapla

    public static void ciftkarecarptopla(List<Integer> nums){
        Integer product = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1, (t,u)->t*u);
        System.out.println(product);
    }
    // enbüyük degeri bulunuz
    public static void enbuyukdeger(List<Integer> nums){
       Integer max= nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println(max);
    }
    //11 7 den buyuk en kucuk cift

    public static void yedidenbuyukcift(List<Integer> nums){
      Integer buyuk= nums.stream().distinct().filter(t->t>7 && t%2==0).sorted().reduce((t, u)->t).get();
        System.out.println(buyuk);
    }



}
