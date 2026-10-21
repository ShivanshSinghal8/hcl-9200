package in.demo.setterDI;

public class Address {
    String address;
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void displayAddress(){
        System.out.println(address);
    }
}
