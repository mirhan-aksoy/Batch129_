package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //exp 2: bir string te sesli harf sayısını bulunuz

        String s="Java brings you money";
        // 1. yoluse replaceAll()
        int vowels = s.replaceAll("[^aeiouAEIUO]","").length();
        System.out.println(vowels);//6

        // 2. yoluse Array - loop
        String letters[]= s.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;
        for (String w : letters){

            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);


    }
}
