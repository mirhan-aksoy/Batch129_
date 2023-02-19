package day29exceptions;

public class E1 {
    public static void main(String[] args) {

        Object obj=70;
        String str="";
       try {
           str = (String) obj;//birbirinr donusemez data type hatasında Java ClassCastException atar
           System.out.println(str);
       }catch (ClassCastException e) {
           System.out.println("her data type her data type a cevrilmez");
       }

    }
}
