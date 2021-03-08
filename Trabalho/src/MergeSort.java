import java.util.Arrays;
public class MergeSort <T extends Comparable<? super T>>{
	
	public Comparable[] MergeMain (Comparable[] v) {
		
		Comparable[] auxV = new Comparable[v.length];
		
		return mergeSortMain(v, auxV,0, v.length-1);
	}
	
	  public Comparable[] mergeSortMain (Comparable[] v, Comparable[] auxV, int inicio, int fim){
		
	    int meio;
	    if(inicio < fim){
	      meio = (inicio+fim)/2;
	      mergeSortMain(v, auxV, inicio, meio);
	      mergeSortMain(v, auxV, meio+1, fim);
	      
	      merge(v, auxV, inicio, meio, fim);
	    }

	    return v;
	  }
	    
		public void merge(Comparable[] v, Comparable[] auxV, int inicio, int meio, int fim) {
	      for(int k = inicio; k <= fim;k++)
	        auxV[k] = v[k];

	        int i = inicio;
	        int j = meio + 1;
	        
	        for(int k=inicio; k<=fim; k++){
	          if( i > meio) v[k]=auxV[j++];
	          else if(j>fim) v[k] = auxV[i++];
	          else if(auxV[i].compareTo(auxV[j]) <= 0 ) v[k] = auxV[i++];
	          else v[k] = auxV[j++];
	        }
	    }
	      

}
