package entities;

public class Casa {
	
	public String cor;
	public Boolean porta1;
	public Boolean porta2;
	public Boolean porta3;
	
	public void pinta (String s) {
		this.cor = "A cor da casa é " + s;
	}
	
	public int quantasPortasEstaoAbertas() {
		int qntd = 0;
		if (porta1 == true) {
			qntd += 1;
		}
		if (porta2 == true) {
			qntd += 1;
		}
		if (porta3 == true) {
			qntd += 1;
		}
		return qntd;
	}
}
