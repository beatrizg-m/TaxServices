package services;

public class PayServices {

    private TaxService taxService = new TaxService();
    private DeliverService deliverService = new DeliverService();

    public double FinalPrice(double cost, String state){
        return cost + deliverService.fee(state) + taxService.tax(cost);
    }
    
}
