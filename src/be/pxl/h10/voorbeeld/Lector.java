package be.pxl.h10.voorbeeld;

public class Lector extends Persoon {
	private String PersoneelsNr;
	private double AanstellingsPercentage;
	private double salaris;
	
	public Lector(String n, String v, String p, double a, double s) {
		setNaam(n);
		setVoornaam(v);
		setPersoneelsNr(p);
		setAanstellingsPercentage(a);
		salaris = s;
	}
	
	public Lector(String n, String v, double a, double s) {
		this(n,v,"20009999",a,s);
	}
	
	public Lector() {
		this("onbekend","onbekend","20009999",2000,1);
	}
	
	public String getPersoneelsNr() {
		return PersoneelsNr;
	}
	public void setPersoneelsNr(String personeelsNr) {
		PersoneelsNr = personeelsNr;
	}
	public double getAanstellingsPercentage() {
		return AanstellingsPercentage;
	}
	public void setAanstellingsPercentage(double aanstellingsPercentage) {
		if(aanstellingsPercentage>1) {
			AanstellingsPercentage = 1;
		}
		else {
			if(aanstellingsPercentage<0) {
				AanstellingsPercentage = 0;
			}
			else {
				AanstellingsPercentage = aanstellingsPercentage;
			}
		}
		setSalaris(getSalaris());
	}
	public double getSalaris() {
		return salaris;
	}
	public void setSalaris(double salaris) {
		this.salaris = salaris*(1.0+getAanstellingsPercentage()); 
	}
	
	@Override
	public String print() {
		String retvalue = voornaam+" "+naam+" "+PersoneelsNr+" "+AanstellingsPercentage+" "+salaris;
		return retvalue;
	}
	

}
