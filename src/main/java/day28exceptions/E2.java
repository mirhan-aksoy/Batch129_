package day28exceptions;

public class E2 {
    public static void main(String[] args) {
        String s="1234";
        convertStringToInt(s);

        String t="1a2b";
        convertStringToInt(t);
    }
    // içinde sayı olan bir stringi sayıya cevirmek java da "numberformatexception" atar
    public static void convertStringToInt(String s){// string i int e ceviren metot

     int intS=0;

      try {
           intS = Integer.valueOf(s);
      }catch (NumberFormatException e){
          System.out.println("Bir Stringin sayiya dönusmesi için rakam dışı caracter içermemesi gerekir");
          System.out.println(e.getMessage());
      }
        System.out.println(intS + 1);
      }
}
