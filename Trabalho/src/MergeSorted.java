
public class MergeSorted extends MergeInsert {
	@Override
	  public Comparable[] mergeSortMain (Comparable[] v, Comparable[] auxV, int inicio, int fim){
		    int meio;
		    if(inicio < fim )
		    	if((fim - inicio + 1) <= 15){
		    		insertSort(v, inicio, fim);
		    }else {
		        meio = (inicio+fim)/2;
			      mergeSortMain(v, auxV, inicio, meio);
			      mergeSortMain(v, auxV, meio+1, fim);
			      if (v[meio+1].compareTo(v[meio]) >= 0) return v;
			      merge(v, auxV, inicio, meio, fim);
		    }
		    return v;
	}
		
}
