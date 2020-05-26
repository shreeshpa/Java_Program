package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void getAddress() {
		System.out.println("Get Address");
	}
	private void getBankAccount() {
		System.out.println("Get Bank Account");
	}
    
	public void getEmployeeBankData() {
		getBankAccount();
	}
	
	public int getSalary() {
		return salary;
	}

	}


