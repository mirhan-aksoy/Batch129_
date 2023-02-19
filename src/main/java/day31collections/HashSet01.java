package day31collections;

import java.util.HashSet;

public class HashSet01 {

        /*HashSet, Java'da bir veri yapısıdır. Bu yapı, bir küme olarak düşünülebilir
         ve içinde saklanan elemanlar benzersiz olmalıdır.
         HashSet, HashMap yapısına benzer şekilde çalışır ve
         elemanların benzersizliğini sağlamak için hash kodları kullanır.
         Bu yapı, arama, ekleme ve silme işlemlerini hızlı bir şekilde
          gerçekleştirmek için tasarlanmıştır.

        "Hash" bir tekniktir, Java bu tekniği kullanarak benzersiz datalar üretir.
        "Set" tekrarsız data depolamak icin kullanilan bir Collection'dir.
         Set tekrar kabul etmez. Yani; tekrarsız verileri depolamak için kullanılır.
        "Set" ler 3 e ayrilir;
            i)HashSet: a) Super hizlidir, cunku HashSet'ler veridiginiz elemanlari siralamak icin zaman kaybetmez
                          yani; HashSet'lere eklenen elemanlar rastgele siralanirlar.
                       b)HashSet'ler tekrarli elemana musaade etmezler.
                       c)HashSet'ler sadece 1 tane "null" i eleman olarak kabul ederler.
            ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order"(veriliş sırası -tek tek) a gore dizer.
                              b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icin, HashSet'e gore yavastir.
                              c)LinkedHashSet'ler tekrarli elemana musaade etmezler.
            iii)TreeSet: a)TreeSet elemanlari "natural order"(Kucukten buyuge veya alfabetik sira) a gore dizer.
                         b)TreeSet, "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
                         c)TreeSet'ler tekrarli elemana musaade etmezler.
     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);// [5, 234, 12, 78] ==> Gordugunuz gibi elemanlar rastgele siralandi
        int hc = hs.hashCode();
        System.out.println(hc);//329

    }

}








