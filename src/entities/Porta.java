package entities;

public class Porta {

	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	
	public void abre() {
		System.out.println("Porta aberta");
	}
	
	public void fecha() {
		System.out.println("Porta fechada");
	}
	
	public void pinta (String s) {
		this.cor = s;
	}
	
	public boolean estaAberta() {
		if (this.aberta == true) {
			System.out.println("A porta está aberta");
		}
		else {
			System.out.println("A porta está fechada");
		}
		
		return true;
	}
	
}
