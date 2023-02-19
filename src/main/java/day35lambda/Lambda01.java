package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    ForEach:
    Stream içindeki veriyi tek tek tüketmekiçin oluşturulmuş bir yapıdır.
     **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
    artık kullanılamayacağı anlamına gelir.
    Filter:
    Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır
    Collect:
    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
    veri yapısına dönüştürmek için kullanılır.
            Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayan
    Distinct:
    Stream içerisinde bulunan ve tekrar eden elemanlar varsa
    bunları distinct metodu ile çıkartabilir ve
    elimizde tekrar etmeyen birbirinden farklı
    elemanlar barından bir veri setimiz kalır
    Sorted:
    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
            2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
    İkinci formatı ise Comparator arayüzünden türediği için
    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.
    reduce : indirgeme demektir.
    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
    bir sonraki elemanla işlemle tutulur
    Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
    Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
    değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;
    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.
            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.
            NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.
            Limit
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
    sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
    Stream içerisinde dönen çok sayıda veri var
    ancak sen bize şu kadarını göster diyoruz.
            findFirst() => İlk elemanı verir. Bu akışın ilk elemanını açıklayan bir
    İsteğe bağlı veya akış boşsa boş bir İsteğe bağlı döndürür.
    Akışın karşılaşma sırası yoksa herhangi bir öğe iade edilebilir. Optional return eder.
    // Arraylerde Stream kullanabilmek icin 2 yol vardir
    1) Stream <Integer> isim=StreamOf(cevrilecek olan)
    2) Arrays.stream(arr).
    Count
    Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.
    split() => Bu String öğesini verilen normal ifadenin eşleşmelerine böler.
    Bu yöntem, iki bağımsız değişkenli bölünmüş yöntemi verilen ifade ve sıfır
    sınır değeriyle çağırır gibi çalışır.
    Sondaki boş dizeler bu nedenle sonuç dizisine dahil edilmez.
            Comparator => bir Class’tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
            Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
    sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
    Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
    sırasını kontrol etmek veya doğal sıralaması olmayan
    nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.
            reverseOrder() => Comparator Class’ının bir methodudur.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
            comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.
    skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından
    oluşan bir akış döndürür.
    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
    Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List’in uzunluğunun 1 eksiğini yazarsak son elemanı



            1)Lambda "Functional programming" dir, digeri "Structured Programming"
            2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir
             "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
            3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
            4)Lambda, Java'ya "Java 8"de eklendi.
    
            "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
            "filter()" filtrelemek icin kullanilir.
            "map()" u var olan elemani degistirmek icin kullanilir.
            "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
             Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
            "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
             Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri
             toplamanin sonucundan alir. "u" ise degerlerini her zaman "stream" den alir.
             get()==> methodu "optional data type"ini "Integer"a cevirir.
        */
        
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMinValue1(nums);
        System.out.println();
        getMinValue2(nums);
        System.out.println();
        getMinValue3(nums);
        System.out.println();
        getMinValue4(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums){
        for(Integer w : nums){
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums){
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums){
        for(Integer w : nums){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums){
        nums.//12 9 131 14 9 10 4 12 15
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t + " "));
    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSquareOfOddElements(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    // çift sayıların karesini topla
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum = nums.stream().
                distinct().filter(t->t%2==0).
                map(t->t*t).
                reduce(0, (t, u)->t+u);
        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    //8 farklı çift lerin karelerinin carpımı hesapla
    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
        Integer product = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1, (t,u)->t*u);
        System.out.println(product);
    }

    //9)Create a method to find the "maximum value" from the list elements
    //1.Yol://9 en büyük degeri bulun
    public static void getMaxValue1(List<Integer> nums){
        //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel partiktir.
        //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel partiktir.
        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);
        System.out.println(max);
    }
    //2.Yol:
    public static void getMaxValue2(List<Integer> nums){
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t,u)->t>u ? t : u);
        System.out.println(max);
    }

    //3.Yol:
    public static void getMaxValue3(List<Integer> nums){
        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements
    //1.Yol:// minimum elemanı bulan method u yazınız
    public static void getMinValue1(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->t>u ? u : t).get();
        System.out.println(min);
    }

    //2.Yol:
    public static void getMinValue2(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }

    //3.Yol:
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }

    //4.Yol:
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);
    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer min = nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }

}