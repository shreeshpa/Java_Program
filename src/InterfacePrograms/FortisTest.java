package InterfacePrograms;

public class FortisTest {

	public static void main(String[] args) {
		
		FortisHospital fs=new FortisHospital();
		
		fs.carioServices();
		fs.neuroServices();
		fs.medicalInsurance();
		fs.pathologyServices();
		
		fs.polio();
		fs.ebola();
		fs.pediatricServices();
		fs.vaccination();
		fs.carioServices();
		
		USMedical.medicine();
		System.out.println(USMedical.min_fee);
		
		fs.nursing();
		
	//TOP Casting
		
		USMedical us=new FortisHospital(); //child class object can be referred by parent interface ref variable
        
		us.carioServices();
		us.neuroServices();
		us.orthoServices();
		us.emergencyServices();
		
		UKMedical uk=new FortisHospital();
		uk.orthoServices();
		uk.pediatricServices();
		uk.physioServices();
		
		System.out.println("\n IndianMedical Services");
		IndianMedical in=new FortisHospital();
		in.oncologyServices();
		in.pathologyServices();
		in.orthoServices();
		in.radioServices();
		
	}

}
