
public class TipoS  implements Comparable <TipoS> {
	private String chave;
	private double valor;
	
	public TipoS(String chave, double valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public TipoS() {}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public int compareTo(TipoS S) {
		TipoS s = S;
		if(this.getValor() == s.getValor()) {
			return 0;
		}
		else if(this.getValor() > s.getValor()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	/*
	public int compareTo(TipoS S) {
		TipoS string = S;
		string.getChave().toUpperCase();
		int tamString1 = this.getChave().length();
		int tamString2 = this.getChave().length();
		 if(this.getChave().equals(string.getChave())) {return 0;}
		 else {
			 int i=0;
			 while (i<tamString1 && i<tamString2) {
				 if((int) this.getChave().charAt(i) < (int) ((TipoS) S).getChave().charAt(i)) { return -1;}
				 else if ((int) this.getChave().charAt(i) > (int) ((TipoS) S).getChave().charAt(i)) { return 1;}
				 i++;
			 }
				 if (i<tamString1) { return -1;}
				 else {return 1;}
			 }
	}*/
	}
