package application;

import entities.Invoicing;
import services.InvoicingService;
import util.ConvertJson;

public class App {
    public static void main(String[] args) throws Exception {

        Invoicing[] invoicings = ConvertJson.convertJsonToObject("C://dados.json");
       
        InvoicingService is = new InvoicingService();

        double avg = is.avg(invoicings, i -> i.getValue() > 0.0);
    
        int numDay = is.numDay(invoicings, i -> i.getValue() > avg);

        double maxValue = is.maxValue(invoicings);

        double minValue = is.minValue(invoicings, i -> i.getValue() > 0.0);

        System.out.println("Menor valor  = " + String.format("%.4f", minValue));
        
        System.out.println("maior valor = " + String.format("%.4f", maxValue));

        System.out.println("Numero de dias em que o valor foi superior a media = " + numDay + " dias.");
    }
}
