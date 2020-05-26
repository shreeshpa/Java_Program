package InterfacePrograms;

public class HdfcBank implements RBIInterface{

	public void homeLoan() {
		System.out.println("Home Loan");
	}
	
	public void educationLoan() {
		System.out.println("education Loan");
	}

	@Override
	public void credit() {
		System.out.println("hdfc --credit");
		
	}

	@Override
	public void debit() {
		System.out.println("hdfc --debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("hdfc --transferMoney");
		
	}
    
	
	

}
