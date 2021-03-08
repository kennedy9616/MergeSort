
public class TipoD implements Comparable <TipoD>{
	private double chave;
	private String valor;
	
	public TipoD(double chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public TipoD() {}
	
	public double getChave() {
		return chave;
	}
	public void setChave(double chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public int compareTo(TipoD D) {
		TipoD d = D;
		return this.getValor().compareToIgnoreCase(d.getValor());
	}
}
