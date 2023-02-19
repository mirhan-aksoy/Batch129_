package team04.EmreotoKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArabaVeMusteriBilgisi extends AracIsteme {

    static List<AracIsteme> aracTalepListesi = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int kiralanacakGunSayisi;

    public static void bannerYap() {
        System.err.println("      *********     ******         *             *      *               *****          *****                           " +
                "\n          *         *            *   *         *   *  *   *           *       *              *                         " +
                "\n          *         ****        * * * *       *      *     *   ***    *       *          ****                          " +
                "\n          *         *          *       *     *              *         *       *              *                         " +
                "\n          *         ******    *         *   *                *          *****          *****                            " +
                "\n  =====================================================================================================================" +
                "\n  ***** TEAM 03 Rent a Car'a hosgeldiniz. Kaliteli araclarimiz ve uygun fiyatlarimiz ile sizlerin hizmetinizdeyiz *****\n" +
                "  =====================================================================================================================");
    }

    public static void aracTalepEt() {

        System.out.println("\nLutfen araci alacaginiz sehri birlesik olarak yaziniz");
        String alinacakSehir = scanner.next();


        System.out.println("Lutfen araci alacaginiz gunu yaziniz (Ornek 02.05): ");
        String alinacakGun = scanner.next();

        System.out.println("Lutfen alis saatini yaziniz (Ornek 15:00): ");
        String alisSaati = scanner.next();

        System.out.println("Lutfen araci teslim edeceginiz gunu yaziniz (Ornek 12.05): ");
        String teslimGunu = scanner.next();

        System.out.println("Lutfen araci teslim edeceginiz saati yaziniz (Ornek 12:00): ");
        String teslimSaati = scanner.next();

        //burda bilgileri verecegimiz ekrani hazirliyoruz
        System.out.println("\033[33m \n ********************************************** \033[0m");

        String aGun = alinacakGun.substring(0, 2); //12.05 string
        int intAGun = Integer.parseInt(aGun);

        String aAy = alinacakGun.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println(" Alis tarihi  : " + intAGun + "." + intAAy); // 12.05 int

        String tGun = teslimGunu.substring(0, 2); //15.05
        int intTGun = Integer.parseInt(tGun);

        String tAy = teslimGunu.substring(3);
        int intTAy = Integer.parseInt(tAy);
        System.out.println(" Teslim tarihi: " + intTGun + "." + intTAy); // 15.05


        // Simdi alis tarihini teslim gununden once olmesini engelliyoruz
        if ((intAAy == intTAy && intAGun > intTGun)) {
            System.out.println("Araci aldiginiz gun teslim tarihinden sonra olamaz");
            aracTalepEt(); // burda kullanicin tekrar giris yapmasini sagliyoruz
            return;

        } else if (intAAy > intTAy) {
            System.out.println("Araci aldiginiz ay teslim tarihinden sonra olamaz");
            aracTalepEt();
            return;


        } else {

        }
        System.out.println("\033[33m ********************************************** \033[0m");
        kiralanacakGunSayisi = (intTAy - intAAy) * 30 + (intTGun - intAGun);
        System.out.println("\033[36m      Arac toplam " + kiralanacakGunSayisi + " gün kiralanacaktir. \033[0m");

        System.out.println("\033[33m ********************************************** \033[0m");


    }

    private static void getAraba() {
    }

    // Simdi arabalari isteyecegiz
    public static void arabaOzellikleri() {

        AracIsteme mercedesMaybach = new AracIsteme("MERCEDES", "maybach", "Diesel", "Automatic", 250);
        AracIsteme audi = new AracIsteme("AUDI", "R8", "Diesel", "Automatic", 350);
        AracIsteme teslaModelY = new AracIsteme("TESLA", "Model Y", "Electric", "Automatic", 150);
        AracIsteme bmwX5 = new AracIsteme("BMW", "X5", "Essence", "Manuel", 100);
        AracIsteme bmwI3 = new AracIsteme("BMW", "I3", "Electric", "Automatic", 130);
        AracIsteme renaultZOE = new AracIsteme("RENAULT", "ZOE", "Electric", "Automatic", 75);
        AracIsteme citroenC5 = new AracIsteme("Citroen", "C5", "Essence", "Manuel", 90);

        // Bu araclari olusturdugumuz arac listesine ekliyoruz
        aracTalepListesi.add(mercedesMaybach);
        aracTalepListesi.add(audi);
        aracTalepListesi.add(teslaModelY);
        aracTalepListesi.add(bmwX5);
        aracTalepListesi.add(bmwI3);
        aracTalepListesi.add(renaultZOE);
        aracTalepListesi.add(citroenC5);

        System.out.println("\033[34m \n***** **** *** ** * Arac talep listesi * ** *** **** ***** \033[0m");
        System.out.println("\nLutfen talep ettiginiz aracin liste numarasini yaziniz\n" +
                "\n L.N - Marka   - Model    - Yakit    -  Vites    - Gunluk Ucret"+
                "\n 1.   MERCEDES - MayBach  - Diesel   - Automatic -     €250" +
                "\n 2.   AUDI     - R8       - Diesel   - Automatic -     €350" +
                "\n 3.   TESLA    - Model Y  - Electric - Automatic -     €150" +
                "\n 4.   BMW      - X5       - Essence  - Manuel    -     €100" +
                "\n 5.   BMW      - I3       - Electric - Automatic -     €130" +
                "\n 6.   RENAULT  - ZOE      - Electric - Automatic -     € 75" +
                "\n 7.   CITROEN  - C5       - Essnce   - Manuel    -     € 90");

        int secim = 0;
        try {
            secim = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (secim) {
            case 1:

                int odenecekMiktar1 = kiralanacakGunSayisi * 250;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar1);
                islemeDevamEt();
                break;
            case 2:

                int odenecekMiktar2 = kiralanacakGunSayisi * 350;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar2);
                islemeDevamEt();
                break;
            case 3:

                int odenecekMiktar3 = kiralanacakGunSayisi * 150;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar3);
                islemeDevamEt();
                break;
            case 4:

                int odenecekMiktar4 = kiralanacakGunSayisi * 100;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar4);
                islemeDevamEt();
                break;
            case 5:

                int odenecekMiktar5 = kiralanacakGunSayisi * 130;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar5);
                islemeDevamEt();
                break;
            case 6:

                int odenecekMiktar6 = kiralanacakGunSayisi * 75;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar6);
                islemeDevamEt();
                break;
            case 7:

                int odenecekMiktar7 = kiralanacakGunSayisi * 90;
                System.out.println("\033[32m Odenecek Miktar € \033[0m" + odenecekMiktar7);
                islemeDevamEt();
                break;
            default:
                System.err.println("Talep ettiginiz arac listemizde bulunmamaktadir\nLutfen listemizde olan araclardan birini seciniz");

                arabaOzellikleri();


        }


    }

    private static void islemeDevamEt() {
        System.out.println("\033[35m Isleme devam etmek icin 'E´ye \n Islemi sonlandirmak icin 'H´ye basiniz. \033[0m");

        String devamMi = scanner.next();
        if (devamMi.equalsIgnoreCase("E")) {
            System.out.println("Ilerlemek icin lutfen Istenen bilgileri giriniz");

            musteriBilgisi();


        } else if (devamMi.equalsIgnoreCase("H")) {   /// kod burda else if blogunu es geciyor
            System.out.println("*** ** * Yine bekleriz * ** ***");
            System.exit(0);

        }

    }


    public static void odemeBilgileri() {
        System.out.println("\033[32m Lutfen 12 haneli kart numaranizi giriniz \033[0m");

        String kartNumarasi = scanner.next();


        if (!(kartNumarasi.length() == 12)) {
            System.out.println("\033[31m               Gecersiz bir kart numarasi girdiniz.\n                        Tekrar deneyiniz \033[0m");
            odemeBilgileri();
            return;
        } else {
            System.out.println("\033[34m                                   Gecerli bir kart numarasi girildi \033[0m");

        }
        System.out.println("\033[34m             ***** **** *** ** * Odemeniz basari ile gerceklestirildi * ** *** **** ***** \033[0m");
        System.out.println("    " +
                "\n  *****************************************************************************************************************" +
                "\n  *     * Lutfen araci teslim tarihi ve saatinden once teslim ediniz aksi takdirde extra ucretlendirme olacaktir  *" +
                "\n  *           * Bizi tercih ettiginiz icin TESEKKUR EDER yine bekleriz                                            *" +
                "\n  *           * Ihtiyac halinde asagidaki iletisim adreslerinden bize ulasabilirsiniz                             *" +
                "\n  *           * team03@team03@outlook.fr                                                                          *" +
                "\n  *           * +33 09 12 34 56 78                                                                                *" +
                "\n  *****************************************************************************************************************");
    }

    static void musteriBilgisi() {



        System.out.println("\033[33m ************************************ \033[0m");


        System.out.println("Lutfen adinizi giriniz");
        String ad = scanner.next();

        System.out.println("Lutfen soyadiniz giriniz");
        String Soyad = scanner.next();

        System.out.println("Lutfen ID'nizi giriniz");
        String id = scanner.next();

        System.out.println("Lutfen telefon numaranizi giriniz");
        String tlf = scanner.next();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("\033[33m **************************************** \033[0m");
        System.out.println(" Ad Soyad : " + ad +" "+ Soyad +
                "\n        ID: " + id +
                "\n   Telefon: " + tlf +
                "\n       Yas: " + yas +
                "\n\033[33m  **************************************** \033[0m");

    }


}