package com.example.geektrust;

public enum ApartmentType {
    TWO_BEDROOM("2", 900), THREE_BEDROOM("3", 1500);
    
    String type;
    long warterConsumed;
    
    ApartmentType(String type, long waterConsumed){
        this.type = type;
        this.warterConsumed = waterConsumed;
    }
}
