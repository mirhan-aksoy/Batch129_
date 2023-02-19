package advanced_practice.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

        //Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen,
        // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
        //soruyu dinamik yapabilmek icin "while" kullandi
        //// "set" methodu
        //// "remove" methodu kullanacagiz dedi
        //// WHILE 'in icine (true) yazarsan sonsuz calisir
        //// onu kiracak bir sey koyman lazim, "break" koymalisin
        //// eklemek icin "add"
        //// silmek icin "remove"
        ////cikmak icin "break"
        ////"remove" methodu primitive data olarak yazilirsa "eleman" olarak algilayacak
        //// "remove" methodu wrapper class olarak yazilirsa "index" olarak o sayiyi alir ve siler
        //// yani o indexteki sayiyi siler
        //// silerken de "ILK GORUNMU "alir
        ////degistirirkende "ILK GORUNUMU" alir


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            System.out.println("Ekleme yapmak için: 'add'\n"+
                    "Element  güncellemek için: 'set'\n"+
                    "Element silmek için: 'remove'\n"+
                    "Çıkmak için: 'break' komutunu giriniz.");

            String komut = input.next();

            if(komut.equalsIgnoreCase("add")){

                System.out.println("Eklemek istediğiniz tamsayıyı giriniz");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);

            } else if (komut.equalsIgnoreCase("set")) {

                System.out.println("Güncellemek istediğiniz sayıyı giriniz");
                int guncellenecekIndex = list.indexOf(input.nextInt());
                System.out.println("Yerine eklemek istediğiniz sayıyı giriniz");
                int yeniSayi = input.nextInt();
                list.set(guncellenecekIndex,yeniSayi);

            } else if (komut.equalsIgnoreCase("remove")) {

                System.out.println("Silmek istediğiniz sayıyı giriniz");
                Integer silinecekSayi =  input.nextInt();
                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {

                break;
            }else {
                System.out.println("Geçerli bir komut giriniz.");
            }
            System.out.println(list);
        }
        System.out.println("Güle güle");
        System.out.println("list = " + list);
    }
}

