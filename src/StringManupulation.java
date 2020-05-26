
public class StringManupulation {
  
	public static void main(String[] args) {
		
		String str="This is my first java code and I am so happy";
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); //2nd accurance
		System.out.println("Third occurance if i is ");
		System.out.println(str.indexOf('i', str.indexOf('i')+1+str.indexOf('i')+1)); //3rd occurance
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("testing"));
		
		String message="welcome admin";
		if(message.indexOf("admin")>=0) {
			System.out.println("user is looged in");
		}

//trim 
		String st= "  hello world  ";
		System.out.println(st.trim());
		System.out.println(st.trim().replace(" ", ""));
		
		String dob="09/06/1991";
		System.out.println(dob.replace("/", "-"));
		
//LCASE & UCASE
		
		String sc = "This Is Java";
		System.out.println(sc.toLowerCase());
		System.out.println(sc.toUpperCase());
		
//Concat
		
		String a="Hello";
		String b="Selenium";
		System.out.println(a.concat(b));
		
 //Contains
		String mesg = "hey admin welcome to my portal";
		System.out.println(mesg.contains("portal"));
		
// equals:
		String s1 = "This is my code";
		String s2 = "this is my code";	
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String browser = "CHROME";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launch the Browser");
		}
 //subString:	
		System.out.println("\nSubstring Pr");
		String se = "your transaction id is 12345";
		System.out.println(se.substring(0, 10));
		System.out.println(se.substring(0));
		System.out.println(se.substring(5));
		System.out.println(se.substring(se.indexOf("is")+2).trim());
		System.out.println(se.substring(se.indexOf("is")));
		
//Splits
		String data = "Tom;25;IBM;London;9999";
		String emp[]=data.split(";");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
		String userCred = "admin_admin123";
		String username = userCred.split("_")[0];
		String password = userCred.split("_")[1];

		System.out.println(username);
		System.out.println(password);
		
		String test = "xXjavaXxXpythonxXXxXRubyxX";
		String testArr[] = test.split("xX");
		System.out.println("0-->" + testArr[0]);
		System.out.println("1-->" + testArr[1]);
		System.out.println("2-->" + testArr[2]);
		System.out.println("3-->" + testArr[3]);
		System.out.println("4-->" + testArr[4]);
		
		    String x = "100A";
			System.out.println(x+20);
			String s=x.replace("A", "");
			System.out.println(s);
			int i = Integer.parseInt(s);
			System.out.println(i+20);
 }        
	
}
