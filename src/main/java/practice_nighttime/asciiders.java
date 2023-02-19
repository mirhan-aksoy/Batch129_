package practice_nighttime;

public class asciiders {

    // a dan z ye ascii ler topla
    public static void main(String[] args) {


                int toplam=0;
        for (int i ='a' ; i <'z' ; i++) {
            System.out.println(i);
            toplam=toplam+i;

        }
        System.out.println(toplam);

        // a b c üçgen

        char input ='f';
        for (char i = 'a'; i <input ; i++) {
            for (char j ='a'; j <i ; j++) {
                System.out.println(j +' ');

            }

        }

    }
}
