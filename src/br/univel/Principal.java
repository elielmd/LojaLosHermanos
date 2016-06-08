package br.univel;

import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {
		// metodo pegado da oracle que linha a linha de um site..
		
//		URLReader reader = new URLReader();
//		List<String> lista = reader.LerUrl();	
		
		ArquivoReader reader = new ArquivoReader();
		List<String> lista = reader.lerArquivo();
		
		ProdutoParser parser = new ProdutoParser();
		List<Produto> listaPrd = parser.getProduto(lista);
		
		listaPrd.forEach(e -> {
			System.out.println("id.......: " + e.getId());
			System.out.println("Descricao: " + e.getDescricao());
			System.out.println("Preco....: " + e.getPreco());
		});
		
		// função lambda
		/*
		 * lista.forEach(e -> System.out.println(e)); // para cada um chame de
		 * e, e passe para o codigo lista.forEach(e -> { System.out.println(e);
		 * });
		 */
		// System é uma classe statica, out é um objeto, e printl e o metodo do
		// objeto out
		//lista.forEach(System.out::println);
	}

}
