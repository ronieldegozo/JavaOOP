package io.inheritance;

class Course {
    private int midtermgrade;
    protected int finalgrade;

    public Course(int midtermgrade, int finalgrade) {
        this.midtermgrade = midtermgrade;
        this.finalgrade = finalgrade;
    }

    //getters and setters
    
    public int getMidtermgrade() {
        return midtermgrade;
    }
    public void setMidtermgrade(int increment) {
        midtermgrade += increment;
    }
    public void getFinalgrade(int decrement) {
        finalgrade -= decrement;    
    }

    


    
}