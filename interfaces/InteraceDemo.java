package io.interfaces;

public class InteraceDemo {

    public static void main(String[] args){
        MountainBike mountainBike = new MountainBike(20,60);
        System.out.println("Gear is" + mountainBike.getGear());
        System.out.println("Speed is" + mountainBike.getSpeed());

        mountainBike.applyBrakes(20);
        System.out.println("The new speed of a car is: " + mountainBike.getSpeed());
    }

}
