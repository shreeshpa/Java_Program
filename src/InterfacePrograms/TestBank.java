package InterfacePrograms;

public class TestBank {

	public static void main(String[] args) {
		HdfcBank hf=new HdfcBank();
		hf.credit();
		hf.debit();
		hf.educationLoan();
		hf.transferMoney();
		hf.homeLoan();
		System.out.println(RBIInterface.min_balance);
		int i=RBIInterface.min_balance;
		System.out.println(i);
		
	}

}
