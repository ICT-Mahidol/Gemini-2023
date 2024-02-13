package HolidayTravelVehicles;

public class person{
    
    protected String name;
    protected String address;
    protected String phone_number;

    public person(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getname(){
        return this.name;
    }

    public String getaddress(){
        return this.address;
    }
    public String getnumber(){
        return this.phone_number;
    }
}


