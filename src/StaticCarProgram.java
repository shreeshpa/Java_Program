
public class StaticCarProgram {

	String name;
	String color;
	int price;
	String model;
	static final int  wheel=4;
	
	
	public static void main(String[] args) {
		
		StaticCarProgram s1=new StaticCarProgram();
		s1.name="BMW";
		s1.color="Red";
		s1.price=750000;
		s1.model="Q6";
		
		
		StaticCarProgram s2=new StaticCarProgram();
		s2.name="Audi";
		s2.color="Red";
		s2.price=650000;
		s2.model="Q5";
		
		
		System.out.println(s1.name +" "+s1.color);
		System.out.println(wheel);
		System.out.println(s2.name +" "+s2.color+" "+s2.price+ " "+s2.model+ " "+wheel);
		
	}
}