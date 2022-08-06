import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String pesquisaAutor, pesquisaLivro;

		Usuario u = new Usuario("Ly ", "85 99634-8545 ", 66781230, 123456);

		System.out.println("Dados do Usuario: ");
		System.out.println(u.exibirInfo());

		// cadastrar autor
		Autor a = new Autor(1, "Luis", "luisescritor@melhoresescritores.com.br", "https://luisescritor.wordpress.com");
		Autor a1 = new Autor(2, "Gustavo", "gustavoescritor@melhoresescritores.com.br",
				"https://gustavoescritor.wordpress.com");
		Autor a2 = new Autor(3, "Clarisse", "clarisseescritora@melhoresescritores.com.br",
				"https://clarisseescritora.wordpress.com");

		// cadastrar livro com cod_autor
		Livro li = new Livro("Eclipse", 3, 4, "Gama", 1234);
		Livro li1 = new Livro("Testes", 1, 2, "Java", 6789);
		Livro li2 = new Livro("Automação", 3, 1, "Gama ", 2598);

		System.out.println("Autor do Livro: ");
		System.out.println(a.exibirInfoAutor());

		System.out.println("Dados do Livro: ");
		System.out.println(li2.exibirLivro());

		Exemplar e = new Exemplar(01234, false, false);

		System.out.println("Dados do Exemplar: ");
		System.out.println(e.exibirInfo2());

		Emprestimo ep = new Emprestimo(3, "08/07/2022 ", "20/07/2022 ", "30/07/2022 ");

		System.out.println("Dados do Emprestimo: ");
		System.out.println(ep.exibirInfo3());

		System.out.println("Pesquisa: por favor digite o autor:");
		pesquisaAutor = teclado.next();
		// System.out.println(pesquisaAutor);
		// System.out.println(a.getNomeAutor());

		if (pesquisaAutor.equals(a.getNomeAutor())) {

			System.out.println(a.exibirInfoAutor());

		} else {
			System.out.println("Esse Autor não está cadastrado");
		}

		System.out.println("Pesquisa: por favor digite o nome do Livro:");
		pesquisaLivro = teclado.next();

		if (pesquisaLivro.equals(li2.getTitulo())) {

			System.out.println(li2.exibirLivro());

		} else {
			System.out.println("Este Livro não está cadastrado");
		}

		teclado.close();

	}
}
