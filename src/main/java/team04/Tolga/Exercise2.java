package team04.Tolga;

import java.util.Scanner;

public class Exercise2 {

    //Example :ATM para cekme, yatirma ve tanimlanan bir ibana para transfer etme.
    public static void main(String[] args) {

               /*
           -Iki tane ismim olacan bunlar "Tom Hanks" ve"Ali Can"
        -Bakiye görüntülemek için --1
        -Para çekmek için --2
        -Farkli hesaba para yatırmak için --3
                 */
        Scanner input=new Scanner(System.in);

        String islemSecenekleri="Bakiye goruntuleme -->1"+
                "Para cekme -->2"+
                "Farkli hesaba havale icin -->3";

        double tomBakiye=2450;
        String tomIBAN="TR:1345 000 767 985 345 6972 76 45";
        String tomKullanici="tom12";
        String tomSifre="123";

        double aliBakiye=1250;
        String aliIBAN="TR:1345 4356 656 985 987 6972 76 45";

        System.out.println("Hosgeldiniz");
        System.out.println("Lutfen bilgilerinizi giriniz");

        System.out.print("Kullanici adini giriniz");
        String kullaniciAdi=input.nextLine();

        System.out.print("Sifrenizi giriniz");
        String sifre=input.nextLine();

        if(kullaniciAdi.equals("tom12")&&sifre.equals("123")){
            System.out.println("Tom Hanks hesabina giris yapildi");
            System.out.println(islemSecenekleri);

            System.out.println("Lutfen bir secim yapiniz :");
            String secim=input.nextLine();

            switch(secim){
                case "1":
                    System.out.println("Bakiyeniz :"+ tomBakiye);
                    break;

                case "2":
                    System.out.println("Cekmek istediginiz tutari giriniz");
                    int cekilecekTutar=input.nextInt();
                    if(tomBakiye>=cekilecekTutar){
                        tomBakiye -=cekilecekTutar;
                        System.out.println("Kalan tutar:"+tomBakiye);
                    }else{
                        System.out.println("Bakiyenizden fazla para cekemezsiniz");
                    }
                    break;

                case "3":
                    System.out.println("Ne kadar eft yapacaksiniz?");
                    int yatirilacakTutar=input.nextInt();
                    if(yatirilacakTutar<=tomBakiye){
                        System.out.println("Iban giriniz?");

                        input.nextLine();

                        String yatirilacakIBAN=input.nextLine();

                        if(yatirilacakIBAN.equals(aliIBAN)){
                            System.out.println("EFT gerceklestirili");
                            tomBakiye-=yatirilacakTutar;
                            aliBakiye+=yatirilacakTutar;

                            System.out.println("Tomun Hesabi: "+tomBakiye);
                            System.out.println("Alinin hesabi: "+aliBakiye);

                        }else{
                            System.out.println("Iban yanlis"
                            );
                            break;
                        }

                    }

            }

        }else{
            System.out.println("Kullanici adiniz veya sifreniz hatali");
        }

    }

}