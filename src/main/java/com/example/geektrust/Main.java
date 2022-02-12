package com.example.geektrust;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, ApartmentType> stringToApartmentType= new HashMap<>();
    static{
        ApartmentType[] apartmentTypes = ApartmentType.values();
        for(ApartmentType apartmentType: apartmentTypes){
            stringToApartmentType.putIfAbsent(apartmentType.type, apartmentType);
        }
    }
    
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        
        Apartment apartment = new Apartment();
        String line = bufferedReader.readLine();
        while(line != null){
            if(line.contains("ALLOT_WATER")){
                String[] inputs = line.split(" ");
                ApartmentType apartmentType = stringToApartmentType.get(inputs[1]);
                apartment.allotWater(apartmentType, inputs[2]);
                
            }
            else if(line.contains("ADD_GUEST")){
                String[] inputs = line.split(" ");
                apartment.addGuest(Integer.parseInt(inputs[1]));
            }
            else if(line.contains("BILL")){
                long billAmount = apartment.bill();
                System.out.print(apartment.getWater().getTotalWaterConsumed(apartment.getApartmentType()) + " " + billAmount);
            }
            line = bufferedReader.readLine();
        }
        
        
	}
}
