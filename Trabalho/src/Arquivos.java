import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivos <T extends Comparable<? super T>> {
	
		public Comparable[] lerArquivoInt () throws FileNotFoundException{
			
			TipoInt n = null;
			
	        Comparable[] vetorInt  = new Comparable[100000];
	        
	        FileReader fr = new FileReader(selecionarArquivo());
	        
	                try{
	                    
	                    BufferedReader br =  new  BufferedReader(fr);
	                    
	                    String linha = br.readLine();
	                    int i =0;
	                    
	                    while (linha != null) { 
	                    	 String[] vetor = linha.split(",");
	
	                         int chave = Integer.parseInt(vetor[0]);
	                         int valor = Integer.parseInt(vetor[1]);
	                         
	                         //System.out.println(chave + "," + valor);
	                         
	                    	  n = new TipoInt(chave, valor);
	                    	  vetorInt[i] = (Comparable) n;       	  
	                    	  i++;  
	                    	  linha = br.readLine();
	                    }
	                    System.out.println("Arquivo lido e adicionado! ");
	                }catch(IOException e){
	                    System.out.println(e);
	                }catch(NoSuchElementException e){
	                    System.out.println("Arquivo não condiz com os dados a serem analisados!");
	                }
					return vetorInt;
	 }
	public Comparable[] lerArquivoString () throws FileNotFoundException{
			
			TipoS string = null;
			
	        Comparable[] vetorString  = new Comparable[100000];
	        
	        FileReader fr = new FileReader(selecionarArquivo());
	        
	                try{
	                    
	                    BufferedReader br =  new  BufferedReader(fr);
	                    
	                    String linha = br.readLine();
	                    int i =0;
	                    
	                    while (linha != null) { 
	                    	 String[] vetor = linha.split(",");
	
	                         String chave = vetor[0];
	                         double valor = Double.parseDouble(vetor[1]);
	                         
	                         //System.out.println(chave + "," + valor);
	                         
	                    	  string = new TipoS(chave, valor);
	                    	  vetorString[i] = (Comparable) string;       	  
	                    	  i++;  
	                    	  linha = br.readLine();
	                    }
	                    System.out.println("Arquivo lido e adicionado! ");
	                }catch(IOException e){
	                    System.out.println(e);
	                }catch(NoSuchElementException e){
	                    System.out.println("Arquivo não condiz com os dados a serem analisados!");
	                }
					return vetorString;
	 }
	public Comparable[] lerArquivoDouble () throws FileNotFoundException{
		
		TipoD d = null;
		
        Comparable[] vetorDouble  = new Comparable[100000];
        
        FileReader fr = new FileReader(selecionarArquivo());
        
                try{
                    
                    BufferedReader br =  new  BufferedReader(fr);
                    
                    String linha = br.readLine();
                    int i =0;
                    
                    while (linha != null) { 
                    	 String[] vetor = linha.split(",");
                    	 
                    	 double chave = Double.parseDouble(vetor[0]);
                         String valor = vetor[1];
                         
                         //System.out.println(chave + "," + valor);
                         
                    	  d = new TipoD(chave, valor);
                    	  
                    	  vetorDouble[i] = (Comparable) d;       	  
                    	  i++;  
                    	  linha = br.readLine();
                    }
                    System.out.println("Arquivo lido e adicionado! ");
                }catch(IOException e){
                    System.out.println(e);
                }catch(NoSuchElementException e){
                    System.out.println("Arquivo não condiz com os dados a serem analisados!");
                }
				return vetorDouble;
 }

    public  String selecionarArquivo() throws FileNotFoundException{
    	String endereco;
        JFileChooser seletor = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de texto", "txt", "csv", "cpp", "java");
        
        seletor.setFileFilter(filtro);
        seletor.addChoosableFileFilter(filtro);
        
        seletor.setDialogTitle("Selecione um arquivo...");
        seletor.showOpenDialog(new JFrame("")); 
        seletor.setVisible(true);
        
        endereco = seletor.getSelectedFile().getAbsolutePath();
        
        return endereco;
    }
}