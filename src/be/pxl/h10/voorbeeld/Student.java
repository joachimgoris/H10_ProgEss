package be.pxl.h10.voorbeeld;

public class Student extends Persoon {
	private int Leerkrediet;
	private String StudentNr;
	private String Opleiding;
	
	public void printStudent() {
		System.out.println(voornaam +" "+ naam);
	}

	public int getLeerkrediet() {
		return Leerkrediet;
	}

	public void setLeerkrediet(int leerkrediet) {
		if(leerkrediet>140) {
			this.Leerkrediet = 140;
		}
		else {
			if(leerkrediet<0) {
				this.Leerkrediet = 0;
			} else {
				this.Leerkrediet = leerkrediet; 
			}
		}
		
	}
	
	public String getStudentNr() {
		return StudentNr;
	}

	public void setStudentNr(String studentNr) {
		StudentNr = studentNr;
	}

	public String getOpleiding() {
		return Opleiding;
	}

	public void setOpleiding(String opleiding) {
		Opleiding = opleiding;
	}
	
	public void vermeerderLeerkrediet(int getal) {
		setLeerkrediet(getLeerkrediet()+getal);
	}
	
	@Override
	public String print() {
		String retvalue = voornaam+" "+naam+" "+StudentNr+" "+Opleiding+" "+Leerkrediet;
		return retvalue;
	}
}
