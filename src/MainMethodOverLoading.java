
public class MainMethodOverLoading {


	public static void main(String args[]) {
		
	System.out.println("Hello");
	 main("Shreesh");
     main(10);
     
}
	public static void main(int i) {
		System.out.println("Hello"+i);
	} 
	public static void main(String name) {
		System.out.println("Hello"+name);
	}

}