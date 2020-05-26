import java.util.ArrayList;

public class ConstructorUserProgram {
	
	String name;
	int age;
	String email;
	boolean isActivated;
	char gender;
	long phone;
	ArrayList<String> payment;
	
	public ConstructorUserProgram(String name, int age, String email, boolean isActivated) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.isActivated=isActivated;	
		
	}
	public ConstructorUserProgram(String name, String email, long phone) {
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	public ConstructorUserProgram(String name, int age, String email, 
			boolean isActivated, char gender,long phone, ArrayList<String> payment  ) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.isActivated=isActivated;
		this.gender=gender;
		this.phone=phone;
		this.payment=payment;
		
	}

	public static void main(String[] args) {
	
		ConstructorUserProgram u1=new ConstructorUserProgram("Shreesh",26,"Shreeshpandey@gmail.com",true);
		ConstructorUserProgram u2=new ConstructorUserProgram("Chandan", "Cmaurya41@gmail.com", 976983);
	    System.out.println(u1.name+ " "+u1.age+ " "+u1.email+ " "+ u1.isActivated);
	    System.out.println(u2.name+ " "+u2.email+ " "+u2.phone );
	    ArrayList<String> wallet=new ArrayList<String>();
	    wallet.add("GPay");
	    wallet.add("PhonePe");
	    
	    ConstructorUserProgram u3=new ConstructorUserProgram("Krishna", 28, "Shir", true, 'm', 1232, wallet);
	    System.out.println(u3.name+ " "+u3.age+ " "+u3.payment);
	    
	    

	}

}
