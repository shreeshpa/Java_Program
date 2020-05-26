package InterfacePrograms;

public class WHO implements UNHC {

	@Override
	public void ebola() {
		System.out.println("WHO ---ebola");
		
	}

	@Override
	public void polio() {
		System.out.println("WHO ---polio");
		
	}
	
	public void vaccination() {
		System.out.println("WHO -- vaccination");
	}
	
	public final void pandemic() {
		System.out.println("WHO -- pandemic");
	}
	

	
	
	

}
