import java.io.FileNotFoundException;
import java.util.*;

public class Principal {
	public static void main(String[] args) throws FileNotFoundException {
		//TipoS item1 = new TipoS();
		TipoD item1 = new TipoD();
		//TipoInt item1 = new TipoInt();
		
		double ti = 0;
		double tf = 0;
		
		MergeSort questao1 = new MergeSort();
		MergeInsert questao2 = new MergeInsert();
		MergeSorted questao3 = new MergeSorted();
		MergeX questao4 = new MergeX();
		
		Comparable[] v = new Comparable[100000];
		
		Arquivos ler = new Arquivos();
		
		v = ler.lerArquivoDouble();
		//v = ler.lerArquivoString();
		//v = ler.lerArquivoInt();
		
		 
		 ti = System.currentTimeMillis();
		questao1.MergeMain(v);
		tf = System.currentTimeMillis();
		// printa o vetor ordenado e sua chave e valor 
		
		for (Comparable item : v) {
            item1 = (TipoD) item;
            System.out.println(item1.getChave() + " " + item1.getValor());
        }
		
		System.out.println("QUESTÃO 1: ");
		System.out.println("Tempo de Execução: "+(tf-ti)+" milisegundos");
		
		
		System.out.println("QUESTÃO 2: ");	
		 ti = System.currentTimeMillis();	
	    questao2.MergeMain(v);
	    tf = System.currentTimeMillis();
	    System.out.println("Tempo de Execução: "+(tf-ti)+" milisegundos");
	    
	    System.out.println("QUESTÃO 3: ");
	    ti = System.currentTimeMillis();	
	   	questao3.MergeMain(v);
	    tf = System.currentTimeMillis();
	    System.out.println("Tempo de Execução: "+(tf-ti)+" milisegundos");
	    
	    
	   	System.out.println("QUESTÃO 4: ");
	   	
	   	ti = System.currentTimeMillis();	
	    questao4.sort(v); 
	    tf = System.currentTimeMillis();
	    System.out.println("Tempo de Execução: "+(tf-ti)+" milisegundos");
	    
	    System.out.println("QUESTÃO JAVA: ");
	    ti = System.currentTimeMillis();	
	    Arrays.sort(v);
	    tf = System.currentTimeMillis();
	    System.out.println("Tempo de Execução: "+(tf-ti)+" milisegundos");
	    
	    
   }
}
