package io.inheritance;

class Motorcycle{
     protected int gear;
     protected int speed;

     public Motorcycle(int startgear, int startspeed) {
         this.gear = startgear;
         this.speed = startspeed;
     }

     //gettes and setters
        public void setGear(int gear) {
            this.gear = gear;
        }
        public int getGear() {
            return gear;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public int getSpeed() {
            return speed;
        }

        //apply break for a car
        public void applyBreak(int decrement){
            this.speed = this.speed - decrement;
        }

        //increase the speed 
        public void speedUp(int increment){
            this.speed = this.speed + increment;
        }




        public static void main(String[] args){
            Motorcycle motor = new Motorcycle(21, 200);
            System.out.println(motor.getGear());
            System.out.println(motor.getSpeed());
        }
}