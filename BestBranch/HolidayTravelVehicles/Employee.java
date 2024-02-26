public class Employee{
    private int StaffID;
    private String StaffName;

    public Employee(){

    }

    public Employee(int StaffID, String StaffName){
        this.StaffID = StaffID;
        this.StaffName = StaffName;
    }

    public void setStaffID(int StaffID){
        this.StaffID = StaffID;
    }

    public void setStaffName(int StaffName){
        this.StaffName = StaffName;
    }

    public int getStaffID(){
        return this.StaffID.toString();
    }

    public String getStaffName(){
        return this.StaffName;
    }
}