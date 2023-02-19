package ssgGenel.ssg02aralık13metot;

public class schoolRunner {
    public static void main(String[] args) {

        School obj=new School();
        System.out.println(obj.isactive);
        System.out.println(obj.yil);
        System.out.println(obj.okulismi);



        School.okulismiyazdir("ege");
        System.out.println(obj.zaman(2023));

        System.out.println(obj.isactive(false));

        System.out.println(Calculator.cikarma(40, 23));
        System.out.println(Calculator.cikarma(63, 40));


    }


}
