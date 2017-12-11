package be.pxl.h10.voorbeeld;

public class Persoon {
	private String naam;
	private String voornaam;
	
	//Constructors
	public Persoon() {
		this("onbekend","onbekend");
	}
	
	public Persoon(String naam, String voornaam) {
		setNaam(naam);
		setVoornaam(voornaam);
	}

	//getters-setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
}
