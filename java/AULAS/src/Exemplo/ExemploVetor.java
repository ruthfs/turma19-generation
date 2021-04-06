package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor=new Scanner (System.in);
		
		//String nomes[]=new String [3]; nomes [0] nomes [1] nomes [2]
		String nomes[]= {"Paulo", "Maria", "Madalena", "João", "Marcos"};
		
		for (int x=0;x<nomes.length; x++) {
			System.out.println(nomes[x]);
		}	
	}

}
