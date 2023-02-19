package day30exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();

        Civic YouCivic = new Civic();
        YouCivic.soft();
        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

        System.out.println(Ac.model);
        System.out.println("Engine.model = " + Engine.model);

        Accord myAccord = new Accord();
        myAccord.cool();
        Accord ImAccord= new Accord();
        ImAccord.soft();

    }

}