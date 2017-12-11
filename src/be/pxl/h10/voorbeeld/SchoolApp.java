package be.pxl.h10.voorbeeld;

public class SchoolApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();
		Student s1 = new Student();
		
		s1.setNaam("Goris");
		s1.setVoornaam("Joachim");
		
		s1.printStudent();
	}

}
