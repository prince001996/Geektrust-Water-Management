package com.example.geektrust;

public class TankerWater {
    
    private static final long RATE_FROM_0_TILL_500 = 2;
    private static final long RATE_FROM_501_TILL_1500 = 3;
    private static final long RATE_FROM_1501_TILL_3000 = 5;
    private static final long RATE_FROM_3001 = 8;
    
    private long waterConsumed;
    
    public TankerWater(long waterConsumed) {
        this.waterConsumed = waterConsumed;
    }
    
    public long getWaterConsumed() {
        return waterConsumed;
    }
    
    public void setWaterConsumed(long waterConsumed) {
        this.waterConsumed = waterConsumed;
    }
    
    public long getBill(){
        double bill = 0;
        if(waterConsumed <= 500){
            bill = waterConsumed * RATE_FROM_0_TILL_500;
        }
        else if(waterConsumed > 500 && waterConsumed <= 1500){
            bill = (500 * RATE_FROM_0_TILL_500) + ((waterConsumed - 500) * RATE_FROM_501_TILL_1500);
        }
        else if(waterConsumed > 1500 && waterConsumed <= 3000){
            bill = (500 * RATE_FROM_0_TILL_500) + (1000 * RATE_FROM_501_TILL_1500)
                    + ((waterConsumed - 1500) * RATE_FROM_1501_TILL_3000);
        }
        else{
            bill = bill = (500 * RATE_FROM_0_TILL_500) + (1000 * RATE_FROM_501_TILL_1500)
                    + (1500 * RATE_FROM_1501_TILL_3000) + ((waterConsumed - 3000) * RATE_FROM_3001) ;
        }
        return Math.round(bill);
    }
    
}
