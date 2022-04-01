package io.inheritance;

class InheritanceConnection {
    public static void main(String[] args){

        
        BigMotor motor = new BigMotor(5, 150,50);
        System.out.println("My motor widht is " + motor.getMotorWidth() + " dimensional");
        System.out.println("My motor gear is "  + motor.gear + " dimensional");
        System.out.println("Speed is" + motor.speed + " kph");
        System.out.println("My motor speed is " + motor.getSpeed() + " km/h");

        motor.speedUp(460);
        System.out.println("My motor can speedup until they reach " + motor.getSpeed() + " km/h");

        motor.applyBreak(100);
        System.out.println("My motor can slow down until they reach " + motor.getSpeed() + " km/h");


    }
}
