package day31collections;

import java.util.LinkedList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);// [Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");// "addLast()" is equivalent to "add()"
        System.out.println(names);// [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

       String r1= names.remove();//Retrieves(silinen elemanı verir) and removes the  (first element) of this list.
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda]


    }


}