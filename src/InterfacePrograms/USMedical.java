package InterfacePrograms;

public interface USMedical {
	
	static final int min_fee = 10;
	
	public void orthoServices();
	public void carioServices();
	public void neuroServices();
	public void emergencyServices();
	
	public static void medicine() {
		System.out.println("USMedical -- medicine");
		
	}
	
	// 2. default method in Interface:
		default void nursing() {
			System.out.println("USMedical -- nursing");

		}


}
