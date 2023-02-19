package advanced_practice.practice08;

public class Q05_Inheritance {
    public static void main(String[] args) {

        daireAlani(1);
        daireAlani(10);

    }
    static void daireAlani(int r){
        Daire daireObjesi=new Daire();

        System.out.println(daireObjesi.carpma(daireObjesi.piSayisi,daireObjesi.karesiniAl(r)));
    }


}



