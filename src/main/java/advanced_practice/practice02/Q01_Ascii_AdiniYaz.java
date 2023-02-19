package advanced_practice.practice02;

public class Q01_Ascii_AdiniYaz {
    //Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.
    public static void main(String[] args) {

        char ch1 = 'B'-1;//A
        char ch2 = 'm'-1;//l
        char ch3 = 'h'+1;//i
        System.out.println(""+ch1 + ch2 + ch3);

        // can ismini yaz
        char c1='B'+1;
        char c2='b'-1;
        char c3='m'+1;
        System.out.println(""+c1 + c2 + c3);

    }


}