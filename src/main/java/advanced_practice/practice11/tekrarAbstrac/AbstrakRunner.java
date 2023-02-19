package advanced_practice.practice11.tekrarAbstrac;

public class AbstrakRunner {
    public static void main(String[] args) {
        Ucgen u1=new Ucgen();
        System.out.println("u1.alanlama(3,5) = " + u1.alanlama(3, 5));
        System.out.println(u1.alanlama(4.4, 3.3));

        Dortgen d1=new Dortgen();
        System.out.println("d1.alanlama(2.1,9) = " + d1.alanlama(2.1, 9));
        System.out.println(d1.alanlama(4, 8));


    }
}
