package services;

import java.util.function.Predicate;

import entities.Invoicing;

public class InvoicingService {

    public double avg(Invoicing[] invoicings, Predicate<Invoicing> filter) {

        double sum = 0.0;
        double avg = 0.0;
        int count = 0;
    
        if (invoicings != null) {
            for (Invoicing i : invoicings) {
                if (filter.test(i)) {
                    sum += i.getValue();
                    count++;
                }
            }
        }
        avg  = sum / count;
        return avg;
    }

    public int numDay(Invoicing[] invoicings, Predicate<Invoicing> filter) {

        int days = 0;

        if (invoicings != null) {
            for (Invoicing i : invoicings) {
                if (filter.test(i)) {
                    days++;
                }
            }
        }
        return days;
    }

    public double maxValue(Invoicing[] invoicings) {

        double max = 0.0;

        for (Invoicing i : invoicings) {
            if (i.getValue() > max) {
                max  = i.getValue();
            }
        }
        return max;
    }

    public double  minValue(Invoicing[] invoicings, Predicate<Invoicing> filter) {
        double min =  Double.MAX_VALUE;

        for (Invoicing i : invoicings) {
            if (filter.test(i)  && i.getValue() < min) {
                min = i.getValue();
            }
        }
        return min;
    }
}