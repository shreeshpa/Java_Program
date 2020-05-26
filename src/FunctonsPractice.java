
public class FunctonsPractice {

   
	public void test() {
		System.out.println("Test Method");
	}
	
	public String getTrainerName() {
		System.out.println("GetTrainerName");
		
		String name="Shreesh";
		return name;
	}
	
	public int getScore() {
		System.out.println("GetScore");
		int p1=10,p2=20;
		int total=p1+p2;
		return total;	
	}
	
	 public int add(int a, int b) {
		 System.out.println("Add");
		 int z=a+b;
		 return z;
	 }
	 
	 public int getMarks(String studentName) {
		 int marks=0;
		 System.out.println("The Name of student is: "+studentName);
		 if(studentName.equals("Shreesh")) {
			 marks=100;
		 }
		 else if(studentName.equals("Chandan")) {
			 marks=90;
		 }
		 else if(studentName.equals("raju")) {
			 marks=0;
		 }
		 else {
			 System.out.println(studentName +" Not Found");
		 }
		 return marks;
	 }
	 
	   public String getCountryName(String country) {
		   
		   System.out.println("Captial name of country is:" +country);
		   String capital=null;
		   
		   if(country.equals("India")) {
			   capital="Delhi";
			   
		   }
		   else if(country.equals("USA")) {
			   
			   System.out.println("DC");
		   }
		   else {
			   System.out.println(country +" Not found");
		   }
		   return capital;
	   }
	   
	   public String launchBrowser(String browsweName) {
		  
		System.out.println("The Browser Name is "+browsweName);
		String driver=null;
		
		switch (browsweName) {
		case "Chrome":
			driver="launch Chrome";
			break;
		case "Mozilla":
			driver="launch Mozilla";
			break;
		case "Opera":
			driver="launch Opera";
			break;	

		default:
			break;
		}
		  return driver; 
	   }
	
	public static void main(String[] args) {
		
		FunctonsPractice obj =new FunctonsPractice();
		 obj.test();
		
		 
		 String s1=obj.getTrainerName();
		 System.out.println(s1);
		 //System.out.println(obj.getTrainerName());
         
		 int n1=obj.getScore();
		 System.out.println(n1);
		 
		 int n2= obj.add(10, 20);
		 System.out.println(n2+100);
		 
		 int n3=obj.add(40, 50);
		 System.out.println(n3);
		 
		int m1= obj.getMarks("tom");
		System.out.println(m1);
		
		String c1=obj.getCountryName("India");
		System.out.println(c1);
		
		String s2=obj.launchBrowser("Mozilla");
		System.out.println(s2);
		 
       
	}
	

}
