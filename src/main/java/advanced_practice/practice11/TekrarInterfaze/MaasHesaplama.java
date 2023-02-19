package advanced_practice.practice11.TekrarInterfaze;

public class MaasHesaplama implements MaasArttir, Vergi {

    @Override
    public double yillikekstra(int calismayili) {
        return calismayili * 100;
    }

    @Override
    public double saatlikekstra(int calismasaati) {
        if (calismasaati > 160) {
            return (calismasaati - 160) * 10;
        } else {
            return 0;
        }

    }

    @Override
    public double vergihasapla(int calismayili, double burutmaas) {
        if(calismayili>=10){
            return burutmaas*0.3;
        }else {
            return burutmaas*0.2;
        }
    }
    public double netMaas(double brutmaas, int calismayili, int calismasaati) {


        return brutmaas+yillikekstra(calismayili)+saatlikekstra(calismasaati)-vergihasapla(calismayili, brutmaas);
    }


}
