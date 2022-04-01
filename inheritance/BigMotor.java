
package io.inheritance;


class BigMotor extends Motorcycle{

    public int motorwidth;
    

    public BigMotor(int motorWidth, int startspeed, int startgear){
        super(startgear, startspeed);
        this.motorwidth = motorWidth;
    }

    //gettes and setters
    public void setMotorWidth(int motorWidth){
        this.motorwidth = motorWidth;
    }
    public int getMotorWidth(){
        return motorwidth;
    }
    // public void setGear(int gear){
    //     this.gear = gear;
    // }
    // public int getGear(){
    //     return gear;
    // }


    


    
}