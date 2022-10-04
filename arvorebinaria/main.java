package arvorebinaria;

import arvorebinaria.LeitorArquivos;
public class main <Tipo extends Comparable<Tipo>>{
	
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria<>(null);
		arvore =  LeitorArquivos.ler ("Entradas.txt"); 

	}
}

