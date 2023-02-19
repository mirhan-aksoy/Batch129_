package stringManipulation03;

public class C03_stringManipulation {
    public static void main(String[] args) {
        /*
        Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
        */
        String str="JAVA BUYUK dunya kucuk";
        str=str.toLowerCase();

        if ((str.contains("buyuk"))&&(str.contains("kucuk"))){
            System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");

        } else if (str.contains("kucuk")) {
            System.out.println(str.toLowerCase());

        } else if (str.contains("buyuk")) {
            System.out.println(str.toUpperCase());

        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


    }
}