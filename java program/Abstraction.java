abstract class Doctor{
	abstract void Doctor_Details(); 
	abstract void patient_details();
	void consultation_details(){
		System.out.println("Consultation details");
	}
}
class Dentist extends Doctor{
	void Doctor_details() {
		System.out.println("Doctor details..");
	}
	void patient_details() {
		System.out.println("Patient details");
	}
}
class Abstraction{
	public static void main(String[] args) {
		Dentist a = new Dentist();
		a.Doctor_details();
		a.patient_details();
		a.consultation_details();
	}
}