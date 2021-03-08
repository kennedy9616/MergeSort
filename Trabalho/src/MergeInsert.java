
public class MergeInsert  extends MergeSort {
    public void insertSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }
    public void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
	public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
	
	  public Comparable[] mergeSortMain (Comparable[] v, Comparable[] auxV, int inicio, int fim){
		    int meio;
		    if(inicio < fim)
		    	if((fim -inicio + 1)  >= 15){
		    		meio = (inicio+fim)/2;
		    		mergeSortMain(v, auxV, inicio, meio);
		    		mergeSortMain(v, auxV, meio+1, fim);
		    		merge(v, auxV, inicio, meio, fim);
		    }else {
		    		insertSort(v, inicio, fim);
		    }
		    return v;
	  }
	
}
