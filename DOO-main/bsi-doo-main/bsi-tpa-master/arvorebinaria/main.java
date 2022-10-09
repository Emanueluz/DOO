package arvorebinaria;

import java.io.IOException;
import java.util.Scanner;

import arvorebinaria.LeitorArquivos;
public class main <Tipo extends Comparable<Tipo>>{
	
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria<>(null);
		LeitorArquivos leitor = new LeitorArquivos<>();
		Aluno novo_aluno= new Aluno<>(null,null,null);
		String nome;
		Integer nota;
		try {
			arvore =  leitor.ler ("C:\\Users\\Rayane Pimentel\\Documents\\DOO-main\\DOO-main\\bsi-doo-main\\bsi-tpa-master\\arvorebinaria\\Entradas.txt");
		} catch (IOException e) {
 			e.printStackTrace();}
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			Scanner scanner3 = new Scanner(System.in);
			Scanner scanner4 = new Scanner(System.in);

			String matricula = "";
			int menu = 0;


 
			while(menu!=99){
				System.out.println(
				"Exibir estatísticas: digite 1.\n"+ 
				"Efetuar busca por matrícula:digite 2\n"+
				"Excluir por matrícula: digite 3\n"+
				"Incluir aluno: digite 4\n"+
				"Sair:digite 99\n"+
				"digite a sua escolha: ");
				menu =scanner.nextInt();
				if(menu==1){
					System.out.println("quantidade total de elementos:"+ arvore.enumNode(arvore.raiz));
					System.out.println("\naltura da árvore:"+  arvore.heightTree(arvore.raiz)); 
					System.out.println("\no maior elemento:"+(arvore.findMax(arvore.raiz)).getValor().getMatricula());
					System.out.println("\no menor elemento:"+arvore.findMin(arvore.raiz).getValor().getMatricula());
					System.out.println("\npior caso de busca:"+arvore.getWorst(arvore.raiz).getValor().getMatricula());
				}
				else if(menu==2){
					System.out.println("digite a matricula : ");
					matricula=scanner2.nextLine();
					
					System.out.println("Matricula : "+arvore.searchValue(arvore.raiz,matricula).getValor().getMatricula());
					System.out.println("Nome : "+arvore.searchValue(arvore.raiz,matricula).getValor().getNome());
					System.out.println("Nota : "+arvore.searchValue(arvore.raiz,matricula).getValor().getNota());
				}
				else if(menu==3){
					System.out.println("digite a matricula que quer excluir: ");
					matricula=scanner3.nextLine();
					arvore.raiz=arvore.destroyNode(arvore.raiz,matricula);
					if (arvore.searchValue(arvore.raiz,matricula) == null){
						System.out.println("Matricula excluida ");
					}
				}
				else if(menu==4){
					System.out.println("digite a matricula que quer add: ");
					matricula=scanner.nextLine();
					System.out.println("digite o nome do aluno que quer add: ");
					nome= scanner.nextLine();
					System.out.println("digite a nota do aluno que quer add: ");
					nota= scanner4.nextInt();
					novo_aluno.createAluno(novo_aluno, matricula, nome, nota);
					arvore.addNode(novo_aluno);


				}
				else if(menu==99){

				}
				else{ 
					System.out.println("DADO DE ENTRADA INVALIDO ");

				}
			


		} 

	}
}

