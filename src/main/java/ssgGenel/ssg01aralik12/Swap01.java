package ssgGenel.ssg01aralik12;

public class Swap01 {
    public static void main(String[] args) {
        int s1=10;
        int s2=20;
        System.out.println("swap oncesi sayı1="+s1+" s2="+s2);

        int temp=s1;
         s1=s2;
         s2=temp;
        System.out.println("swap sonrasi sayı1="+s1+" s2="+s2);

        s1=s1+s2;
        s2=s1-s2;
        s1=s1-s2;
        System.out.println("swap sonrası sayı1="+s1+" s2"+ s2);





    }
}
