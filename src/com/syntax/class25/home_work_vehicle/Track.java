package com.syntax.class25.home_work_vehicle;

public class Track extends Vehicle{

    /*
    The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
     */

    double weight;

    @Override
    public double calculateSalePrice() {
        if(weight>2000) {
            vehiclePrice-=vehiclePrice*0.1;
        } else {
            vehiclePrice-=vehiclePrice*0.2;
        }
        return vehiclePrice;
    }
}
