package ssgGenel.ssgAralik30;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        //  int ayNo=input.nextInt();
        String ayIsmi= input.next().toLowerCase();

//// ay numarsi
//        switch (ayNo){
//
//            case 12 :
//            case 1 :
//            case 2 :
//                System.out.println("Kis");
//                break;
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Ilkbahar");
//                break;
//            case 6 :
//            case 7 :
//            case 8 :
//                System.out.println("Yaz");
//                break;
//            case 9 :
//            case 10 :
//            case 11 :
//                System.out.println("Sonbahar");
//                break;
//
//            default :
//                System.out.println("Luften Gecerli bir ay numarsi Giriniz");
//        }

        // ay ismi

        switch (ayIsmi) {
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("Gecerli ay giriniz.");

        }



    }
}

