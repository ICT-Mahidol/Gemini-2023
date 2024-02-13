package HolidayTravelVehicles;
import java.util.Calendar;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        /**
         * Customer
         */
        Customer cus = new Customer();
        cus.setFirstName("John");
        cus.setLastName("Doe");
        cus.setAddress("77/88 A.N.P. Road, Bangkok");
        cus.setPhoneNumber("999999999");
        cus.setCustomerId(001);
        cus.setMembershipLevel(0);
        System.out.println(cus.toString() + "\n");

        /** 
         * Salesperson
        */
        Salesperson sp = new Salesperson();
        sp.setFirstName("Jane");
        sp.setLastName("Brown");
        sp.setAddress("96/87 C.P. Road, Bangkok");
        sp.setPhoneNumber("888888888");
        sp.setSalespersonID(001);
        sp.setSalary(30000);
        sp.setPosition("Sales Manager");
        System.out.println(sp.toString() + "\n");

        /**
         * Vehicle
         */
        Vehicle v = new Vehicle();
        v.setName("Toyota");
        v.setSerialNo(001);
        v.setModel("Vios");
        v.setYear(2015);
        v.setManufacturer("Toyota");
        v.setBasePrice(500000);
        System.out.println(v.toString() + "\n");

        /**
         * InstallOption List
         */
        InstallOption option = new InstallOption();
        Map<String, Integer> optionList = Stream.of(new Object[][] {
            { "ABS", 10000},
            { "Airbag", 5000},
            { "Sunroof", 20000},
            { "Parking Sensor", 10000}
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        option.setOptions(optionList);
        
        System.out.println(option.toString() + "\n");

        /**
         * Invoice 
         */
        Invoice invoice = new Invoice();
        Calendar c = Calendar.getInstance();
        c.set(2018, 1, 1);
        invoice.setInvoiceNo(001);
        invoice.setCustomer(cus);
        invoice.setAmount(optionList.values().stream().mapToInt(Integer::intValue).sum() + v.getBasePrice());
        invoice.setTradeIn(v);
        invoice.setVehicle(v);
        invoice.setInvoiceDate(c);
        invoice.setOptionList(option);
        System.out.println(invoice.toString() + "\n");

    }
}
