

public class LoginPageMethodOverloading {

	public void login() {

	}

	public void login(long phoneNumber) {
		
	}

	public void login(long phoneNumber, int otp) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String socialMediaAccount) {

	}

	public static void main(String[] args) {

		LoginPageMethodOverloading lp = new LoginPageMethodOverloading();
		lp.login(99999);

		lp.login("naveen");

		lp.login("naveen@gmail.com", "test123");
	}
	}


