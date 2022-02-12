package com.example.geektrust;

public class Water {
    private static final long WATER_PER_PERSON = 10;
    private static final long DAYS_IN_MONTH = 30;
    
    BorewellWater borewellWater;
    CorporationWater corporationWater;
    TankerWater tankerWater;
    long totalWaterConsumed;
    
    Water(long totalWaterAlloted, Ratio ratio){
        long borewellWaterAlloted = Math.round((totalWaterAlloted * ratio.getBorewellWaterRatio())/ ratio.getTotalWaterRatio());
        this.borewellWater = new BorewellWater(borewellWaterAlloted);
        
        long corporationWaterAlloted = Math.round((totalWaterAlloted * ratio.getCorporationWaterRatio())/ ratio.getTotalWaterRatio());
        this.corporationWater = new CorporationWater(corporationWaterAlloted);
        this.tankerWater = new TankerWater(0);
    }
    
    public void addExtraWaterForGuest(long numberOfGuests){
        long extraWaterNeededBYGuests = numberOfGuests * WATER_PER_PERSON * DAYS_IN_MONTH;
        tankerWater.setWaterConsumed(tankerWater.getWaterConsumed() + extraWaterNeededBYGuests);
    }
    
    public long getTotalWaterConsumed(ApartmentType apartmentType){
        return apartmentType.warterConsumed
                + tankerWater.getWaterConsumed();
    }
    
    public long getBill(){
        return Math.round(borewellWater.getBill() + corporationWater.getBill() + tankerWater.getBill());
    }
    
}
