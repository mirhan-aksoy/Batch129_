package day12forloopwhileloop;


public class WhileLooppratic {
    public static void main(String[] args) {
        // 1 il 10 arası sayıları yazddır
        for (int i = 1; i <11 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();

        // 1 il 10 arası sayıları yazddır
        int k = 1;
        while (k <11) {
            {
                System.out.print(k + " ");
            }
            k++;
        }
        System.out.println();
        // 40 il 23 arası çift sayıları yazddır
        int m=40;
        while (m>22) {
            if (m % 2 == 0) {
                System.out.print(m + " ");
            }
            m--;
        }
        System.out.println();
        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int say=654;
        int rkt=0;
        while (say>0){
            rkt=rkt+say%10;
            say=say/10;}
        {
        System.out.println(rkt);

        }

    }
}
