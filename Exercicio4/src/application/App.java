package application;

import java.util.ArrayList;
import java.util.List;

import entities.Distributor;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Distributor> list = new ArrayList<>();

        list.add(new Distributor("SP", 67836.43));
        list.add(new Distributor("RJ", 36679.66));
        list.add(new Distributor("MG", 29229.88));
        list.add(new Distributor("ES", 27165.48));
        list.add(new Distributor("Outros", 19849.53));

        for (Distributor distributor : list) {
            distributor.setList(list);
        }

        System.out.println("O valor total mensal da distribuidora e: ");
        list.forEach(System.out::println);
    }
}
