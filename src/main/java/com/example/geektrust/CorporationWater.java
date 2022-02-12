package com.example.geektrust;

public class CorporationWater {
    private static final double RATE = 1;
    
    private long waterConsumed;
    
    CorporationWater(long waterConsumed){
        this.waterConsumed = waterConsumed;
    }
    
    public long getWaterConsumed() {
        return waterConsumed;
    }
    
    public long getBill(){
        return Math.round(waterConsumed * RATE);
    }
}
