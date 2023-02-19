package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TekrarLambda {
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

        printSquareOfOddElements(nums);
        System.out.println();
        PrintQofDisdinceOdelement(nums);
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
        getMinGreaterThanSevenEven(nums);




    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional
    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak
    //  ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void PrintQofDisdinceOdelement(List<Integer> nums){

        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));


    }
    //7 çift sayıların karesini topla

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){

       Integer toplam=nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t, u)->t+u);
        System.out.println(toplam);
    }
    //8 farklı çift lerin karelerinin carpımı hesapla
    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
       Integer carpim= nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }
    //9 en büyük degeri bulun
    public static void getMaxValue1(List<Integer> nums){
      Integer max=  nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)->t>u?t:u);
        System.out.println(max);
    }
// elemanlarda ilk elemanı en kucuk atadım ama fazla iş
    public static void getMaxValue2(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }
    public static void getMaxValue3(List<Integer> nums) {
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }
    //10
    public static void getMinValue1(List<Integer> nums){
       Integer min= nums.stream().distinct().reduce((t, u)->t>u ? u:t).get();
        System.out.println(min);
    }
    //10 2.)yol
    public static void getMinValue2(List<Integer> nums){
        Integer min= nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }
    //3.)yol
    public static void getMinValue3(List<Integer> nums){
        Integer min=nums.stream().distinct().sorted().reduce((t, u)->t).get();
        System.out.println(min);
    }
    //4. yol
    public static void getMinValue4(List<Integer> nums){

      Integer min= nums.stream().distinct().reduce((t, u)->Math.min(t, u)).get();
        System.out.println(min);
    }

    //11 7 den buyuk en kucuk cift
    public static void getMinGreaterThanSevenEven(List<Integer> nums){
     Integer ybekc=   nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t, u)->t).get();
        System.out.println(ybekc);
    }







}
