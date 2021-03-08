
public class TipoInt  implements Comparable <TipoInt>{
	private int chave;
	private int valor;
	
	public TipoInt(int chave, int valor) {
		this.chave = chave;
		this.valor = valor;
	}
	public TipoInt() {}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public int compareTo(TipoInt I) {
		TipoInt n = I;
		if(this.getValor() == n.getValor()) {
			return 0;
		}
		else if(this.getValor() > n.getValor()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
