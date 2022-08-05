
public class Usuario {
	private String nome, telefone;
	private int cpf, matricula;
	
	
	public Usuario(String nome, String telefone, int cpf, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String exibirInfo() {
		return nome + " / " + telefone + " / " + cpf + " / " + matricula;
	}

	
	
	
	
	
}
