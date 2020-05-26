

public class StaticVsNonStatics {

	String name;
	static int age;
	
	public void getNames() {
		System.out.println("Hello Names");
	}
	 
    public static void getEmail() {
    	System.out.println("Email");
    }

	public static void main(String[] args) {
	
		StaticVsNonStatics obj=new StaticVsNonStatics();
		obj.getNames();
		obj.name="Tom";
		System.out.println(obj.name);
	    
		StaticVsNonStatics.age=12;
		StaticVsNonStatics.getEmail();
		System.out.println(StaticVsNonStatics.age);
        
		getEmail();
		age=20;
		System.out.println(age);
	}


		
	}


