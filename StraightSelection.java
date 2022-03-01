public class StraightSelection {
	public static void main(String[] args){
		int unsorted[] = {18,38,64,13,12,71,26};
		int size = unsorted.length - 1;
		System.out.println("Unsortiert :");
		for(int i = 0; i<=size; i++){
			System.out.print("[" +unsorted[i]+ "]");
		}
		System.out.println();
		System.out.println("Sortiert :");
		StraightSelectionSort(unsorted,size);


	}
	/**Straight Selection Sort selektiert kleinstes Element und
	 *packt jenes an vorderste Stelle, iteriert darueber und ueber gesamtes
	 *Array**/
	public static void StraightSelectionSort(int[] arr,int length){
		/**Aeussere Schleife setzt pos_min stets auf i wert**/
		for(int i = 0; i<=length; i++){
			int pos_min = i;
			/**Innere Schleife geht ueber naechste Array Index und vergleich mit vorgaenger a[j]< a[i] **/
			for(int j= i+1; j<=length; j++){
				/**Es wird stets ueber innere Schleife iteriert bis zum Ende des Arrays und das kleinste Element wird
				 * dabei gefunden und in pos_min eingespeichert, also arr[j] in pos_min
				 * **/
				if(arr[j]<arr[pos_min]){
					/**Durch abspeicherung dieser Variable wird aber dennoch weiter iteriert, sodass man stets
					 * das KLEINSTE, nicht nur das "kleinere" Element findet**/
					pos_min = j;
				}
			}
			/**Unabhaengig von jenen Schleifen wird hier das kleinste Element in help eingespeichert
			 * und an dessen fruehere Position nun das Element aus der i-Schleife beim erste Durchlauf also 0te Index
			 * vertauscht
			 * Help variable dient hierbei als temporaerer Placeholder
			 * **/
			int help = arr[pos_min];
			arr[pos_min] = arr[i];
			arr[i] = help;
		}
		/**
		 * Einfache Printanweisung des Arrays
		 * ***/
		for(int k = 0; k<=length; k++){
			System.out.print("[ " +arr[k]+ " ]");
		}
	}
}
