package io.classes;

class aMotor {
    String brand;
    int price;
    String color;
    String abs;

    public void Motor(String brand, int price, String color, String abs) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.abs = abs;
    }

    //GETTERS AND SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setAbs(String abs) {
        this.abs = abs;
    }
    public String getAbs() {
        return abs;
    }

    public String toString() {
        return "Brand: " + brand + "\nPrice: " + price + "\nColor: " + color + "\nAbs: " + abs;
    }

    public static void main(String[] args){
        aMotor motor = new aMotor();
        motor.setBrand("Honda");
        System.out.println(motor.getBrand());
    }
    
}

