package advanced_practice.practice02;

import java.util.Arrays;

public class T03 {
    /*
      Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
      output: min:-90, max:10001, secMax: 8787
     */
    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min;" + arr[0] + " max;" + arr[arr.length - 1] + " secMax;" + arr[arr.length - 2]);

        // 2.yol  { 100, 10001, -90, 845, 8787, 898, 0, 1};
        
        int min =arr[0];
        int max =arr[0];
        int secMax =arr[0];

        for (int i = 0; i <arr.length-1 ; i++) {

            if(arr[i]<min) {
                min = i;
            }else if(arr[i]>max){
                secMax=max;
                max=i;}
            else if(arr[i]>secMax){
                secMax=arr[i];}
            System.out.println("min;"+min+" max;"+max+" secmax"+secMax);


            }
        }

    }


