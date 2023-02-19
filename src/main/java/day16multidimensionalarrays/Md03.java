package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {
        int [][]a={{2,62,82},{3,13}};
        int sum=0;

        for(int[]w:a){
            for(int k:w){
                sum=sum+k;
            }
        }
        System.out.println(sum);
    }
}
