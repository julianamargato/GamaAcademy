

public class Biblioteca {
	public static void main(String[] args) {
		
		Usuario u = new Usuario("Ly ", "85 99634-8545 ", 66781230, 123456);
		
		System.out.println("Dados do Usuario: ");
		System.out.println(u.exibirInfo());
		
		// cadastrar autor
		Autor a = new Autor(1, "Prof. Luis", "luisescritor@melhoresescritores.com.br", "https://luisescritor.wordpress.com");
		
		// cadastrar livro com cod_autor
		Livro li = new Livro("Eclipse ", 1, 2022, 01, "Gama ", 1234);
		
		System.out.println("Autor do Livro: ");
		System.out.println(a.exibirInfoAutor());
		
		System.out.println("Dados do Livro: ");
		System.out.println(li.exibirLivro());
		
		Exemplar e = new Exemplar(01234, false, false);
		
		System.out.println("Dados do Exemplar: "); 
		System.out.println(e.exibirInfo2());
		
		Emprestimo ep = new Emprestimo( 3, "08/07/2022 ", "20/07/2022 ", "30/07/2022 ");
		
		System.out.println("Dados do Emprestimo: ");
		System.out.println(ep.exibirInfo3());
	}

}
