package ssgGenel.ssg3OcakNestedLoop;

public class NestedLoop04 {

    public static void main(String[] args) {

        /*
        // soru 6 Asagidaki sekil cizen kodu yaziniz

            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

         */

        int input =5;
        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
for (int i =5; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"+ " ");

            }
            System.out.println();
        }

        /*

|      **      |
|    ******    |
|  **********  |
|**************|

          for (int i = 1; i <=input-1 ; i++) {
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
         */

        // if else if
    }
}