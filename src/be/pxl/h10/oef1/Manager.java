package be.pxl.h10.oef1;

public class Manager extends Werknemer{
	private double Bonus;
	
	public Manager(String n, String v, String f, double s) {
		this(n,v,f,s,50);
	}
	
	public Manager(String n, String v, String f, double s, double b) {
		setNaam(n);
		setVoornaam(v);
		setFunctie(f);
		setSalaris(s);
		setBonus(b);
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}
}
