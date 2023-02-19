package ssgGenel.ssg02aralık13metot;

public class School {

    //class member =degişkenler ve methotlar
        String okulismi = "Yildiz koleji";
        boolean isactive = true;
        int yil = 2002;


        public static   void okulismiyazdir(String okulismi) {
            System.out.println(okulismi);
        }
        public int zaman(int yil){
            return yil;
        }
        public boolean isactive(boolean isactive){
            return isactive;
        }


}
