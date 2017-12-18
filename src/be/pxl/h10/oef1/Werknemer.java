package be.pxl.h10.oef1;

import be.pxl.h10.voorbeeld.Persoon;

public class Werknemer extends Persoon{
	private String functie;
	private double Salaris;
	public final double MINSALARIS =1000;
	public int aantalW = 0;
	
	{
		aantalW++;
	}
	
	public Werknemer() {
		
	}
	
	public Werknemer(String n, String v) {
		this(n,v,"algemeen bediende",1800);
	}
	public Werknemer(String n, String v, String f, double s){
		setNaam(n);
		setVoornaam(v);
		setFunctie(f);
		setSalaris(s);
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public double getSalaris() {
		return Salaris;
	}

	public void setSalaris(double salaris) {
		if(salaris<MINSALARIS) {
			Salaris =MINSALARIS;
		}
		else {
			Salaris = salaris;
		}
	}
	
	public String print() {
		String retvalue = getNaam()+" "+getVoornaam()+" "+getFunctie()+" "+getSalaris();
		return retvalue;
	}
}
