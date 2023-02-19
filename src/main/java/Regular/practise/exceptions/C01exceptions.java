package Regular.practise.exceptions;

public class C01exceptions {

    public static void main(String[] args) {
        double sonuc1= (int) karaktersayilarinibolme("Tester","De");
        System.out.println(sonuc1);
        double sonuc2= (int) karaktersayilarinibolme("Tester","");
        System.out.println(sonuc2);
        double sonuc3= (int) karaktersayilarinibolme("null","mehmet");
        System.out.println(sonuc3);



    }//main
    private static double karaktersayilarinibolme(String str1, String str2) {
        double result= 0;
        try {
            result=str1.length() / str2.length();
            System.out.print(result);
        } catch (ArithmeticException e) {
            System.err.println("payda sıfır olamaz" + e.getMessage());
            // e.printStackTrace();
        }   catch (NullPointerException e) {
                System.err.println("lenght mtodu nuul ile hata verir"+e.getMessage());
        } finally {

            System.out.println("database ile baglantı kesilmeli...");
        }
        return result;


    }



}



