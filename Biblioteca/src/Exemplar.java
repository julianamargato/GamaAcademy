
public class Exemplar {
	
    private int codigo;
    private boolean cativa;
    private boolean emprestada;
    
	public Exemplar(int codigo, boolean cativa, boolean emprestada) {
		super();
		this.codigo = codigo;
		this.cativa = cativa;
		this.emprestada = emprestada;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isCativa() {
		return cativa;
	}

	public void setCativa(boolean cativa) {
		this.cativa = cativa;
	}

	public boolean isEmprestada() {
		return emprestada;
	}

	public void setEmprestada(boolean emprestada) {
		this.emprestada = emprestada;
	}
    
	 public String exibirInfo2() {
			return codigo + " / " + cativa + " / " + emprestada;
   
}
}
