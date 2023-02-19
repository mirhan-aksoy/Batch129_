package stringManipulation03;

public class C07_stringManipulation {
    /*
    soru7) girilen Stringdeki tum rakamları "*" ile degistirin
    */
    public static void main(String[] args) {

        String str = "bu4a654k17654";
        str=str.replaceAll("\\d","*");
        System.out.println(str);


    }
}