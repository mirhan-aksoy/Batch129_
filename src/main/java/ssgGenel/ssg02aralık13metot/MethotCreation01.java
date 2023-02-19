package ssgGenel.ssg02aralık13metot;

public class MethotCreation01 {

    public static void hosgeldinizssgdersleriyazdir() {
        System.out.println("hos geldiniz");
    }

    public static void isimvesoyisim(String isim, String soyisim) {
        System.out.println(isim + " " + soyisim);
    }

    public static void Stringyazdir() {
        System.out.println("iki sayiyi bölme yapınız");
    }

    public static void kapanmametodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }


        public static void main (String[]args){

            hosgeldinizssgdersleriyazdir();
            isimvesoyisim("ali", "can");
            isimvesoyisim("mehmet", "aksoy");
            Stringyazdir();
            Calculator.bolme(100, 5);
            kapanmametodu();

        }

}
