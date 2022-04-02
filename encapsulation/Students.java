package io.encapsulation;


class Students {
    private String name;
    private int age;
    private String address;
    
    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // public String toString(){
    //     return(
    //         "Name: " +  getAge()
        
    //     );
    // }

    public static void main(String[] args){
        Students s1 = new Students("John", 20, "123 Main St.");
        System.out.println("hh"+s1);
    }


}


