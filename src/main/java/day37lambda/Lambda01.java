package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    //Note: Her zaman bize verilen list ile islem yapamayabiliriz
//      Bunun icin IntStream methodunu kullaniriz.
//      rangeClosed(startInclusive, endInclusive) methodu bize
//      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
    public static void main(String[] args) {

        List<Integer> myList=new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println();
        System.out.println(getsumfromseventoseven(myList));
        System.out.println();
        System.out.println(getsumfromtreetoeit(myList));
        System.out.println();
        System.out.println(getsumfromtreetoeit2(myList));
        System.out.println();
        System.out.println(getfaktoriel(5));
        System.out.println();
        System.out.println(getSumOfEvenBetvenTwoint(10, 5));
        System.out.println();
        System.out.println(getsumofdijitsbeetwentwoints(12, 18));


    }
    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();
    }//rangeClosed==> baslangis ve bitis araligi veriyor Intstream==> integerlari yukardan asagi diziyor.
    // 2) 7 den 70 e tum tamsayıların toplamını veren kod

    public static int getsumfromseventoseven(List<Integer> myList){
       return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }
    // 3 ten 9 a kadar tam sayıların carpımı
    public static int getsumfromtreetoeit(List<Integer> myList){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }// yol 2
    public static int getsumfromtreetoeit2(List<Integer> myList) {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();

    }
    // 4 - size verilen sayının faktöriyelini hesaplayın
    public static int getfaktoriel(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("faktoriyel negatif sayılarla yapılamaz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

        }
        //5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvenBetvenTwoint(int a, int b){
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

            return IntStream.rangeClosed(a + 1, b).filter(Utils::isNumberEven).sum();
        }
        // 6.soru size verilen iki tamsayi arasındaki tüm tamsayıların
        // rakamları toplamını veren kodu yazınınz 12-18 ==> 13 14 15 16 17 ==>
        // rakamlari teker teker alip sonradan toplayacak streamdeki elemanlar degiscek bu yuzden reduce yerine map kullandik.
        public static int getsumofdijitsbeetwentwoints ( int a, int b){
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            return IntStream.range(a + 1, b).map(Utils::getsumofdijits).sum();
        }
    }//class

