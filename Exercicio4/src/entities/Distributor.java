package entities;

import java.util.List;

public class Distributor {
    
    private String state;
    private Double value;
    private List<Distributor> list;

    public Distributor() {}

    public Distributor(String state, Double value) {
        this.state = state;
        this.value = value;
    }   

    public String getState() {
        return  state;
    }

    public void setState(String state) {
        this.state  = state;
    }

    public Double getValue() {
        return value;
    }

    public void setDouble(Double value) {
        this.value = value;
    }

    public List<Distributor> getList() {
        return list;
    }

    public void setList(List<Distributor> list) {
        this.list = list;
    }

    public double monthlyTotal() {
        double total = 0.0;

        if (list != null) {
            for (Distributor d : list) {
                total += d.getValue();
            }
        }
        return total;
    }

    public double percentageTotal() {
        return (getValue()  / monthlyTotal()) * 100;
    }

    @Override
    public String toString() {
        return getState() + " - " + String.format("%.2f%%", percentageTotal());
    }
}
