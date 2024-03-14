public class People {
    
    // properties
    private String name;
    private int age;
    private String address;
    private String ID;

    // method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setID(String ID){
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public String getID(){
        return this.ID;
    }

    public void getDetails(){
        System.out.println("Profile info:");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("ID : " + ID);
    }
}
