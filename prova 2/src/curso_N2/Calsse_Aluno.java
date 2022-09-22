package curso_N2;

public class Calsse_Aluno {
	private int 
		codigo = 0,
		idade = 0;
	
	private String 
		nome,
		cpf,
		endereco;
	
	private boolean 
		sexo;
	
	private 
		Classe_notas notas;

	
	// Métodos
	public Calsse_Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo,
			Classe_notas notas) {
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.notas = notas;
	}
	
	// Simulação de aprovado ou reprovado no IF
	public String getSituacao(){
		if (notas.getMedia() >= 6){return "Aprovado";}else{return "Reprovado";}
	}
// codigo set e get
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
// idade set e get 
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
//nome set e get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
//cpf set e get 
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
//endereço set e get
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
//sexo set e get
	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Classe_notas getNotas() {
		return notas;
	}

	public void setNotas(Classe_notas notas) {
		this.notas = notas;
	}
// tostring
	@Override
	public String toString() {
		return "Calsse_Aluno [codigo=" + codigo + ", idade=" + idade + ", nome=" + nome + ", cpf=" + cpf + ", endereco="
				+ endereco + ", sexo=" + sexo + ", notas=" + notas + "]";
	}
	
	
	
	
	
	
	

}
