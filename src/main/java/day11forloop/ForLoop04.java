package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        //example 5 ten8 e kadar sayılaı topla

        int sum=0;

        for(int i=5;i<9;  i++) {
                    sum = sum + i;
                }
            System.out.println(sum);//26

        // 7 den 9 kadar tam sayı çarpımı veren kod yaz

        int multiply=1;
        for (int i=7; i<10; i++) {
            multiply= multiply * i;
        }

        System.out.println(multiply);



    }

}