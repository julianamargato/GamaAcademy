import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testeUnitario {

	Autor a1 = new Autor(2, "Manoel Carlos", "gustavoescritor@melhoresescritores.com.br", "https://gustavoescritor.wordpress.com");
	Livro l1 = new Livro("Eclipse", 3, 4, "Gama", 1234);

	
	@Test
	public void ConfirmarAutor() {
		
		a1.exibirInfoAutor();
		assertNotNull(a1);

	}
	@Test
	
	public void PesquisarPorAutor() {
		
		assertEquals("Manoel Carlos", a1.getNomeAutor());
		
	}
	@Test
	
	public void ConfirmarLivro() {
		
		l1.exibirLivro();
		assertNotNull(l1);

	}
	@Test
	
	public void PesquisarPorTitulo() {
		
		assertEquals("Eclipse", l1.getTitulo());
		
	}
	@Test

	public void Alterar() {
		
		l1.alterarTituloLivro("Eclipse1");
		assertEquals("Eclipse1", l1.getTitulo());
		
	}
}
	
