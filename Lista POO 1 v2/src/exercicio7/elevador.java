package exercicio7;

public class elevador {
	private int andar;
	private int totalAndar;
	private int capacidade;
	private int qntPessoas;
	
	public void Elevador(int capacidade, int totalAndar){
		Inicializa(capacidade, totalAndar);
	}
	
	public String toString(){
		return "Andar Atual: " + this.imprimeAndarAtual()
				+ "\nQnt de Pessoas: " + this.qntPessoas
				+ "\nTotal de Andares: " + this.totalAndar
				+ "\nQnt Máxima de Pessoas: " + this.capacidade
				+ "\n--------------------------------------\n";
	}
	
	public void Inicializa(int capacidade, int totalAndar){
		this.capacidade = capacidade;
		this.totalAndar = totalAndar;
		this.andar = 0;
		this.qntPessoas = 0;
	}
	
	public void Entra(){
		if(this.qntPessoas < this.capacidade){
			this.qntPessoas++;
		}
	}
	
	public void Sai(){
		if(this.qntPessoas > 0){
			this.qntPessoas--;
		}
	}
	
	public void Sobe(){
		if(this.andar < this.totalAndar){
			this.andar++;
		}
	}
	
	public void Desce(){
		if(this.andar > 0){
			this.andar--;
		}
	}
	
	public String imprimeAndarAtual(){
		if(this.andar == 0){
			return "Térreo";
		}
		else {
			return "" + this.andar;
		}
	}
	
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getTotalAndar() {
		return totalAndar;
	}
	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQntPessoas() {
		return qntPessoas;
	}
	public void setQntPessoas(int qntPessoas) {
		this.qntPessoas = qntPessoas;
	}
	

}
