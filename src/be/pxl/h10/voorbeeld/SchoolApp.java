package be.pxl.h10.voorbeeld;

public class SchoolApp {

	public static void main(String[] args) {
		Persoon p1 = new Student();
		Student s1 = new Student();
		
		s1.setNaam("Goris");
		s1.setVoornaam("Joachim");
		
		s1.printStudent();
		
		s1.setLeerkrediet(150);
		System.out.println(s1.getLeerkrediet());
		s1.vermeerderLeerkrediet(50);
		System.out.println(s1.getLeerkrediet());
		
		s1.setLeerkrediet(100);
		System.out.println(s1.getLeerkrediet());
		s1.vermeerderLeerkrediet(10);
		System.out.println(s1.getLeerkrediet());
		
		s1.setStudentNr("1");
		s1.setOpleiding("tin");
		System.out.println(s1.getStudentNr()+" "+s1.getOpleiding());
		
		System.out.println(p1.print());
		System.out.println(Persoon.getAantal());
	}

}
