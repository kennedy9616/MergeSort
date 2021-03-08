
public class MergeX extends MergeSorted{
	
    public void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        mergeSortMain(aux, a, 0, a.length-1);
    }
	@Override
	  public Comparable[] mergeSortMain (Comparable[] v, Comparable[] auxV, int inicio, int fim){
	    int meio;
	    if(inicio < fim)
	    	if((fim - inicio + 1)  <= 15){
	    		insertSort(v, inicio, fim);
	    }else {
	    	 meio = (inicio+fim)/2;
		      mergeSortMain(auxV,v, inicio, meio);
		      mergeSortMain(auxV,v, meio+1, fim);
		      if (v[meio+1].compareTo(v[meio]) >= 0) return v;
		      merge(v, auxV, inicio, meio, fim);
	    }
	    return v;
	  }
	@Override
	public void merge(Comparable[] v, Comparable[] auxV, int inicio, int meio, int fim) {

	        int i = inicio;
	        int j = meio + 1;

	        for(int k=inicio; k<=fim; k++){
	          if( i > meio) auxV[k] = v[j++];
	          else if(j>fim)auxV[k] = v[i++];
	          else if(v[j].compareTo(v[i]) <= 0 ) auxV[k] = v[j++];
	          else auxV[k] = v[i++];
	        }
	    }
	      

}
