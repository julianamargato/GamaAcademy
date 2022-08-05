
public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private int edicao;
    private String editora;
    private int isbn;

    public Livro(String titulo, String autor, int npag, int edicao, String editora, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
    
    public String exibirInfo1() {
		return titulo + " / " + autor + " / " + ano + " / " + edicao + " / " + editora + " / " + isbn;
	}


}