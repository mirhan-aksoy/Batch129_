package ssgGenel.ssgAralik30;


import java.util.Scanner;

public class Switch03 {

    // Ayakkabi Boyutu kontrol etmek için Java Programı
    // switch...case ifadesini kullanarak
    //Boyyutu icin size ler: small -Medium- Large- Extra -Large-unKnown-
    // 36 -38 ==>small 40-42-medium -- 43-46 -large 47-50 extral
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ayyakabi numarsi giriniz");
        int ayakkabiNumarsi = input.nextInt();

        String size =null;


        switch (ayakkabiNumarsi){
            case 34:
//                System.out.println("Small");
                size="small";
                break;
            case 38:
            case 39:
                System.out.println("medium");
                break;
            case 40:
            case 41:
                System.out.println("Large");
                break;
            case 46:
                System.out.println("Extar large");
                break;

            case 50:
                System.out.println("unknown");
                break;

            default:
                System.out.println("lutfen Gecerli bir aykkabi numarsi Girniz");

        }
        System.out.println(size);
    }
}