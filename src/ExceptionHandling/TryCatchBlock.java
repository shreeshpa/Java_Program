package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
		int i=9/0;
		System.out.println("B");
		System.out.println("B");
		}
		
		catch(Throwable t){
			System.out.println("some error or exception is coming...");
			t.printStackTrace();
		}
		
		
//		catch(NullPointerException e) {
//			System.out.println("Exception Handeled");
//			 e.printStackTrace();
//			}
//		
//		catch(ArithmeticException e) {
//		System.out.println("Arithmetic Exception Handeled");
//		 e.printStackTrace();
//		}
		
		
		System.out.println("A");
		System.out.println("A");

	}

}
