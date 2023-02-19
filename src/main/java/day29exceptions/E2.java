package day29exceptions;

public class E2 {
    public static void main(String[] args) throws IllegalArgumentException, ArithmeticException {
        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
 //       try {
 //          getMark(-222);
 //       }catch (IllegalArgumentException e){
 //         System.out.println(e.getMessage());
 //       }

         getMark(-900);

    }

    //"throw" keyword bir metodun bady si icinde istediğimiz yerde sayıda ve kosulda Exception atmamızı sağlar.
    //
    public static void printAge(int age) {
        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }
    //ogrenci notlari yazan metot
    public static void getMark(double d) {
        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundret");
        } else {
            System.out.println(d);
        }
    }
}
