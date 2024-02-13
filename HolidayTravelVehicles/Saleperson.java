public class Saleperson {
    private String StaffID;
    private String StaffName;

    public Saleperson(String newName, String newID){
        this.StaffName = newName;
        this.StaffID = newID
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String staffName) {
        StaffName = staffName;
    }

}
