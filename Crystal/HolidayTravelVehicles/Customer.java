
public class Customer {
	private int customer_id;
	private String name;
	private String address;
	private String phone;
	
	public Customer(int customer_id, String name, String address, String phone) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
