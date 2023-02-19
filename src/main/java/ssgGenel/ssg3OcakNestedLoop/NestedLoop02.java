package ssgGenel.ssg3OcakNestedLoop;

public class NestedLoop02 {
    public static void main(String[] args) {

        // -1 *line +5
       /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz

                * * * *1
                * * * 2
                * * 3
                * 4
                5
                */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=(-1 *i +5) ; j++) {
                System.out.print("*"+ " ");
            }

            System.out.println(i);
        }
        System.out.println("-----");

    }
}