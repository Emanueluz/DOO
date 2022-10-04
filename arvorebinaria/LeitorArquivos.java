package arvorebinaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 public class LeitorArquivos<Tipo extends Comparable<Tipo>>{
    public static final int ler = 0;

    public ArvoreBinaria<Tipo> ler(String path) throws IOException{
        Aluno<Tipo> aluno = new Aluno<Tipo>(null,null,null);
        Node<Tipo> raiz =   new Node(aluno);
        ArvoreBinaria<Tipo> arvore =new ArvoreBinaria(raiz);
        long tempoInicial = System.currentTimeMillis();
        String linha = ""; 
        BufferedReader buffRead =new BufferedReader(new FileReader(path));
        linha = buffRead.readLine();
        int numero_matriculas = Integer.parseInt(linha);
        
         linha = buffRead.readLine();
        String[] obj;
        for (int i=0;i <=numero_matriculas-1;i++){
            linha = buffRead.readLine();
            obj = linha.split(";");
            aluno=new Aluno(obj[0],obj[1],obj[2]); 
            arvore.addNode(aluno );
            System.out.println("Aluno :"+ obj);

        }
        buffRead.close();
        long tempo = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " +tempo);
        return arvore;
    }
}
