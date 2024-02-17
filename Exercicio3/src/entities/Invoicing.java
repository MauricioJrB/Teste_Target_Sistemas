package entities;

public class Invoicing {
    
    private Long day;
    private Double value;

    public Invoicing() {}

    public Invoicing(Long day, Double value) {
        this.day = day;
        this.value = value;
    }

    public Long getDay() {
        return  day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}