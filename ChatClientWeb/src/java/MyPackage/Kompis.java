package MyPackage;

public class Kompis {
    String name;
    String adress;
    int phoneNumber;

    Kompis(String name,String adress,int phoneNumber)
    {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }
    public String getAdress()
    {
        return adress;
    }
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getListdata(){
        return "Name: " + this.name + ", Adress: " + this.adress + ", Phone Number: " + this.phoneNumber;
    }
    
}
