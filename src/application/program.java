package application;

import services.PayServices;

public class program {
    
    public static void main(String[] args) {
        
        PayServices payServices = new PayServices();

        System.out.println("Resultado - " + payServices.FinalPrice(300.0, "SP"));
    }
}
