package io.classes;

public class Car {
    
    String color;
    String model;
    int year;

    public Car(String color, String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    //getters and setters
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return "Color: " + color + "\nModel: " + model + "\nYear: " + year;
    }

    public static void main (String[] args){
        Car car = new Car("Red", "Audi", 2018);
        car.setModel("MUSTANG");

        System.out.println("My Favoite car model is "+ car.getModel() + " and the color is"+ car.getColor());
    }
    



}
