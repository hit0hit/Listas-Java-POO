package exercicio5;

public class Estoque {
	private String nome;
	private int qtdAtual,qtdMinima;

	public Estoque() {}
	public Estoque(String nome,int qtdAtual, int qudMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	void mudarNome(String nome) {
		this.nome = nome;
		
	}
	void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
		
	}
	void repor(int qtd) {
		this.qtdAtual = qtd;
		this.qtdAtual = qtdAtual+qtdMinima;
		
	}
	void darBaixa(int qtd) {
		this.qtdAtual = qtd;
		this.qtdAtual = qtdAtual-qtdMinima;
		
	}
		
	public String mostra() {
		return "\nnome: "+this.nome +"\nqtdMinima: "+ this.qtdMinima +"\nqtdAtual: "+ this.qtdAtual;
		
		
	}
		public boolean precisaRepor() {
		if(this.qtdAtual <= this.qtdMinima) {return true;}
	else {
		return false;
	}
	
		
	
}
}