
public class Autor {
	private int codAutor;
	private String nomeAutor;
	private String emailAutor;
	private String siteAutor;
	
	public Autor(int codAutor, String nomeAutor, String emailAutor, String siteAutor) {
		super();
		this.codAutor = codAutor;
		this.nomeAutor = nomeAutor;
		this.emailAutor = emailAutor;
		this.siteAutor = siteAutor;
	}

	public int getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(int codAutor) {
		this.codAutor = codAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getEmailAutor() {
		return emailAutor;
	}

	public void setEmailAutor(String emailAutor) {
		this.emailAutor = emailAutor;
	}

	public String getSiteAutor() {
		return siteAutor;
	}

	public void setSiteAutor(String siteAutor) {
		this.siteAutor = siteAutor;
	}

	@Override
	public String toString() {
		return "Autor [codAutor=" + codAutor + ", nomeAutor=" + nomeAutor + ", emailAutor=" + emailAutor
				+ ", siteAutor=" + siteAutor + "]";
	}
	
    public String exibirInfoAutor() {
		return codAutor + " / " + nomeAutor + " / " + emailAutor + " / " + siteAutor;
	}
}
