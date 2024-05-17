package HolidayTravelVehicles;

public class Salesperson {

    private String employeeId;
    private String name;

   
    public Salesperson(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    public static void main(String[] args) {
        
        Salesperson salesPerson = new Salesperson("001", "Patchi");

       
        System.out.println("Employee ID: " + salesPerson.getEmployeeId());
        System.out.println("Name: " + salesPerson.getName());

        
        salesPerson.setEmployeeId("002");
        salesPerson.setName("tarti");

        
        System.out.println("Modified Employee ID: " + salesPerson.getEmployeeId());
        System.out.println("Modified Name: " + salesPerson.getName());
    }
}