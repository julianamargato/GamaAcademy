

public class Emprestimo {
	private int situacao;
    private String dataDeEmprestimo, dataPrevistaDeDevolucao, dataDeEntregaReal;
    

	public Emprestimo(int situacao, String dataDeEmprestimo, String dataPrevistaDeDevolucao, String dataDeEntregaReal) {
		super();
		this.situacao = situacao;
		this.dataDeEmprestimo = dataDeEmprestimo;
		this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
		this.dataDeEntregaReal = dataDeEntregaReal;
	}

	
	
	
    
	 public int getSituacao() {
		return situacao;
	}





	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}





	public String getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}





	public void setDataDeEmprestimo(String dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}





	public String getDataPrevistaDeDevolucao() {
		return dataPrevistaDeDevolucao;
	}





	public void setDataPrevistaDeDevolucao(String dataPrevistaDeDevolucao) {
		this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
	}





	public String getDataDeEntregaReal() {
		return dataDeEntregaReal;
	}





	public void setDataDeEntregaReal(String dataDeEntregaReal) {
		this.dataDeEntregaReal = dataDeEntregaReal;
	}





	public String exibirInfo3() {
			return situacao + " / " + dataDeEmprestimo + " / " + dataPrevistaDeDevolucao + " / " + dataDeEntregaReal;
    
	
    
    
	 } 

}
