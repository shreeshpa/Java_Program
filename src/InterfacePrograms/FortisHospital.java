package InterfacePrograms;

public class FortisHospital extends WHO implements USMedical,UKMedical,IndianMedical  {

	//USMedical
	@Override
	public void orthoServices() {
		System.out.println("FS --orthoServices");
		
	}

	@Override
	public void carioServices() {
		System.out.println("FS --carioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FS --neuroServices");		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FS --emergencyServices");
		
	}

	//UkMedical
	@Override
	public void physioServices() {
		System.out.println("FS --physioServices");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("FS --pediatricServices");
	}

	//IndiaMedical
	@Override
	public void oncologyServices() {
		System.out.println("FS --oncologyServices");
		
	}

	@Override
	public void radioServices() {
		System.out.println("FS --radioServices");
		
	}

	@Override
	public void pathologyServices() {
		System.out.println("FS --pathologyServices");
		
	}
	
	//fortisMedical
	
	public void medicalInsurance(){
		System.out.println("FS -- medicalInsurance");
	}

	public void OPTClinics(){
		System.out.println("FS -- OPTClinics");
	}
	
	// WHO
	
	@Override
	
	public void vaccination() {
		System.out.println("FS ---vaccination()");
	}
	
	@Override
	public void polio() {
		System.out.println("FS --Polio");
	}

}
