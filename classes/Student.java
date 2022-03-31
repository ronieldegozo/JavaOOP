package io.classes;

public class Student {

    //properties
    String name;
    int age;
    String adress;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.adress = address; 
    }

    //getters and setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return adress;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + adress;
    }

    public static void main(String[] args){
        Student student = new Student("Vikesh Pandey", 21, "Pune");
        student.setName("ROGINE");
        System.out.println(student.getName());    
    }



}