package day13whileloopdowhileloo;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        /*
        Username="admin" ve Password="pwd123" dur
        kullanıcının girdigi username ve password dogru ise hosgeldiniz yanılış ise
        4.kerede hesabınız bloke olmustur mesajı ile işlemi tamamlayınız
        */
        Scanner input =new Scanner(System.in);

        int counter=0;

        do{
            if(counter==4){
                System.out.println("hesabınız bloke olmustur");
                break;
            }
            System.out.println("username giriniz");
            String username= input.next();

            System.out.println("password giriniz");
            String password= input.next();
            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("hesabınıza hosgeldiniz");
                break;
            }
            counter++;

        }while (true);

    }
}
