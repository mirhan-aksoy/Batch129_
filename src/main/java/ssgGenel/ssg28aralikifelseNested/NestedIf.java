package ssgGenel.ssg28aralikifelseNested;
public class NestedIf {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali

        //Yaş ve kilo için iki değişken oluşturma

        int yas =17;
        int kilo =45;

        if (yas>=18){// dis if

            if (kilo>=50){ /// ic if
                System.out.println("Kan bagisinda bulunmayi uyugun sunuz.");
            }else {

                System.out.println("Kan bagisinda bulunmayi uyugun degilisiniz.");
            }
        }else {
            System.out.println("Yas 18 ;dan Buyuk Olmali .");
        }

        //

        //
        int age = 20;
        int weight = 60;

        if (age >= 18 && weight > 50) {
            System.out.println("Bu kisi kan bağışçısı olabilir. Daha fazla sağlık kontrolü yapılması gerekebilir");
        } else {
            System.out.println("Bu kisi kan bağışçısı olamaz");
        }

    }
}