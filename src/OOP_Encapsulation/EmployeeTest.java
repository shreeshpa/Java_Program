package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	
	Employee e1=new Employee("Shreesh", 28, 2700);
	e1.getAddress();
	System.out.println(e1.getSalary());
    e1.getEmployeeBankData();
    System.out.println(e1.age);
    System.out.println(e1.name);
    e1.getAddress();

	}

}
