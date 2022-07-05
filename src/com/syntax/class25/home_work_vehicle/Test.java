package com.syntax.class25.home_work_vehicle;

public class Test {
    public static void main(String[] args) {

        Vehicle.vehiclePrice=20000;
        Sedan sedan = new Sedan();
        sedan.length=19;
        System.out.println("Sedan prise is "+sedan.calculateSalePrice());
        Track track = new Track();
        track.weight=1900;
        System.out.println("Track prise is "+track.calculateSalePrice());
    }
}
