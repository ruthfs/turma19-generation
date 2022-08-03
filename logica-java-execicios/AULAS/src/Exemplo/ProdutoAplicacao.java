package Exemplo;

import java.util.Locale;

public class ProdutoAplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		ProdutoEntidade prod1 = new ProdutoEntidade ("CAMISA", "XL001", 99.99);
		RevistaEntidade prod2 = new RevistaEntidade ("Recreio", "RR0023", 25.50, "ABRIL");
		RoupaEntidade prod3 = new RoupaEntidade ("Calça","XLQ45", 95.50, "ZARA");
		DoceEntidade prod4 = new DoceEntidade ("Bala", "PG68", 2.99,"DANONE");
		
		
		
		prod3.incluirEstoque(50);
		prod4.incluirEstoque(20);
		
		prod1.incluirEstoque(10);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+ " | Estoque "+prod1.getQtdEstoque()+".");
		prod1.tirarEstoque(2);
		System.out.println("CUSTO TOTAL: R$ "+2*prod1.getValorUnitario());
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" | Estoque "+ prod1.getQtdEstoque());
		System.out.println("---------------------------");
		prod2.incluirEstoque(12);
		System.out.println("Revista: "+prod2.getDescricao()+" R$ "+prod2.getValorUnitario()+" | Editora: "+ prod2.getEditora()+" | Estoque "+prod2.getQtdEstoque());
		prod2.tirarEstoque(5);
		System.out.println("CUSTO TOTAL: R$ "+2*prod2.getValorUnitario());
		System.out.println("Revista: "+prod2.getDescricao()+" | Estoque: "+prod2.getQtdEstoque()+".");
		System.out.println("---------------------------");
		
	
	}

}
