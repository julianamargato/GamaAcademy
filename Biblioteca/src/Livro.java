
public class Livro {

    private String titulo;
    private int codautor;
    private int ano;
    private int edicao;
    private String editora;
    private int isbn;

    public Livro(String titulo, int codautor, int npag, int edicao, String editora, int isbn) {
        this.titulo = titulo;
        this.codautor = codautor;
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

//    public String getAutor() {
//        return autor;
//    }
//
//    public void setAutor(String autor) {
//        this.autor = autor;
//    }
    
    public int getCodautor() {
		return codautor;
	}
	public void setCodautor(int codautor) {
		this.codautor = codautor;
	}

    public int getiIsbn() {
        return isbn;
    }

	public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getEditora() {
        return edicao;
    }
    
    public String exibirLivro() {
		return titulo + " / " + codautor + " / " + ano + " / " + edicao + " / " + editora + " / " + isbn;
	}


}