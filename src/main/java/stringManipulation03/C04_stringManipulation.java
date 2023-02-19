package stringManipulation03;

public class C04_stringManipulation {
    public static void main(String[] args) {
        /*soru 4)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        */

        String isim1="ahmet furkan";
        String isim2="ömer faruk";
        String isim3="ayse nur ";
        String deneme =isim3.trim();
        System.out.println(deneme);

        int a1=isim1.replaceAll("\\s","").length();
        int a2=isim2.replaceAll("\\s","").length();
        int a3=isim3.replaceAll("\\s","").length();
        System.out.println("toplam bosluksuz karakter sayısı : "+(a1+a2+a3));

    }
}