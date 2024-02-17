package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import entities.Invoicing;

public class ConvertJson {

    public static Invoicing[] convertJsonToObject(String path) throws ParseException {
        JSONParser parser = new JSONParser();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            JSONArray jsonArray = (JSONArray) parser.parse(br);

            Invoicing[] invoicings = new Invoicing[jsonArray.size()];

            int i = 0;
            for (Object obj : jsonArray) {
                if (obj instanceof JSONObject) {
                    JSONObject jsonObject = (JSONObject) obj;
                    long day = (long) jsonObject.get("dia");
                    double value = (double) jsonObject.get("valor");
                    Invoicing invoicing = new Invoicing(day, value);
                    invoicings[i++] = invoicing;
                }
            }
            return invoicings;
        } 
 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
