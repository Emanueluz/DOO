package arvorebinaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import arvorebinaria.*;


public class manipular <Tipo extends Comparable<Tipo>>{
     public void leitura(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        linha = buffRead.readLine();
        int numero_matriculas = Integer.parseInt(linha);
        linha = buffRead.readLine();
        Tipo obj = (Tipo) linha;
        Node raiz=new Node(null);

        ArvoreBinaria.addNode( ((Comparable<Tipo>) raiz.getValor()).compareTo(obj));   
        for (int i=0;i <=numero_matriculas-1;i++){
           linha = buffRead.readLine();
            obj = linha.split( ";");
            Node no_filho = new Node(obj[0]);
            no_filho=createNode(no,(Tipo)obj[0] );
            no=no_filho;
        }
		buffRead.close();
     
  



    }
 

 



}