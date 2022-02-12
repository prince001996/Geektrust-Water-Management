package com.example.geektrust;

public class Ratio {
    private double corporationWaterRatio;
    private double borewellWaterRatio;
    private double totalWaterRatio;
    
    Ratio(String ratio){
        String[] values = ratio.split(":");
        corporationWaterRatio = Integer.valueOf(values[0].trim());
        borewellWaterRatio = Integer.valueOf(values[1].trim());
        totalWaterRatio = corporationWaterRatio + borewellWaterRatio;
    }
    
    public double getCorporationWaterRatio() {
        return corporationWaterRatio;
    }
    
    public double getBorewellWaterRatio() {
        return borewellWaterRatio;
    }
    
    public double getTotalWaterRatio() {
        return totalWaterRatio;
    }
}
