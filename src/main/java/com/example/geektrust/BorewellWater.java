package com.example.geektrust;

public class BorewellWater {
    private static final double RATE = 1.5;
    
    private long waterConsumed;
    
    public BorewellWater(long waterConsumed) {
        this.waterConsumed = waterConsumed;
    }
    
    public long getWaterConsumed() {
        return waterConsumed;
    }
    
    
    public long getBill(){
        return Math.round(waterConsumed * RATE);
    }
}
