
public class Employee {
	private int employee_id;
	private String name;
	private String sale_history;
	private String phone;
	
	public Employee(int customer_id, String name, String sale_history) {
		super();
		this.employee_id = customer_id;
		this.name = name;
		this.sale_history = sale_history;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSale_history() {
		return sale_history;
	}

	public void setSale_history(String sale_history) {
		this.sale_history = sale_history;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
