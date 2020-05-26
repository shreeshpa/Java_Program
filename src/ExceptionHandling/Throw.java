package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
	 String browser="IE";
	 
	 if(browser.equals("Chrome")) {
		 System.out.println("launch chrome"); 	 
	 }
	 else if(browser.equals("Mozilla")) {
		 System.out.println("launch Mozilla");
	 }
	 
	 else if(browser.equals("Safari")) {
		 System.out.println("launch Safari");
	 }
	 
	 else {
		 
		 try {
		 throw  new Exception("Please pass the correct browser");
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	}
}

