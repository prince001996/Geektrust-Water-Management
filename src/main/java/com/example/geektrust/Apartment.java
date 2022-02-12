package com.example.geektrust;

public class Apartment {
    private ApartmentType apartmentType;
    private int guests;
    private Water water;
    private Ratio ratio;
    
    Apartment(){
    }
    
    public ApartmentType getApartmentType() {
        return apartmentType;
    }
    
    public Water getWater() {
        return water;
    }
    
    public void addGuest(int numberOfGuests){
        this.guests += numberOfGuests;
    }
    
    public void allotWater(ApartmentType apartmentType, String ratio){
        this.apartmentType = apartmentType;
        this.ratio = new Ratio(ratio);
        this.addWaterConsumed(this.apartmentType.warterConsumed, this.ratio);
    }
    
    private void addWaterConsumed(long totalWaterAlloted, Ratio ratio){
        Water water = new Water(totalWaterAlloted, ratio);
        this.water = water;
    }
    
    public long bill(){
        water.addExtraWaterForGuest(guests);
        return water.getBill();
    }
}
